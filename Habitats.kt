package zoologico

open class Habitat(open var nombre: String, open var temperatura: Int) {
    open var tamano: Int = 100 // en metros cuadrados
    open val tipo = "general"

    open fun detalles() {
        println("El hábitat '$nombre' tiene una temperatura de $temperatura°C y un tamaño de $tamano m².")
    }
}

class Sabana(override var temperatura: Int) : Habitat("Sabana", temperatura) {
    override val tipo = "sabana"
    override var tamano = 500

    override fun detalles() {
        println("La $tipo tiene una temperatura de $temperatura°C y un tamaño de $tamano m².")
    }
}

class Jungla(override var temperatura: Int) : Habitat("Jungla", temperatura) {
    override val tipo = "jungla"
    override var tamano = 300

    override fun detalles() {
        println("La $tipo tiene una temperatura de $temperatura°C y un tamaño de $tamano m².")
    }
}
