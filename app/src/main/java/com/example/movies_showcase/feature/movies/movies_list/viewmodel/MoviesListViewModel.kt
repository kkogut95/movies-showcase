package com.example.movies_showcase.feature.movies.movies_list.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.example.movies_showcase.domain.model.movie.Movie
import com.example.movies_showcase.domain.repository.MoviesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class MoviesListViewModel @Inject constructor(private val moviesRepository: MoviesRepository) :
    ViewModel() {

    val movies: Flow<PagingData<Movie>> = Pager(PagingConfig(pageSize = PAGE_SIZE)) {
        MoviesSource(moviesRepository)
    }.flow.cachedIn(viewModelScope)

    private companion object {

        const val PAGE_SIZE = 30
    }
}
