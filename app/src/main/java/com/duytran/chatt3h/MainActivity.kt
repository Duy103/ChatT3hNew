package com.duytran.chatt3h

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.duytran.chatt3h.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val mBinding: ActivityMainBinding by lazy { binding }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        mBinding.recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = ChatAdapter(
                listOf(
                    Chat("Hello World 1", "12:30"),
                    Chat("Hello World 2", "12:32"),
                    Chat("Hello World 3", "12:35"),
                    Chat("Hello World 4", "12:36"),
                    Chat("Hello World 5", "12:38"),
                    Chat("Hello World 6", "12:39"),
                    Chat("Hello World 7", "12:40"),
                    Chat("Hello World 8", "12:31"),
                    Chat("Hello World 9", "12:32"),
                    Chat("Hello World 10", "12:40"),
                    Chat("Hello World 11", "12:43"),
                    Chat("Hello World 12", "12:44"),
                    Chat("Hello World 13", "12:45"),
                    Chat("Hello World 14", "12:46"),
                    Chat("Hello World 15", "12:47"),
                    Chat("Hello World 16", "12:48"),
                    Chat("Hello World 17", "12:49"),

                )
            )
        }
    }
}