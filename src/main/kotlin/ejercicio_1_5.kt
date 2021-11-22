fun main(args: Array<String>) {

    println("Inserte precio")
    var precio = readLine()!!.toFloat()

    var precioSinIVA :Float = precio / 1.1F

    println(precioSinIVA)

    var aplica: Float = precio - precioSinIVA
    println(aplica)