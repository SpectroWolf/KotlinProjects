package one.digitalinnovation.digione.testes

import one.digitalinnovation.digione.Cliente
import one.digitalinnovation.digione.ClienteTipo

fun main (){
    val jose = Cliente(
        nome = "Cleiton o Teste",
        cpf = "123.123.123-12",
        clienteTipo = ClienteTipo.PF,
        senha = "1234"
    )

    println(jose)

    TesteAutencicacao().autentica(jose)
}