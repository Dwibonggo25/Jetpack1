package com.example.jetpack1.ui.detailfilm


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.jetpack1.R
import com.example.jetpack1.databinding.FragmentDetailFilmBinding

class DetailFilmFragment : Fragment() {

    private lateinit var binding: FragmentDetailFilmBinding

    private lateinit var viewmodel: DetailFilmViewmodel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_detail_film , container, false)
        viewmodel = ViewModelProvider(this).get(DetailFilmViewmodel::class.java)
        binding.apply {
            vm = viewmodel
            executePendingBindings()
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val id = DetailFilmFragmentArgs.fromBundle(arguments).idFilm
        viewmodel.fetchDetailFilm(id)
    }

}
