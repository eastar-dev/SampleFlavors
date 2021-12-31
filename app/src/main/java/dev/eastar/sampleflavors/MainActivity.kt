package dev.eastar.sampleflavors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.eastar.lib.LibFlavorMain
import dev.eastar.lib.LibFlavorTest
import dev.eastar.sampleflavors.databinding.ActivityMainBinding
import flavors.FlavorsTest

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bb.root)
        bb.test.text = FlavorsTest.flavors
        bb.test2.setText(R.string.lib_flavors_test)
//        bb.test3.text = LibFlavorTest.flavor
        bb.test3.text = LibFlavorMain.test()
    }
}