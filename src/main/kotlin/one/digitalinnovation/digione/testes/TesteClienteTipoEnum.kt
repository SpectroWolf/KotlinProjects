package one.digitalinnovation.digione.testes

import one.digitalinnovation.digione.ClienteTipo

fun main(){
    ClienteTipo.values().forEach{ elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }

    ClienteTipo.values().forEach{
        println("${it.name} - ${it.descricao}")
    }

    val pf = ClienteTipo.PF
    println("Cliente - ${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println("Cliente - ${pj.name} - ${pj.descricao}")
}