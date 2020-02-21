package com.example.jetpack1.ui.tvshow

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.jetpack1.databinding.RvItemFilmBinding
import com.example.jetpack1.model.FilmModel

class TvShowsAdapter (private val context: Context) : ListAdapter <FilmModel, TvShowsAdapter.ViewHolder> (DiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layout = LayoutInflater.from(parent.context)
        val binding = RvItemFilmBinding.inflate(layout, parent, false)
        return ViewHolder(binding, context)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(getItem(position))

    class ViewHolder(private val binding: RvItemFilmBinding, private val context: Context) : RecyclerView.ViewHolder(binding.root) {
        fun bind (list: FilmModel) {
            binding.apply {
                data = list
                binding.imageView.setImageDrawable(context.getDrawable(list.image))
                binding.executePendingBindings()
            }
        }
    }

    companion object {
        val DiffCallback = object : DiffUtil.ItemCallback<FilmModel>() {
            override fun areItemsTheSame(oldItem: FilmModel, newItem: FilmModel): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: FilmModel, newItem: FilmModel): Boolean {
                return oldItem.id == newItem.id
            }

        }
    }
}