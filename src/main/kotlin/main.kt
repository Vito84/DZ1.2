package ru.netology

fun main() {
    val likes = 4
    println(if (likes % 10 == 1 && likes != 11 && likes % 100 != 11) "Понравилось $likes человеку"
    else "понравилось $likes людям")
}
