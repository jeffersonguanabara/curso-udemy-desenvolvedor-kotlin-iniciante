fun calculaBonus(cargo : String, salario : Float) : Float {
    // Gerente Junior, Gerente Senior, Coordenador

    val bonus : Float
    if(cargo == "Coordenador")
        bonus = salario * 1.2f
    else if (cargo == "Gerente Junior")
        bonus = salario * 1.5f
    else if (cargo == "Gerente Senior")
        bonus = salario * 2
    else
        bonus = salario

    return  bonus
}

fun verificaMaiorIdade(idade : Int) : Boolean {
    return idade >= 18
}

fun main() {

    var idade : Int = 10
    println("João tem ${idade} anos, portanto é " + verificaMaiorIdade(idade) + " que João é maior de idade")
    idade = 15
    println("Paulo tem ${idade} anos, portanto é " + verificaMaiorIdade(idade) + " que Paulo é maior de idade")
    idade = 23
    println("Lucas tem ${idade} anos, portanto é " + verificaMaiorIdade(idade) + " que Lucas é maior de idade")

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