import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        while (isActive) {
            println("Nueva notificación")
            delay(2000)
        }
    }

    delay(7000)
    println("Usuario inactivo")
    job.cancel()
}