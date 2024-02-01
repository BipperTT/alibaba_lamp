package org.example

import java.util.*

class Lampara(private var identificador: String? = null) {

    private var encendida: Boolean = false
    private var color: String = "blanco"
    private var intensidad: Int = 0

    private val colores_validos = listOf("blanco", "negro", "azul", "rojo", "verde", "rosa")

    fun set_identificador(nuevo_identificador: String) {

        identificador = nuevo_identificador

    }

    fun encender() {

        encendida = true
        mostrar_estado()

    }

    fun apagar() {

        encendida = false
        mostrar_estado()

    }

    fun cambiar_color() {

        val color_introducido = readWord("Introduce el color de la lámpara:", "Es necesario introducir un color.")

        color = when (color_introducido.lowercase(Locale.getDefault())) {
            in colores_validos -> color_introducido
            else -> {
                println("${RED_BOLD_BRIGHT}ERROR: Color inexistente. Se utilizará el color blanco.${RESET}")
                "blanco"
            }
        }

        mostrar_estado()

    }

    fun cambiar_intensidad() {
        do {
            intensidad = readInt(
                "Introduce la intensidad de la lámpara de 1 - 5:",
                "${RED_BOLD_BRIGHT} Es necesario introducir un entero.${RESET}",
                "La intensidad debe estar entre 1 y 5.",
                1,
                5
            )
        } while (intensidad > 5)
        mostrar_estado()
    }

    private fun mostrar_estado() {
        val estado = if (encendida) "${YELLOW_BOLD_BRIGHT}encendida${RESET}" else "${WHITE_BOLD}apagada${RESET}"
        println("${identificador ?: "lámpara"} - Estado: $estado, Color: $color, Intensidad: $intensidad")
    }

}
