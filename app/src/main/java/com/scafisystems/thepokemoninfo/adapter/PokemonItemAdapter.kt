/*
 * Copyright (c) 7/1/2020. Created by André Scafi
 */

package com.scafisystems.thepokemoninfo.adapter

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.scafisystems.thepokemoninfo.R
import com.scafisystems.thepokemoninfo.model.PokemonItem
import com.scafisystems.thepokemoninfo.view.DetailsActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.pokemon_item.view.*

class PokemonItemAdapter(private val exampleList: List<PokemonItem>) :
    RecyclerView.Adapter<PokemonItemAdapter.ExampleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.pokemon_item, parent, false
        )
        return ExampleViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        val currentItem = exampleList[position]
        Picasso.with(holder.itemView.context).load(currentItem.imageResource).into(holder.imageView)
        holder.name.text = currentItem.name
        holder.itemView.setOnClickListener { openDetailsActivity(holder, position) }
    }

    override fun getItemCount() = exampleList.size
    class ExampleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.imageView
        val name: TextView = itemView.txt_name
    }

    private fun openDetailsActivity(holder: ExampleViewHolder, position: Int){
        val intent = Intent(holder.itemView.context, DetailsActivity::class.java)
        intent.putExtra("position", position)
        holder.itemView.context.startActivity(intent)
    }
}
