package com.example.jetpack1.ui.detailfilm

import androidx.databinding.ObservableField
import com.example.jetpack1.model.FilmModel
import com.example.jetpack1.utils.DataDummy
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito

class DetailFilmViewmodelTest {

    private var dataFilm = DataDummy.generateFilmDummy()[0]
    private lateinit var viewmodel: DetailFilmViewmodel
    //private var detailFilm = ObservableField<FilmModel>()


    @Before
    fun setUp() {
        viewmodel = DetailFilmViewmodel()
    }

    @Test
    fun setDetailFilm() {

        Thread.sleep(300)
        viewmodel.setDetailFilm(dataFilm)
        assertEquals(dataFilm, viewmodel.film.get())
    }
}