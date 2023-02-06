package com.example.android2dop2.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android2dop2.databinding.ActivityMainBinding
import com.example.android2dop2.ui.adapter.TabLayoutAdapter
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        tabLayout = findViewById(R.id.tab_layout)
//        viewPager2 = findViewById(R.id.view_pager)
        val adaptor = TabLayoutAdapter(supportFragmentManager,lifecycle)
        binding.viewPager.adapter = adaptor

        TabLayoutMediator(binding.tabLayout,binding.viewPager) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "First"
                }
                1 -> {
                    tab.text = "Second"
                }
            }
        }.attach()
    }
}