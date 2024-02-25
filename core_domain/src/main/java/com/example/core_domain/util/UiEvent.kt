package com.example.core_domain.util

sealed class UiEvent {
    object Success : UiEvent()
    object NavigateUp : UiEvent()
    data class ShowSnackBar(val message: UiText): UiEvent()
}