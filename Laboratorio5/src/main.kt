package main
import java.util.Scanner

fun main(args : Array<String>) {
    println("1.Administrador \n 2.Conductor \n 3.Salir")
    val a = Scanner(System.`in`)
    println("Introduzca el numero: ")

    val opcion:Int = a.nextInt()
    print("opcion \n")

    val ad = "1.Crear mivel \n 2.Eliminar nivel \n 3.Ver todos los niveles \n 4.Salir"
    val con = "1.Ingresar placa \n 2. Salir"

    when (opcion) {
        1 -> println(ad)
        2 -> println(con)
        3 -> println("salió")
        else -> println("opcion invalida")
    }
    

}
