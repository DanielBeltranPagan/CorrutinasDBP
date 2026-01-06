import kotlinx.coroutines.*

suspend fun login() {
    delay(1000)
    println("Login completado")
}

suspend fun cargarPerfil() {
    delay(1000)
    println("Perfil cargado")
}

suspend fun cargarPreferencias() {
    delay(1000)
    println("Preferencias cargadas")
}

fun main() = runBlocking {
    login()
    cargarPerfil()
    cargarPreferencias()
    println("Proceso terminado")
}