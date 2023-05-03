package com.emilabdurahmanli.recyclerviewtest

import android.graphics.drawable.GradientDrawable.Orientation
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.SimpleAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.emilabdurahmanli.recyclerviewtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var list : List<String> = mutableListOf("Emil", "Ennagi", "Zireddin","Emil", "Ennagi", "Zireddin","Emil", "Ennagi", "Zireddin","Emil", "Ennagi", "Zireddin","Emil", "Ennagi", "Zireddin","Emil", "Ennagi", "Zireddin","Emil", "Ennagi", "Zireddin","Emil", "Ennagi", "Zireddin","Emil", "Ennagi", "Zireddin","Emil", "Ennagi", "Zireddin","Emil", "Ennagi", "Zireddin","Emil", "Ennagi", "Zireddin","Emil", "Ennagi", "Zireddin","Emil", "Ennagi", "Zireddin"
    )
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpRecyclerView()
    }


    fun setUpRecyclerView(){
        var adapter = Adapter(list)
        binding.recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.recyclerView.adapter = adapter

    }

}