package com.example.jetpack1.ui.tvshow

import androidx.lifecycle.ViewModel
import com.example.jetpack1.model.FilmModel
import com.example.jetpack1.utils.DataDummy

class TvShowsViewModel : ViewModel() {

    private val tv = mutableListOf<FilmModel>()

    fun getDataFilm() : List<FilmModel> {

        val data = DataDummy.generateFilmDummy()

        for (i in data){
            tv.add(i)
        }
        return tv
    }
}