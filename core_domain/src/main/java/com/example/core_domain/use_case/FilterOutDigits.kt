package com.example.core_domain.use_case

class FilterOutDigits {
    operator fun invoke(input: String): String {
        return input.filter { it.isDigit() }
    }
}