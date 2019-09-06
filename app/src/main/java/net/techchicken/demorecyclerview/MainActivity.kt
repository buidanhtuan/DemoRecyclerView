package net.techchicken.demorecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView : RecyclerView
    lateinit var adapter: RecyclerViewAdapter
    val list: List<Flower> = listOf(
        Flower(R.drawable.hoa_cuc, "hoa cúc"),
        Flower(R.drawable.hoa_dao, "hoa đào"),
        Flower(R.drawable.hoa_hong, "hoa hồng"),
        Flower(R.drawable.hoa_mai, "hoa mai"),
        Flower(R.drawable.hoa_sen, "hoa sen"),
        Flower(R.drawable.hoa_tulip, "hoa tulip"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "Các loài hoa"
        recyclerView = findViewById(R.id.recycle_view)
        adapter = RecyclerViewAdapter(list)
        recyclerView.adapter = adapter
    }
}
