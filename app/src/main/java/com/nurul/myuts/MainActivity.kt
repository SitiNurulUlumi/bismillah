package com.nurul.myuts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvPakaian: RecyclerView
    private val list = ArrayList<PakaianAdat>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPakaian=findViewById(R.id.adat)
        rvPakaian.setHasFixedSize(true)

        list.addAll(PakaianAdatData.listData)
        showRecyclerView()
    }

    private fun showRecyclerView() {
        rvPakaian.layoutManager=LinearLayoutManager(this)
        val listPakaian = PakaianAdatAdapter(list)
        rvPakaian = listPakaian
    }
}