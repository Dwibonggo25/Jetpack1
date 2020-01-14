package com.example.jetpack1.ui.movie

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.jetpack1.databinding.RvItemFilmBinding
import com.example.jetpack1.model.FilmModel

class MoviesAdapter (private var film : List<FilmModel>, private val context: Context) : RecyclerView.Adapter<MoviesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = RvItemFilmBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = film.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(film[position], position, context)

    class ViewHolder (private val binding : RvItemFilmBinding): RecyclerView.ViewHolder (binding.root) {

        fun bind (film : FilmModel, position: Int, context: Context) {
            binding.imageView.setImageDrawable(context.getDrawable(film.image))
            binding.data = film
            binding.executePendingBindings()
        }
    }

    fun refreshData(film: List<FilmModel>) {
        this.film = film
        notifyDataSetChanged()
    }


}