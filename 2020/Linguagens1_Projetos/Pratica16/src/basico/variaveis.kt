package basico

fun main(){
    var nome = "Johnny Lawrence"
    var numero_1 = 10
    var numero_2 = 45.87
    println(nome)
    nome = "Daniel Larusso"
    println(nome)
//    nome = 13 // Nao pode acontecer - Kotlin eh fortemente tipado
    var resultado: Double
    resultado = numero_1 + numero_2
    println("O valor do resultado: $resultado")
}