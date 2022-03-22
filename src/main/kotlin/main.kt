package ru.netology

fun main() {
    val likes = 32
    println(if (likes % 2 != 0) "Понравилось $likes человеку" else "понравилось $likes людям")
}