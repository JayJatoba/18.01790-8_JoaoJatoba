package fundamentos

fun main(){
    println("Informe seu nome:")
//    Elvis Operator - garante que se for nulo, retorna string vazia
    var nome = readLine() ?:""
    println("Nome informado: $nome")
    println("Tamanho: ${nome.length}")
}