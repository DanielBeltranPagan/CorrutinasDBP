import kotlinx.coroutines.*

suspend fun obtenerUsuario(): String {
    delay(2000)
    return "Usuario: Juan Pérez"
}

fun main() = runBlocking {
    println("Llamando a la API...")
    val usuario = obtenerUsuario()
    println(usuario)
}