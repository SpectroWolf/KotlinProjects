package one.digitalinnovation.digione.testes

import one.digitalinnovation.digione.Gerente

fun main() {
    val maria = Gerente("Maria a Braba", "123.123.123-12", 5000.0)
    ImprimeRelatorioFuncionario.imprime(maria)
}
