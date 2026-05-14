/* Suma de matrices 3x3 en Kotlin
Crea un programa que permita al usuario ingresar por teclado los valores de dos matrices
de tamaño 3x3 y posteriormente realizar la suma de ambas matrices, mostrando el resultado en la pantalla
*/
fun main(args: Array<String>) {
    println("Matriz 1")
    val matriz1 = leerMatriz()
    
    println("\n Matriz 2 ")
    val matriz2 = leerMatriz()

    val resultado = Array(3) { IntArray(3) }

    // suma
    for (i in 0..2) {
        for (j in 0..2) {
            resultado[i][j] = matriz1[i][j] + matriz2[i][j]
        }
    }

    println("\nLa suma de las matrices es:")
    imprimirMatriz(resultado)
}

// para leer los datos
fun leerMatriz(): Array<IntArray> {
    val matriz = Array(3) { IntArray(3) }
    for (i in 0..2) {
        for (j in 0..2) {
            print("Ingresa valor para la posición [$i][$j]: ")
            matriz[i][j] = readln().toInt()
        }
    }
    return matriz
}

fun imprimirMatriz(matriz: Array<IntArray>) {
    for (fila in matriz) {
        for (valor in fila) {
            print("$valor\t") 
        }
        println()
    }
}