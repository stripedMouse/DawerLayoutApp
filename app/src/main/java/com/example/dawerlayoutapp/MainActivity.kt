package com.example.dawerlayoutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.example.dawerlayoutapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {

            bOpen.setOnClickListener {
                drawer.openDrawer(GravityCompat.START)
            }
            navView.setNavigationItemSelectedListener {

                when(it.itemId){

                    R.id.item1 -> {
                        Toast.makeText(this@MainActivity, "Item 1", Toast.LENGTH_SHORT).show()
                    }
                    R.id.item2 -> Toast.makeText(this@MainActivity, "Item 2", Toast.LENGTH_SHORT).show()
                    R.id.item22 -> Toast.makeText(this@MainActivity, "Item 22", Toast.LENGTH_SHORT).show()

                }
                drawer.closeDrawer(GravityCompat.START)
                true
            }

        }
    }
}