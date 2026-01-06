import kotlinx.coroutines.*

fun main() = runBlocking {
    val descarga1 = launch {
        delay(2000)
        println("Archivo 1 descargado")
    }

    val descarga2 = launch {
        delay(3000)
        println("Archivo 2 descargado")
    }

    val descarga3 = launch {
        delay(1000)
        println("Archivo 3 descargado")
    }

    descarga1.join()
    descarga2.join()
    descarga3.join()

    println("Todas las descargas completas")
}