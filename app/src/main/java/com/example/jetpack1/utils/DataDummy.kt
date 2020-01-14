package com.example.jetpack1.utils

import com.example.jetpack1.R
import com.example.jetpack1.model.FilmModel

object DataDummy {

    fun generateFilmDummy () : List<FilmModel> {
        val data = mutableListOf<FilmModel>()

        data.add(
            FilmModel(1,
            "Avanger",
                "25 April 2018",
                "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos",
                R.drawable.poster_aquaman))
        data.add(
            FilmModel(2,
                "Freaks",
                "25 April 2018",
                "Kept locked inside the house by her father, 7-year-old Chloe lives in fear and fascination of the outside world, where Abnormals create a constant threat - or so she believes.",
                R.drawable.poster_aquaman))
        data.add(
            FilmModel(3,
                "Star Wars",
                "25 April 2018",
                "Through a series of daring escapades deep within a dark and dangerous criminal underworld, Han Solo meets his mighty future copilot Chewbacca and encounters the notorious gambler Lando Calrissian.",
                R.drawable.poster_aquaman))
        data.add(
            FilmModel(3,
                "Star Wars",
                "25 April 2018",
                "Through a series of daring escapades deep within a dark and dangerous criminal underworld, Han Solo meets his mighty future copilot Chewbacca and encounters the notorious gambler Lando Calrissian.",
                R.drawable.poster_aquaman))
        data.add(
            FilmModel(4,
                "Aquaman",
                "25 April 2018",
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm.",
                R.drawable.poster_aquaman))
        data.add(
            FilmModel(5,
                "T-34",
                "25 April 2018",
                "Through a series of daring escapades deep within a dark and dangerous criminal underworld, Han Solo meets his mighty future copilot Chewbacca and encounters the notorious gambler Lando Calrissian.",
                R.drawable.poster_aquaman))
        data.add(
            FilmModel(6,
                "Jurassic Galaxy",
                "25 April 2018",
                "Through a series of daring escapades deep within a dark and dangerous criminal underworld, Han Solo meets his mighty future copilot Chewbacca and encounters the notorious gambler Lando Calrissian.",
                R.drawable.poster_aquaman))
        data.add(
            FilmModel(7,
                "Deadpool 2",
                "25 April 2018",
                "Through a series of daring escapades deep within a dark and dangerous criminal underworld, Han Solo meets his mighty future copilot Chewbacca and encounters the notorious gambler Lando Calrissian.",
                R.drawable.poster_aquaman))
        data.add(
            FilmModel(8,
                "Black Panther",
                "25 April 2018",
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm.",
                R.drawable.poster_aquaman))
        data.add(
            FilmModel(9,
                "Venom",
                "25 April 2018",
                "Through a series of daring escapades deep within a dark and dangerous criminal underworld, Han Solo meets his mighty future copilot Chewbacca and encounters the notorious gambler Lando Calrissian.",
                R.drawable.poster_aquaman))
        data.add(
            FilmModel(10,
                "Green Book",
                "25 April 2018",
                "Through a series of daring escapades deep within a dark and dangerous criminal underworld, Han Solo meets his mighty future copilot Chewbacca and encounters the notorious gambler Lando Calrissian.",
                R.drawable.poster_aquaman))
        return data
    }
}