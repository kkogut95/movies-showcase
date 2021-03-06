package com.example.movies_showcase.domain.repository

import com.example.movies_showcase.data.model.response.ApiResponse
import com.example.movies_showcase.domain.model.movie.Movie
import com.example.movies_showcase.domain.model.movie.MovieDetails
import kotlinx.coroutines.flow.Flow

interface MoviesRepository {

    suspend fun getMoviesList(page: Int): Flow<ApiResponse<List<Movie>>>

    suspend fun getMovieDetails(movieId: String): Flow<ApiResponse<MovieDetails>>
}
