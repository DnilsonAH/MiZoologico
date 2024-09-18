package zoologico

abstract class Animal {
    abstract val nombre: String
    abstract val especie: String
    abstract val sonido: String
    abstract fun hacerSonido()
}
class Leon(override val nombre: String) : Animal(), ComportamientoAnimal {
    override val especie = "León"
    override val sonido = "rugido"

    override fun hacerSonido() {
        println("$nombre el $especie hace un $sonido")
    }

    override fun alimentarse() {
        println("$nombre el $especie se está alimentando de carne")
    }
}
class Elefante(override val nombre: String) : Animal(), ComportamientoAnimal {
    override val especie = "Elefante"
    override val sonido = "barrito"
    override fun hacerSonido() {
        println("$nombre el $especie hace un $sonido")
    }
    override fun alimentarse() {
        println("$nombre el $especie se está alimentando de vegetales")
    }
}
interface ComportamientoAnimal {
    fun alimentarse()
}