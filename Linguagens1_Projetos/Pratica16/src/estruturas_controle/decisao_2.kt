package estruturas_controle

fun main(){
    println("informe valor: ")
    val valor = readLine()
    when(valor){
        "Jao"-> println("Achei voce")
        "Teste2"->println("Aqui 2")
        "lala" -> {
            println("teste de Varios comandos")
            println("Ate aqui blz")
        }


        else->
            println("Valor padrao")
    }

    // Para validacoes de valores numericos
    when(valor!!.length){
        in 1..10->println("Ate 10 digitado")

    }
}