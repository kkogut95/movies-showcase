package com.example.movies_showcase.feature.movies.movies_list.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.movies_showcase.domain.model.movie.Movie
import com.example.movies_showcase.feature.movies.movies_list.ui.components.MovieListItem
import com.example.movies_showcase.ui.theme.MoviesShowcaseTheme

@Preview(widthDp = 340, name = "340 width", showBackground = true)
@Composable
fun MovieListPreview340() {
    MoviesShowcaseTheme {
        MovieListItem(mockedMovie) {}
    }
}

@Preview(widthDp = 340, name = "long title 340 width", showBackground = true)
@Composable
fun MovieListLongTitlePreview340() {
    MoviesShowcaseTheme {
        MovieListItem(mockedMovie.copy(title = "Very long movie title, as long as LOTR extended version with director commentary")) {}
    }
}

val mockedMovie = Movie(
    id = "id",
    title = "Movie title",
    posterUrl = null,
    releaseYear = "1994"
)
