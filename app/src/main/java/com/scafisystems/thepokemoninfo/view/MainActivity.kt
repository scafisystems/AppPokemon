/*
 * Copyright (c) 7/1/2020. Created by André Scafi
 */

package com.scafisystems.thepokemoninfo.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.scafisystems.thepokemoninfo.R
import com.scafisystems.thepokemoninfo.adapter.PokemonItemAdapter
import com.scafisystems.thepokemoninfo.model.PokemonDetails
import com.scafisystems.thepokemoninfo.model.PokemonItem
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    companion object {
        var listOfPokemon: ArrayList<PokemonDetails> = ArrayList()
        var recyclerViewList: List<PokemonItem>? = null
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        if (recyclerViewList == null || recyclerViewList?.isEmpty()!!) {
            recyclerViewList = ArrayList<PokemonItem>()
        }
        recycler_view.adapter = PokemonItemAdapter(recyclerViewList!!)
        recycler_view.layoutManager = GridLayoutManager(applicationContext, 3)
        recycler_view.setHasFixedSize(false)
    }

    override fun onResume() {
        super.onResume()
        recycler_view.adapter!!.notifyDataSetChanged();
    }
}

