

fun main() {

    // Operações matemáticas
    println("2 + 2 = ${2 + 2}")
    println("3 - 2 = ${3 - 2}")
    println("4 x 2 = ${4 * 2}")
    println("9 / 3 = ${9 / 3}")
    println("10 % 3 = ${10 % 3}")

    // pré e pos incremento
    var numero = 10
    println("numero++: ${numero++}")
    println("numero--: ${numero--}")
    println("++numero: ${++numero}")
    println("--numero: ${--numero}")

    numero+=2
    println("numero+=2 : ${numero}")
    numero-=4
    println("numero-=4 : ${numero}")
    numero*=5
    println("numero*=5 : ${numero}")
    numero/=3
    println("numero/=3 : ${numero}")
}