package com.example.jetpack1.ui.movie

import androidx.lifecycle.ViewModel
import com.example.jetpack1.model.FilmModel
import com.example.jetpack1.utils.DataDummy

class MoviesViewModel : ViewModel() {

    val film = mutableListOf<FilmModel>()

    fun getDataFilm() : List<FilmModel> {

        val data = DataDummy.generateFilmDummy()

        for (i in data){
            film.add(i)
        }
        return film
    }

}