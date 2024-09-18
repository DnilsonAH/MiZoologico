package zoologico

fun gestionarAnimales() {
    val leon = Leon("Simba")
    val elefante = Elefante("Dumbo")

    println("Información de los animales:")
    leon.hacerSonido()
    leon.alimentarse()

    elefante.hacerSonido()
    elefante.alimentarse()
}

fun gestionarHabitats() {
    val sabana = Sabana(30)
    val jungla = Jungla(28)

    println("\nDetalles de los hábitats:")
    sabana.detalles()
    jungla.detalles()
}

fun main() {
    gestionarAnimales()
    gestionarHabitats()
}