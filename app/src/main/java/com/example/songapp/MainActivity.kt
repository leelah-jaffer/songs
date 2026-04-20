package com.example.songapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.songapp.Song //only if you have issues if the package have completely different names

//the main activity is where we do everything, taking the blueprints and executing the actions that is happening in the classes

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var songShow = findViewById<TextView>(R.id.songDisplayId)
        var songDisplay = ""

        //Accessing song class with specific attributes
        var song1 = Song("Snooze", "Sza", 2022,
            "3.15")
        var song2 = Song("Treasure", "Bruno Mars",
            2012, "3.45")
        var song3 = Song("Shape of You", "Ed Shereen")

       // creating array to hold song objects. (these songs objects, we defined in our song class)
        var songs = arrayOf<Song>(song1, song2, song3)

        for (song in songs){
            songDisplay += "${song.play()}\n\n"
        }

        songShow.text = songDisplay




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}