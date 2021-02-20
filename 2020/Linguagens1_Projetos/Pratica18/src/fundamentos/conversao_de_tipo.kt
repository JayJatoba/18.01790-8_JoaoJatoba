package fundamentos

fun main(){
    var num1: Double
    var num2: Int
    var resultado: Double

    println("Informe os dois numeros:")
    print("Numero real:")
    num1 = readLine()!!.toDouble()
    print("Numero inteiro")
    num2 = readLine()!!.toInt()
    resultado = num1+num2
    println("Resultado: $resultado")
    println("Resultado: ${num1 + num2}")
    println("Resultado: %.3f".format(resultado))
}