package one.digitalinnovation.digione.testes

import one.digitalinnovation.digione.Analista

fun main() {
    val guilherme = Analista("Guilherme", "123.123.123-12", 2000.0)
    ImprimeRelatorioFuncionario.imprime(guilherme)
}
