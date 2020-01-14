package com.example.jetpack1.ui.movie

import com.example.jetpack1.utils.DataDummy
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test

class MoviesViewModelTest {

    private lateinit var viewModel: MoviesViewModel

    @Before
    fun setUp() {
        viewModel = MoviesViewModel()
    }

    @Test
    fun getDataFilm() {
        val list = viewModel.getDataFilm()
        assertNotNull(list)
        assertEquals(DataDummy.generateFilmDummy(), list)
    }
}