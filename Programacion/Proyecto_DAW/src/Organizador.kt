class Organizador {

    var nombre = ""
    var IdOrganizador = 0
    var eventosCreados = ArrayList<Evento>()

    /*var eventosCreadosOnline = ArrayList<Online>()
    var eventosCreadosPresencial = ArrayList<Presencial>()*/
    var telefono = 0
    var correo = ""

    companion object {
        private var contador = 1
    }

    constructor(nombre: String) {
        this.nombre = nombre
    }

    constructor() {

        IdOrganizador = contador
        contador++
    }

    /* constructor(nombre: String, telefono: Int, correo: String) {
         this.nombre = nombre
         this.telefono = telefono
         this.correo = correo
     }*/


    /*fun guardarEvento (evento: Evento){

        eventosCreados.add(evento)
    }*/

    fun crearEventoGenerico(nombre: String, ubicacion: String, fecha: String, categoria: String): Evento {
        var evento = Evento(nombre, ubicacion, fecha, categoria)
        eventosCreados.add(evento)

        return evento

    }

    fun crearEventoOnline(
        nombre: String,
        ubicacion: String,
        fecha: String,
        categoria: String,
        plataforma: String
    ): Online {
        var eventoOnline = Online()
        eventoOnline.nombre = nombre
        eventoOnline.ubicacion = ubicacion
        eventoOnline.fecha = fecha
        eventoOnline.categoria = categoria
        eventoOnline.plataforma = plataforma
        eventosCreados.add(eventoOnline)

        return eventoOnline

    }

    fun crearEventoPresencial(
        nombre: String,
        ubicacion: String,
        fecha: String,
        categoria: String,
        direccion: String
    ): Presencial {
        var eventoPresencial = Presencial()
        eventoPresencial.nombre = nombre
        eventoPresencial.ubicacion = ubicacion
        eventoPresencial.fecha = fecha
        eventoPresencial.categoria = categoria
        eventoPresencial.direccion = direccion
        eventosCreados.add(eventoPresencial)

        return eventoPresencial

    }

    fun modificarEvento(evento: Evento): Evento { //hace falta devolverlo??

        evento.nombre = Nombres_Eventos.devolverNombreEvento()
        evento.ubicacion = Ubicaciones.obtenerUbicacionAleotorio()
        evento.fecha = Fechas.obtenerFechaAleatoria()
        evento.categoria = Categoria.devolverEventos()


        return evento


    }

    fun modificarEventoOnline(evento: Online): Online { //hace falta devolverlo??

        evento.nombre = Nombres_Eventos.devolverNombreEvento()
        evento.ubicacion = Ubicaciones.obtenerUbicacionAleotorio()
        evento.fecha = Fechas.obtenerFechaAleatoria()
        evento.categoria = Categoria.devolverEventos()
        evento.plataforma = PLATAFORMAS.obtenerAleatorio()


        return evento


    }

    fun modificarEventoPresencial(evento: Presencial): Presencial { //hace falta devolverlo??

        evento.nombre = Nombres_Eventos.devolverNombreEvento()
        evento.ubicacion = Ubicaciones.obtenerUbicacionAleotorio()
        evento.fecha = Fechas.obtenerFechaAleatoria()
        evento.categoria = Categoria.devolverEventos()
        evento.direccion = DIRECCIONES.devolverDireccionAleatoria()


        return evento


    }

    fun eliminarEvento(evento: Evento) {

        eventosCreados.remove(evento)
    }

    fun eligeEventoAcrear() {
        /*var evento= Evento()*/
        var eleccion = 0
        var salir = false
        do {
            println("Que evento quieres crear: [1]Genérico, [2]Presencial, [3]Online, [4]Salir")
            eleccion = readln().toIntOrNull() ?: -1
            when (eleccion) {
                1 -> {
                    crearEventoGenerico(

                        Nombres_Eventos.devolverNombreEvento(),
                        Ubicaciones.obtenerUbicacionAleotorio(),
                        Categoria.devolverEventos(),
                        Fechas.obtenerFechaAleatoria()
                    )

                }

                2 -> {
                    crearEventoPresencial(
                        Nombres_Eventos.devolverNombreEvento(),
                        Ubicaciones.obtenerUbicacionAleotorio(),
                        Categoria.devolverEventos(),
                        Fechas.obtenerFechaAleatoria(),
                        DIRECCIONES.devolverDireccionAleatoria()

                    )
                }

                3 -> {
                    crearEventoOnline(
                        Nombres_Eventos.devolverNombreEvento(),
                        Ubicaciones.obtenerUbicacionAleotorio(),
                        Categoria.devolverEventos(),
                        Fechas.obtenerFechaAleatoria(),
                        PLATAFORMAS.obtenerAleatorio()
                    )
                }

                4 -> salir = true
            }

        } while (!salir)
    }

    fun monstrarEventos() {

        for (i in eventosCreados.indices) {

            println("Evento: ${eventosCreados[i].nombre}")
        }

    }
}