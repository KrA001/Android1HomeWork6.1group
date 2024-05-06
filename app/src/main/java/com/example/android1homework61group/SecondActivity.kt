package com.example.android1homework61group

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.android1homework61group.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    private val adapter = ClassAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initialize()

    }

    private fun initialize() = with(binding){
        rvSecond.adapter = adapter
        adapter.setList(aestheticsList())
    }

    private fun aestheticsList() = listOf(
        DataAdapter(R.drawable.img,"Орлан"),
        DataAdapter(R.drawable.img_1,"Орлан1"),
        DataAdapter(R.drawable.img_2,"Орлан2"),
        DataAdapter(R.drawable.img_3,"Орлан3"),
        DataAdapter(R.drawable.img_3,"Орлан4"),
        DataAdapter(R.drawable.img_4,"Орлан5"),
        DataAdapter(R.drawable.img_5,"Орлан6")

    )
}