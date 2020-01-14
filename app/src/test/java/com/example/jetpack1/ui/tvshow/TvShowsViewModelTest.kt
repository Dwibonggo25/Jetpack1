package com.example.jetpack1.ui.tvshow

import com.example.jetpack1.utils.DataDummy
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class TvShowsViewModelTest {

    private lateinit var viewModel: TvShowsViewModel

    @Before
    fun setUp () {
        viewModel = TvShowsViewModel()
    }

    @Test
    fun getDataFilm() {
        val list = viewModel.getDataFilm()
        assertNotNull(list)
        assertEquals(DataDummy.generateFilmDummy(), list)
    }
}