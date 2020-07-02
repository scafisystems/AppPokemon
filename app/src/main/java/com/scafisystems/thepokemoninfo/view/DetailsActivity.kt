/*
 * Copyright (c) 7/1/2020. Created by André Scafi
 */

package com.scafisystems.thepokemoninfo.view

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.scafisystems.thepokemoninfo.R
import com.scafisystems.thepokemoninfo.model.PokemonDetails
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_details.*


class DetailsActivity : AppCompatActivity() {

    var pokemon: PokemonDetails? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)

        getThePokemon()
        setImageAndName()
        setTypes()
        setStats()
    }

    private fun setImageAndName() {
        Picasso.with(this)
            .load(pokemon?.image?.frontImage)
            .resize(500, 500)
            .into(img_pokemon)

        name_pokemon.text = pokemon?.name

    }

    private fun setTypes() {
        if (pokemon?.types?.size!! >= 1) {
            type1_pokemon.text = pokemon?.types?.get(0)?.type?.name
        }
        if (pokemon?.types?.size!! >= 2) {
            type2_pokemon.text = pokemon?.types?.get(1)?.type?.name
        }
    }

    private fun setStats() {
        textViewHP.text = pokemon?.stats?.get(0)?.baseStat.toString()
        textViewAttack.text = pokemon?.stats?.get(1)?.baseStat.toString()
        textViewDefense.text = pokemon?.stats?.get(2)?.baseStat.toString()
        textViewSpAtk.text = pokemon?.stats?.get(3)?.baseStat.toString()
        textViewSpDef.text = pokemon?.stats?.get(4)?.baseStat.toString()
        textViewSpeed.text = pokemon?.stats?.get(5)?.baseStat.toString()
        var total = 0
        for (i in 0 until pokemon?.stats?.size!!) {
            total += pokemon?.stats?.get(i)?.baseStat!!
        }
        textViewTotal.text = total.toString()

        progressBarHP.progress = pokemon?.stats?.get(0)?.baseStat ?: 0
        progressBarAttack.progress = pokemon?.stats?.get(1)?.baseStat ?: 0
        progressBarDefense.progress = pokemon?.stats?.get(2)?.baseStat ?: 0
        progressBarSpAtk.progress = pokemon?.stats?.get(3)?.baseStat ?: 0
        progressBarSpDef.progress = pokemon?.stats?.get(4)?.baseStat ?: 0
        progressBarSpeed.progress = pokemon?.stats?.get(5)?.baseStat ?: 0
        progressBarTotal.progress = total
    }

    private fun getThePokemon() {
        val intent = intent
        val position = intent.getIntExtra("position", 0)
        pokemon = MainActivity.listOfPokemon[position]
    }

    override fun onBackPressed() {
        super.onBackPressed()
        this.finish()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.getItemId()) {
            android.R.id.home -> {
                onBackPressed()
            }
        }
        return true
    }
}