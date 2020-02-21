package com.example.jetpack1.ui.tvshow

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
import com.example.jetpack1.databinding.FragmentTvShowsBinding
import com.example.jetpack1.model.FilmModel

class TvShowsFragment : Fragment() {

    private lateinit var viewmodel: TvShowsViewModel

    private lateinit var binding : FragmentTvShowsBinding

    private lateinit var adapter : TvShowsAdapter

    companion object {
        fun newInstance() = TvShowsFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        viewmodel = ViewModelProviders.of(activity!!).get(TvShowsViewModel::class.java)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_tv_shows, container, false)
        binding.executePendingBindings()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecycerview()
        val tvShows = viewmodel.getDataFilm()
        refreshData(tvShows)
    }

    private fun refreshData(tvShows: List<FilmModel>) {
        adapter.submitList(tvShows)
    }

    private fun initRecycerview() {
        adapter = TvShowsAdapter(activity!!)
        val dividerItemDecoration = DividerItemDecoration(binding.recyclerView.context, LinearLayoutManager.VERTICAL)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.addItemDecoration(dividerItemDecoration)
    }
}
