package com.example.atchiangmai.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.atchiangmai.R

class Rcvhor: RecyclerView.Adapter<Rcvhor.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val  view = LayoutInflater.from(parent.context).inflate(R.layout.horrow,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    }
}