# Example for issue in Room documentation

See https://issuetracker.google.com/u/1/issues/79443867 for details.

This project shows that a piece of example code that is given in
[the documentation](https://developer.android.com/training/data-storage/room/defining-data#indices-uniqueness)
of the Room library does not compile. It makes that example harder to understand.

To see the compilation error you can try to run the project as an Android app in Android Studio *or* run
`./gradlew build` from the command line. It should show the error message:
```
app/src/main/java/com/kirshboim/roomdocserror/User.java:14: error: name referenced in the index does not exists in the Entity. Available column names:id, firstName, address, last_name
public class User {
       ^
```
If `firstName` is used instead of `name` the code compiles.