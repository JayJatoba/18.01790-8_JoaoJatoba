package colecoes

fun main(){
    val meuVetor = arrayOf(1,2,3)
    var item : Int
    for (item in meuVetor){
        println(item)
    }
    println("Tamanho do array: ${meuVetor.size}")
    println("Primeiro Elemento: ${meuVetor[0]}")
    println("Maior valor: ${meuVetor.max()}")

    //Lista - Objeto lista nao mutavel
    val minhaLista = listOf("Oi","Ola","denovo")
    println(minhaLista)

    val minhaListaQueMuda = mutableListOf("Oi","Ola","denovo")
    println(minhaListaQueMuda)
    minhaListaQueMuda.add("obbfob")
    println(minhaListaQueMuda)
}