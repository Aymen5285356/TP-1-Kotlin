package TP1

fun main() {
    print("Entrez un nombre : ")
    val nombre = readLine()!!.toInt()

    if (nombre % 2 == 0) {
        println("Le nombre est pair")
    } else {
        println("Le nombre est impair")
    }
}