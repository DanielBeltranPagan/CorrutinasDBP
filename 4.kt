import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

suspend fun temperatura() = delay(1000).let { "25°C" }
suspend fun humedad() = delay(1200).let { "60%" }
suspend fun viento() = delay(800).let { "15 km/h" }

fun main() = runBlocking {
    val tiempo = measureTimeMillis {
        val temp = async { temperatura() }
        val hum = async { humedad() }
        val viento = async { viento() }

        println("Temperatura: ${temp.await()}")
        println("Humedad: ${hum.await()}")
        println("Viento: ${viento.await()}")
    }

    println("Tiempo total: ${tiempo}ms")
}