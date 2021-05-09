package one.digitalinnovation.digione.testes

import one.digitalinnovation.digione.Funcionario

class ImprimeRelatorioFuncionario {
    companion object{
        fun imprime(funcionario: Funcionario){
            println(
                funcionario.toString()
            )
        }
    }
}