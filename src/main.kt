fun contaCaracteres(palavra: kotlin.String) : Int {
    return palavra.length;
}

fun main() {

    var palavra: kotlin.String = "Hipopotamo"

    println("Tamanho da palavra ${palavra}: " + contaCaracteres(palavra))
}