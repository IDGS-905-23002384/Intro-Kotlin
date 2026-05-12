/* Solicita al usuario ingresar el diámetro de una tubería
No se permiten valores negativos o cero. El programa debe pedir el dato
repetidamente hasta que el usuario ingrese un valor válido

 */ 
fun main(){

    var diam: Int
    do{
        println("Ingrese el diámetro de la tubería")
        diam = readln().toIntOrNull() ?: 0
        if(diam <= 0){
            println("Ingresa un valor válido")
        }
    }while(diam <=0)
    println("El diámetro es: $diam")
}