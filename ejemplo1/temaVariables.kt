// fun main(){
//     val saludo: String ="Hola" //Inmutable
//     val nombre: String ="Kotlin" //Mutable
//     println("$saludo, $nombre!!!")
// }
fun main(){
    // println("$saludo, $nombre!!!")
    
    println("Ingresa el primer número")
    val num1 = readln().toInt()

    println("Ingresa el segundo número")
    val num2 = readln().toInt()

    var res = num1 + num2

    println("La suma es: $res")
}
    