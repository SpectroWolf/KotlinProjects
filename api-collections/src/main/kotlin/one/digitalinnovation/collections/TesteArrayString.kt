package one.digitalinnovation.collections

fun main() {
    val nomes = Array<String>(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "Cleber"
    nomes[2] = "José"

    for(nome in nomes){
        println(nome)
    }

    println("----------------")

    nomes.sort()
    nomes.forEach { println(it) }

    val nomes2 = arrayOf("Maria","Cleber","José")
    println("----------------")

    nomes2.sort()
    nomes2.forEach { println(it) }
}