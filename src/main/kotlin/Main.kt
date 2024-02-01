package org.example

fun main() {
    val lampara1 = Lampara()
    lampara1.set_identificador("Lámpara del comedor")

    val lampara2 = Lampara()
    lampara2.set_identificador("Lámpara de la cocina")

    lampara1.encender()
    repeat(3) { lampara1.cambiar_color() }
    lampara1.cambiar_intensidad()


    lampara2.encender()
    repeat(2) { lampara2.cambiar_color() }
    lampara2.cambiar_intensidad()
    lampara2.apagar()
    lampara2.cambiar_color()
    lampara2.encender()
    lampara2.cambiar_color()
    lampara2.cambiar_intensidad()
}