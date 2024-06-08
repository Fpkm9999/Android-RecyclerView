package com.example.recyclerview01

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: CustomAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // Sample Data
        val users = listOf(
            User("PAKA", 30),
            User("Ralo", 30),
            User(name = "Jiwan", age = 30)
        )
        adapter = CustomAdapter(users)
//        binding.recyclerView.layoutManager = LinearLayoutManager(this) // RecyclerView 의 아이템 배치 방식을 결정
        binding.recyclerView.layoutManager = GridLayoutManager(this,2) // RecyclerView 의 아이템 배치 방식을 결정
        binding.recyclerView.adapter = adapter
    }
}