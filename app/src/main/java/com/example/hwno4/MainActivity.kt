package com.example.hwno4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationMenuView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navigationMenu = findViewById<BottomNavigationMenuView>(R.id.navigationMenu)

        val controller = findNavController(R.id.nav_host_fragment_container)

        AppBarConfiguration(
            setOf(
                R.id.home,
                R.id.notes,
                R.id.password_keeper
            )
        )

        setupActionBarWithNavController(controller, appBarConfiguration) //ha?
        navigationMenu.setupWithNavController(navController = controller) //what?

    }
}