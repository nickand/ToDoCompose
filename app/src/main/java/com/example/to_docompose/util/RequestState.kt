package com.example.to_docompose.util

sealed class RequestState<out t> {
    object Idle: RequestState<Nothing>()
    object Loading: RequestState<Nothing>()
    data class Success<T>(val data: T): RequestState<T>()
    data class Error<T>(val error: T): RequestState<Nothing>()
}
