package com.noobsverse.helloworld
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        // Call the superclass onCreate to complete the creation of
        // the activity, like the view hierarchy.
        super.onCreate(savedInstanceState)

        // Set the user interface layout for this activity.
        // The layout is defined in the project res/layout/main_activity.xml file.
        setContentView(R.layout.activity_main)


    }

}