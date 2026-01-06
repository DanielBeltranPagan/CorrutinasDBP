import kotlinx.coroutines.*

fun main() = runBlocking {
    val temporizador = launch {
        var segundos = 0
        while (true) {
            delay(1000)
            segundos++
            println("Segundos: $segundos")
        }
    }

    delay(5000)
    temporizador.cancel()
    println("Temporizador cancelado")
}