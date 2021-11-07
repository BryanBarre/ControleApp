package fr.mastersid.barre.controleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import fr.mastersid.barre.controleapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity () {
    override fun onCreate ( savedInstanceState : Bundle ?) {
        super . onCreate ( savedInstanceState )
        val binding = ActivityMainBinding.inflate ( layoutInflater )
        setContentView ( binding . root )
    }
}