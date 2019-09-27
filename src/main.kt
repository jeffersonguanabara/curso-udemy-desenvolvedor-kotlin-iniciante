fun calculaBonus(a : Int, b : Int, c : Int) = "O bônus é: ${a + b * c * 2}"

fun hello(nome : String) : String = "Olá, $nome"

fun soma(a : Int, b : Int) = a + b

fun main() {
    val a = 10
    val b = 20
    val c = 30

    println(calculaBonus(a, b, c))
    println(soma(a, b))
    println(hello("Pedro"))
}