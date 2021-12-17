package com.example.speedwalk.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.speedwalk.R
import com.example.speedwalk.data.ListCategories
import com.squareup.picasso.Picasso

class MenuAdapter(var context: Context, list: ListCategories): RecyclerView.Adapter<MenuAdapter.ViewHolder>() {

    private var dataList = list.items

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var image: ImageView
        var text: TextView
        var firstView: View
        var secondView: View


        init {
            firstView = itemView.findViewById(R.id.firstView)
            secondView = itemView.findViewById(R.id.secondView)
            text = itemView.findViewById(R.id.text)
            image = itemView.findViewById(R.id.image)
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_menu_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = dataList[position]

        holder.text.text = data.name
        Picasso
            .get()
            .load(data.imgUrl)
            .into(holder.image)
    }

    override fun getItemCount() = dataList.size
}