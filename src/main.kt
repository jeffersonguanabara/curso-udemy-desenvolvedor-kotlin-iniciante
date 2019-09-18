fun main() {
    println("Olá mundo!")

    var nome = "Pedro"
    var idade:Byte = 40
    // printando o tipo de dados
    println(nome.javaClass.name)
    println(idade.javaClass.name)
    // printando o tamanho mínimo e máximo de um tipo de dado
    println("Double: máx: " + Double.MAX_VALUE + ", min: " + Double.MIN_VALUE)
    println("Float: máx: " + Float.MAX_VALUE + ", min: " + Float.MIN_VALUE)
    println("Long: máx: " + Long.MAX_VALUE + ", min: " + Long.MIN_VALUE)
    println("Int: máx: " + Int.MAX_VALUE + ", min: " + Int.MIN_VALUE)
    println("Short: máx: " + Short.MAX_VALUE + ", min: " + Short.MIN_VALUE)
    println("Byte: máx: " + Byte.MAX_VALUE + ", min: " + Byte.MIN_VALUE)
}