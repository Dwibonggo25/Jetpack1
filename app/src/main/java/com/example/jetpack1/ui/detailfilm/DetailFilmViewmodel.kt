package com.example.jetpack1.ui.detailfilm

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.example.jetpack1.model.FilmModel
import com.example.jetpack1.utils.DataDummy

class DetailFilmViewmodel : ViewModel() {

    val film = ObservableField<FilmModel>()

    fun fetchDetailFilm (idFilm: Int){
        val data = DataDummy.generateFilmDummy()

        for (i in data){
            if (i.id == idFilm) {
                setDetailFilm(i)
            }
        }
    }

    fun setDetailFilm (data: FilmModel) {
        film.set(data)
    }
}