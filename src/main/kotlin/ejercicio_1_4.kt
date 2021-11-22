fun main(args: Array<String>) {

    println("Escribe los grados celcius")
    var grados = readLine()!!.toFloat()
    var fahrenheit: Double = (1.8 * grados) +32

    println(fahrenheit)

}