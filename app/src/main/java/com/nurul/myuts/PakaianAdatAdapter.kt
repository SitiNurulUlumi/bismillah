package com.nurul.myuts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestBuilder
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.Glide.with as with1

class PakaianAdatAdapter (private val listPakaian: ArrayList<PakaianAdat>) : RecyclerView.Adapter<PakaianAdatAdapter.CardViewViewHolder>() {
    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgpoto: ImageView = itemView.findViewById(R.id.img_item)
        var name: TextView = itemView.findViewById(R.id.item_name)
        var deskripsi: TextView = itemView.findViewById(R.id.item_deskripsi)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_card, parent, false)
        return CardViewViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listPakaian.size
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val pakaian = listPakaian[position]

        Glide.with(holder.itemView.context)
            .load(pakaian.poto)
            .apply(RequestOptions())
            .into(holder.imgpoto)

        holder.name.text=pakaian.name
        holder.deskripsi.text = pakaian.deskripsi

        holder.itemView.setOnClickListener{
            Toast.makeText(holder.itemView.context,"Kamu memilih " +listPakaian[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()
        }
    }

}
