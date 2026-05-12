fun main(){
    println("Ingresa el sueldo del empleado")
    var sueldo = readln().toDouble()
    if(sueldo > 3000){
        print("Paga impuestos")
    }else{
        println("No paga impuestos")
    }

    val a = 3
    val b = 5
    val mayor = if (a > b) a else b
    println("El número mayor entre la $a y $b es $mayor")
}