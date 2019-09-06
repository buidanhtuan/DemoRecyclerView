package net.techchicken.demorecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(val list: List<Flower>) : RecyclerView.Adapter<RecyclerViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)

        return RecyclerViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        var item = list.get(position)
        holder.imgAvatar.setImageResource(item.img)
        holder.tvName.text = item.name
        holder.container.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                Toast.makeText(v!!.context, item.name, Toast.LENGTH_LONG).show()
            }
        })
    }

}

class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val container: LinearLayout = itemView.findViewById(R.id.container)
    val imgAvatar: ImageView = itemView.findViewById(R.id.img_avatar)
    val tvName: TextView = itemView.findViewById(R.id.tv_name)
}