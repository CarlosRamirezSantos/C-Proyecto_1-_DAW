class PortalEventos {

    var eventos = ArrayList<Evento>()


    fun monstrarEventos() {
        var contador = 1
        for (i in eventos.indices) {

            println("Evento $contador: ${eventos[i].nombre}")
            contador++
        }
    }

    fun aniadirEvento(evento: Evento) {

        eventos.add(evento)
    }
}