package com.emelyanov.icerockpractice.shared.domain.models

data class Repo (
    val name: String,
    val owner: String,
    val description: String,
    val language: String,
    val color: Int?
)