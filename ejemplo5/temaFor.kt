/* 
definición de rangos
val unDigito = 1..9
val letras = 'a'..'z'
val docena = 1..12

if(5 in docena)
println("el número 5 está en el rango de la docena")

if(18 !in docena)
println("El 18 no está en el rango de docena")
*/

fun main()
{
 for(i in 1..10){
        println(i)
    }

 for(i in 1..10 step 2){
        println(i)
    }

for(i in 10 downTo 1){
        println(i)
    }

for(i in 10 downTo 1 step 2){
        println(i)
    }


}