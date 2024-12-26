package com.example.myapplicationmodule

import ModuleBottomSheetFragment
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val moduleButton: Button = findViewById(R.id.mButton)

        moduleButton.setOnClickListener {
            // Open the BottomSheet when the button is clicked
            val bottomSheetFragment = ModuleBottomSheetFragment()
            bottomSheetFragment.show(supportFragmentManager, bottomSheetFragment.tag)
        }
    }
}