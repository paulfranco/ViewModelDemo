package co.paulfran.viewmodeldemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import co.paulfran.viewmodeldemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        binding.countText.text = viewModel.getCurrentCount().toString()
        binding.increaseCountButton.setOnClickListener {

            binding.countText.text = viewModel.getUpdatedCount().toString()
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