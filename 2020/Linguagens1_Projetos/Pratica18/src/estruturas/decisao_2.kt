package estruturas

fun main(){
    val valor = 12

    when(valor){
        56-> println("Achei!")
        in 1..10->println("Entre 1 e 10")
//        Teste de paridade nao deu certo
//        valor%%2 -> println("PAR")
        else->println("Sou opcional")

    }
}