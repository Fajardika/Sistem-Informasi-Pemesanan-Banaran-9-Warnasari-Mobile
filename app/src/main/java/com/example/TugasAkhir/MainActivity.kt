package com.example.TugasAkhir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.ButtonBarLayout
import androidx.fragment.app.Fragment
import com.example.TugasAkhir.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var navigation: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
        navigationListener()
        var fr = supportFragmentManager.beginTransaction()
        fr.replace(R.id.fl_fragment, HomeFragment())
        fr.commit()
    }
    private fun init(){
        navigation = findViewById(R.id.bottom_nav)
    }
    private fun navigationListener(){
        navigation.setOnItemReselectedListener { item ->
            var seletedFr: Fragment = HomeFragment()
            when (item.itemId){
                R.id.item_home -> {
                    seletedFr = HomeFragment()
                }
                R.id.item_list_makanan -> {
                    seletedFr = MakananFragment()
                }
                R.id.item_list_minuman -> {
                    seletedFr = MinumanFragment()
                }
                R.id.item_list_gallery -> {
                    seletedFr = GalleryFragment()
                }
                R.id.item_list_info -> {
                    seletedFr = InfoFragment()
                }
            }
            var fr = supportFragmentManager.beginTransaction()
            fr.replace(R.id.fl_fragment, seletedFr)
            fr.commit()
            true
        }
    }
}

