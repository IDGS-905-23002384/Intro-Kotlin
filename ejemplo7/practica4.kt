/*
Crear un programa que permita calcular el área de 4 figuras utilizando funciones 
para cada figura, mostrará un menú para elegir la figura a calcular el área, pedirá 
los valores necesarios y mostrará el resultado, a continuación, mostrará nuevamente
el menú termina al elegir opción 5
*/

import kotlin.math.PI
import kotlin.math.pow

fun areaCuadrado() {
    print("Ingrese el lado del cuadrado: ")
    val lado = readln().toDouble()
    val resultado = lado * lado
    println("El área del cuadrado es: ${String.format("%.2f", resultado)}")
}

fun areaTriangulo() {
    print("Ingrese la base: ")
    val base = readln().toDouble()
    print("Ingrese la altura: ")
    val altura = readln().toDouble()
    val resultado = (base * altura) / 2
    println("El área del triángulo es: ${String.format("%.2f", resultado)}")
}

fun areaCirculo() {
    print("Ingrese el radio del círculo: ")
    val radio = readln().toDouble()
    val resultado = PI * radio.pow(2)
    println("El área del círculo es: ${String.format("%.2f", resultado)}")
}

fun areaRectangulo() {
    print("Ingrese la base: ")
    val base = readln().toDouble()
    print("Ingrese la altura: ")
    val altura = readln().toDouble()
    val resultado = base * altura
    println("El área del rectángulo es: ${String.format("%.2f", resultado)}")
}


fun main() {
    var opcion: Int
    
    do {
        println("\n MENÚ ")
        println("1. Cuadrado")
        println("2. Triángulo")
        println("3. Círculo")
        println("4. Rectángulo")
        println("5. Salir")
        print("Elija una opción: ")
        
        opcion = readln().toIntOrNull() ?: 0

        when (opcion) {
            1 -> areaCuadrado()
            2 -> areaTriangulo()
            3 -> areaCirculo()
            4 -> areaRectangulo()
            5 -> println("Salió del programa")
            else -> println("Opción no válida, intente de nuevo.")
        }
        
    } while (opcion != 5)
}