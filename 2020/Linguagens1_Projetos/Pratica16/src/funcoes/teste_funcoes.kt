package funcoes

//Declarar funcoes
fun SomarDoisNumeros(num1: Int, num2:Int):Int{
    return num1+num2
}

//Funcao de uma instrucao apenas
fun MultiplicarDoisNumeros(num1: Double, num2:Int)=num1*num2
fun main(){
    println("${SomarDoisNumeros(4,56)}")
    println("${MultiplicarDoisNumeros(4.81,56)}")
}