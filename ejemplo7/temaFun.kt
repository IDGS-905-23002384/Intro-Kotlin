import kotlin.math.pow

fun mostrarMayor(v1: Int, v2: Int, v3: Int){
    print("Mayor: ")
    if(v1 > v2 && v1 > v3)
        print(v1)
    else 
        if(v2 > v3)
            print(v2)
        else
            print(v3)
}

fun retornarMayor2(v1: Int, v2: Int): Int{
    if(v1 > v2)
        return v1
    else 
        return v2
}

fun limpiarPantalla(){
    ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor()
}

fun main(){
    limpiarPantalla()
    println("Ingrese el primer valor: ")
    val valor1 = readln().toInt()
    println("Ingrese el segundo valor: ")      
    val valor2 = readln().toInt()
    println("Ingrese el tercer valor: ")
    val valor3 = readln().toInt()
    // Limitar el número de decimales
    println(String.format("%.2f",3.141698))

    mostrarMayor(valor1, valor2, valor3)
}