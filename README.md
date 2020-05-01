# Developing Android Apps with Kotlin

Gradle is a build tool, like babel


## Lesson 2

## Lesson 3 - App Navigation

### Fragments
* A fragment is like a component in react application. Just like you have many different screens with the same navbar, you can do that using fragments in android.
* You can swap fragments for other fragments in a screen, displaying multiple screens without changing the whole activity.

### How to add a fragment to a view?
You need 3 pieces for this puzzle:
* An existing `activity.xml` file.
* A `fragment.xml` file.
* A `fragment class` kotlin file.

1. Create a fragment class, inflate the xml file you'd like to inflate inside this fragment class.
2. Create a new `<fragment>` tag inside of `<LinearLayout>` and set its `android:name=` fragment class you created, the full path.

Example: `com.example.android.navigation.TitleFragment`. 

### Principles of navigation
1. App should have a fixed starting activity. Always.
2. Add new activities to, navigate to, to a stack(backstack).
3. Up button always takes user to the previous destination.

