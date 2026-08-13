EXP4_LOGIN – Android Intent Activity Linking

Project Overview

This Android application demonstrates **linking two Activities using Explicit Intents** in Android Studio.

The application provides a simple login screen where the user enters their **User Name** and **USN**. After clicking the Login button, the application uses an Intent to open the second Activity and displays the entered details.

Aim

To implement linking of Activities using **Intents** in Android Studio and pass data from one Activity to another.

 Features

* Simple and modern Login UI
* User Name input
* USN input
* Explicit Intent for Activity navigation
* Passing data between Activities using `putExtra()`
* Receiving data using `getStringExtra()`
* Displaying User Name and USN on the second screen

 Technologies Used

Android Studio
Kotlin
XML
Android SDK
Explicit Intent

 Project Structure


EXP4_LOGIN/
│
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/
│   │       │   └── <package-name>/
│   │       │       ├── MainActivity.kt
│   │       │       └── SecondActivity.kt
│   │       │
│   │       ├── res/
│   │       │   ├── drawable/
│   │       │   │   ├── login_card.xml
│   │       │   │   ├── edittext_background.xml
│   │       │   │   └── login_button.xml
│   │       │   │
│   │       │   ├── layout/
│   │       │   │   ├── activity_main.xml
│   │       │   │   └── activity_second.xml
│   │       │   │
│   │       │   └── values/
│   │       │       └── strings.xml
│   │       │
│   │       └── AndroidManifest.xml
│   │
│   ├── build.gradle.kts
│   └── proguard-rules.pro
│
├── gradle/
├── build.gradle.kts
├── settings.gradle.kts
├── gradlew
├── gradlew.bat
└── .gitignore


 The exact package name may vary depending on the package created in Android Studio.

 Application Flow


              Login Screen
                   │
                   │
          Enter User Name + USN
                   │
                   ▼
              Login Button
                   │
                   ▼
             Explicit Intent
                   │
          ┌────────┴────────┐
          │                 │
     USER_NAME          USER_USN
      putExtra()         putExtra()
          │                 │
          └────────┬────────┘
                   ▼
             SecondActivity
                   │
                   ▼
          Display User Name
                and USN


 Intent Implementation

Sending Data

The first Activity creates an explicit Intent and sends the User Name and USN:


val intent = Intent(this, SecondActivity::class.java)

intent.putExtra("USER_NAME", name)
intent.putExtra("USER_USN", usn)

startActivity(intent)


Receiving Data

The second Activity retrieves the values:

val name = intent.getStringExtra("USER_NAME")
val usn = intent.getStringExtra("USER_USN")
```

The values are then displayed using `TextView`.

How to Run

1. Open the project in **Android Studio**.
2. Allow Gradle to complete synchronization.
3. Connect an Android device or start an Android Emulator.
4. Click **Run ▶**.
5. Enter the User Name.
6. Enter the USN.
7. Click **LOGIN**.
8. The second Activity opens and displays the entered User Name and USN.
Login Screen


Welcome Back
Login to continue

User Name
[ Enter your name ]

USN
[ Enter your USN ]

[ LOGIN ]
```

Second Activity


Welcome!

Your profile details

USER NAME
Akriti

USN
25MCAR0087
```

Concepts Demonstrated

* Android Activities
* Activity Lifecycle – basic `onCreate()`
* Explicit Intent
* `startActivity()`
* `putExtra()`
* `getStringExtra()`
* XML Layouts
* `EditText`
* `TextView`
* `Button`
* Android Manifest

 Result

The application successfully demonstrates **linking Activities using an Explicit Intent**. The User Name and USN entered in the Login Activity are passed to the Second Activity and displayed successfully.



Akriti Shankar*
