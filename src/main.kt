fun calculaBonus(cargo : String, salario : Float) : Float {
    // Gerente Junior, Gerente Senior, Coordenador

    return if (cargo == "Coordenador") {
        salario * 1.2f
    } else if (cargo == "Gerente Junior") {
        salario * 1.5f
    } else if (cargo == "Gerente Senior") {
        salario * 2
    } else {
        salario
    }
}


fun main() {

//    operador ternario no kotlin
    val valor = 10
    val str = if (valor == 10) "Sim" else "Não"
    print(str)

    println()

    var cargo : String = "Coordenador"
    var salario : Float = 2500f
    println("Thiago é ${cargo} em uma determinada empresa, seu salário é de ${salario}, mas sua remuneração final após adicionado o bônus praticado na empresa é de: " + calculaBonus(cargo, salario))
    cargo = "Gerente Junior"
    salario = 3000f
    println("Robson é ${cargo} em uma determinada empresa, seu salário é de ${salario}, mas sua remuneração final após adicionado o bônus praticado na empresa é de: " + calculaBonus(cargo, salario))
    cargo = "Gerente Senior"
    salario = 4500f
    println("Jaqueline é ${cargo} em uma determinada empresa, seu salário é de ${salario}, mas sua remuneração final após adicionado o bônus praticado na empresa é de: " + calculaBonus(cargo, salario))
    cargo = "Assistente Administrativo"
    salario = 1300f
    println("Jonas é ${cargo} em uma determinada empresa, seu salário é de ${salario}, mas sua remuneração final após adicionado o bônus praticado na empresa é de: " + calculaBonus(cargo, salario))
}