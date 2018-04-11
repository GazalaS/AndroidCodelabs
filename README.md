### Hello, World!
Create an application that shows a single button to the user with the text “Say hello!”. Once pressed, the application will display a dialog (using an AlertDialog from the support library) that displays the message “Hello, World!”.
The advanced version of this application will display a text input field (using an EditText widget) together with the button. Once the button is pressed, the text from the input field is read and checked. If the text is null or empty, the dialog displays “Hello, World!”, otherwise the dialog should display the message “Hello, <name>!” (where <name> is the value from the text input field).

### DisplayImages Android Application : List of kittens
The goal for this code lab is to create an application that will show a number of photos (of kittens) in a list or a grid. 
Start by implementing a RecyclerView, an adapter and it’s item view. Next, put a single image into the application drawables that you will reuse for 10 items in the RecyclerView. Experiment with modifying the properties of the RecyclerView and changing its layout manager.
Next, as an advanced version of this code lab, put several images (of kittens) on the media store of the emulator or device and load all of those into the list using the MediaStore API and Picasso (See previous Image picker codelab).

