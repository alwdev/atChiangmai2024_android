package com.example.atchiangmai.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.atchiangmai.R
import com.example.atchiangmai.models.RcvhorData

class Rcvhor(private val rcvhorList: ArrayList<RcvhorData>): RecyclerView.Adapter<Rcvhor.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val  view = LayoutInflater.from(parent.context).inflate(R.layout.horrow,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return rcvhorList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val rcvhor = rcvhorList[position]
        holder.imageView.setImageResource(rcvhor.imagetodo)
        holder.textView.text = rcvhor.titletodo
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val imageView : ImageView = itemView.findViewById(R.id.imageTodo)
        val  textView : TextView = itemView.findViewById(R.id.titletodo)
    }
}

private fun ImageView.setImageResource(imagetodo: String) {

}


