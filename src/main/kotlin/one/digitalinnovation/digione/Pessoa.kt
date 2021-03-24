package one.digitalinnovation.digione

class Pessoa {
    var nome: String = "Guilherme"

    var cpf: String = "123.123.123-12"
    private set
}

fun main (){
    val guilherme = Pessoa()

    println(guilherme)
    println(guilherme.nome)
    println(guilherme.cpf)
}