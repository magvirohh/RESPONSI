package com.uty.responsi5170411350

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class cardviewadapter (private val listData: ArrayList<carditem>) : RecyclerView.Adapter<cardviewadapter.CardViewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.activity_home, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val list = listData[position]
        Glide.with(holder.itemView.context)
            .load(list.poster)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)
        holder.tvName.text = list.name
        holder.tvDetail.text = list.detail
        holder.itemView.setOnClickListener { Toast.makeText(holder.itemView.context, "Kamu memilih " + listData[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_poster)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
    }
}
