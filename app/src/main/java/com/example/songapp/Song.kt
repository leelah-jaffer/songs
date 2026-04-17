package com.example.songapp

import android.util.Log

class Song {
    // the properties
    var name: String = ""
    var artists: String = ""
    var year: Int = 0
    var duration: String = ""

    //function to play song
    fun play(){
        Log.v("Song", "$name is playing")

    }

    //function to pause song
    fun Pause(){
        Log.v("Song", "$name is paused")


    }

    //function to stop song
    fun Stop(){
        Log.v("Song", "$name is stopped")


    }

    //function to favourite song
    fun favourite() : Boolean{
        Log.v("Song", "$name is favourite")
        //Boolean made true
        return true


    }

}