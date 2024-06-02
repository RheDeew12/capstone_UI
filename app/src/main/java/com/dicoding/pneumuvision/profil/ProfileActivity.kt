package com.dicoding.pneumuvision.profil

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.pneumuvision.R

class ProfileActivity : AppCompatActivity() {

    private lateinit var editProfileLayout: View
    private lateinit var logoutLayout: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Initialize views
        editProfileLayout = findViewById(R.id.editProfileLayout)
        logoutLayout = findViewById(R.id.logoutLayout)

        editProfileLayout.setOnClickListener {
            // Navigate to Edit Profile Activity
            startActivity(Intent(this, EditActivity::class.java))
        }

        logoutLayout.setOnClickListener {
            // Log out and navigate to Welcome Activity
            Toast.makeText(this, "Logged out", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, WelcomeActivity::class.java))
            finish()
        }
    }
}
