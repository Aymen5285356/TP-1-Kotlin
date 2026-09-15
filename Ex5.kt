package TP1

fun carre(n: Int): Int {
    return n * n
}

fun addition(a: Int, b: Int): Int {
    return a + b
}

fun maximum(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun estPair(n: Int): Boolean {
    return n % 2 == 0
}

fun main() {
    print("Entrez un nombre : ")
    val nombre = readLine()!!.toInt()
    println("Le carré de $nombre est : ${carre(nombre)}")

    print("Entrez le premier nombre : ")
    val n1 = readLine()!!.toInt()
    print("Entrez le deuxième nombre : ")
    val n2 = readLine()!!.toInt()

    println("Somme : ${addition(n1, n2)}")
    println("Maximum : ${maximum(n1, n2)}")

    if (estPair(n1)) {
        println("$n1 est pair")
    } else {
        println("$n1 est impair")
    }
}