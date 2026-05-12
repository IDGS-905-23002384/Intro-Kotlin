/* Un controlador PLC bloquea el acceso tras 3 intentos fallidos
de ingresar una clave de seguridad
*/

fun main() {
    val claveCorrecta = "PLC123"
    var intentos = 0
    var accesoConcedido = false

    while (intentos < 3 && !accesoConcedido) {
        print("Ingrese la clave de seguridad: ")
        val entrada = readln()

        if (entrada == claveCorrecta) {
            accesoConcedido = true
        } else {
            intentos++
            val restantes = 3 - intentos
            if (restantes > 0) {
                println("Clave incorrecta. Te quedan $restantes intentos.")
            }
        }
    }

    if (accesoConcedido) {
        println("Acceso permitido")
    } else {
        println("BLOQUEO DE SEGURIDAD")
    }
}