/* Una batería comienza con 0% de carga. Un cargador añade 15% cada minuto.
Se debe detener la carga cuando el ciclo llegue o supere 100%
*/

fun main() {
    var carga = 0
    var minutos = 0

    println("Iniciando carga ")

    while (carga < 100) {
        println("Minuto $minutos: La carga es $carga%")
        
        carga += 15
        minutos++
    }
    println("Carga finalizada: $carga% (Tiempo total: $minutos minutos)")
}