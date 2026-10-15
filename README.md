EXPERIMENT 4: IMPLEMENTATION OF INTENTS IN ANDROID

Aim

To develop an Android application using an explicit Intent to transfer data from one Activity to another.

Objective

To understand the concept of Intents in Android.

To implement explicit Intent navigation between Activities.

To pass data between Activities using putExtra().

To retrieve data using getStringExtra().

To display the received user details on the second screen.

Theory

An Intent is a messaging object used to request an action from another Android component.

An Explicit Intent specifies the exact Activity or component that should be started.

The putExtra() method passes data through an Intent, while getStringExtra() retrieves string data from the Intent in the destination Activity.

The startActivity() method launches the target Activity.

Technologies Used

Android Studio

Kotlin

XML

Android SDK

Project Structure

app/
├── src/main/
│   ├── java/com/example/intent_exp4/
│   │   ├── MainActivity.kt
│   │   └── SecondActivity.kt
│   ├── res/
│   │   └── layout/
│   │       ├── activity_main.xml
│   │       └── activity_second.xml
│   └── AndroidManifest.xml
└── build.gradle.kts

Procedure

Create a new Android project using the Empty Views Activity template.

Design activity_main.xml with input fields for Name and USN and a Submit button.

Implement MainActivity.kt to read the entered details.

Create SecondActivity.kt to receive and display the data.

Design activity_second.xml with a TextView for displaying the received details.

Create an explicit Intent targeting SecondActivity.

Pass Name and USN using putExtra().

Retrieve the values using getStringExtra().

Declare the second Activity in AndroidManifest.xml.

Run the application and verify that the entered details appear on the second screen.

Important Code Snippets

1. Sending Data — MainActivity.kt

val intent = Intent(this, SecondActivity::class.java)

intent.putExtra("USER_NAME", name)
intent.putExtra("USER_USN", usn)

startActivity(intent)

2. Receiving Data — SecondActivity.kt

val name = intent.getStringExtra("USER_NAME")
val usn = intent.getStringExtra("USER_USN")

findViewById<TextView>(R.id.txtDetails).text =
    "Name: $name\nUSN: $usn"

Test Cases

Test Case

Action

Expected Result

TC01

Launch the application

Input screen appears

TC02

Enter Name and USN

Details are accepted

TC03

Click Submit

Second Activity opens

TC04

Retrieve Intent extras

Name and USN appear correctly

Output

The first screen accepts the user's Name and USN. After clicking Submit, the second screen displays the received details.

Example:

Welcome!

Name: Akriti Shankar
USN: 25MCAR0087

Result

The Android application was successfully developed to demonstrate explicit Intent navigation and data transfer between two Activities using putExtra() and getStringExtra().

Conclusion

This experiment demonstrated how explicit Intents are used to navigate between Android Activities and transfer data using Intent extras.
