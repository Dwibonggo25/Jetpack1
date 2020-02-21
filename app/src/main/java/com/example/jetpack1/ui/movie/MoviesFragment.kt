package com.example.jetpack1.ui.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.jetpack1.R
import com.example.jetpack1.databinding.FragmentMoviesBinding
import com.example.jetpack1.model.FilmModel

class MoviesFragment : Fragment() {

    private lateinit var binding: FragmentMoviesBinding

    lateinit var viewModel: MoviesViewModel

    private lateinit var adapter : MoviesAdapter

    companion object {
        fun newInstance() = MoviesFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        viewModel = ViewModelProviders.of(this).get(MoviesViewModel::class.java)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_movies, container, false)
        binding.executePendingBindings()

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerView()

        val film  = viewModel.getDataFilm()
        refreshData (film)
    }

    private fun refreshData(film: List<FilmModel>) {
        adapter.refreshData(film)
    }

    private fun initRecyclerView() {
        adapter = MoviesAdapter(listOf(), activity!!)
        val dividerItemDecoration =
            DividerItemDecoration(binding.recyclerView.context, LinearLayoutManager.VERTICAL)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.addItemDecoration(dividerItemDecoration)
    }


}
