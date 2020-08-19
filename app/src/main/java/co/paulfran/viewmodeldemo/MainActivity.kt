package co.paulfran.viewmodeldemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import co.paulfran.viewmodeldemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        viewModel.totalCount.observe(this, Observer {
            binding.countText.text = it.toString()
        })
        binding.increaseCountButton.setOnClickListener {

            viewModel.updateCount()
        }
        println("=== onCreate Called ===")
    }

    override fun onStart() {
        super.onStart()
        println("=== onStart called ===")
    }

    override fun onResume() {
        super.onResume()
        println("=== onResume Called ===")
    }

    override fun onPause() {
        super.onPause()
        println("=== onPause Called ===")
    }

    override fun onStop() {
        super.onStop()
        println("=== onStop Called ===")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("=== onDestroy ===")
    }


}