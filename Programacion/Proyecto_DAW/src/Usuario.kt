class Usuario {

    var EventosApuntados = ArrayList<Evento>()
    var EventosAsistidos = ArrayList<Evento>()
    var IdUsuario = 0
    var nombre = ""
    var correo = ""
    var contrasenia = ""

    companion object {

        private var contador = 1
    }

    constructor() {

        IdUsuario = contador
        contador++
    }

    constructor(nombre: String) {
        this.nombre = nombre
        IdUsuario = contador
        contador++
    }/* constructor(
         contrasenia: String,
         correo: String,
         nombre: String,

     ) {
         this.contrasenia = contrasenia
         this.correo = correo
         this.nombre = nombre

         IdUsuario= contador
         contador++
     }*/

    fun inscribirEvento(evento: Evento) {
        if (!(evento in EventosApuntados)) {

            evento.UsuarioInscrito.add(this) //preguntar porque Usuario no deja
            EventosApuntados.add(evento)
            println("$nombre Se ha inscrito con éxito")
        } else {
            println("$nombre ya está inscrito")
        }
    }

    fun cancelarInscripcionEvento(evento: Evento) {
        if (evento in EventosApuntados) {
            EventosApuntados.remove(evento)
            evento.UsuarioInscrito.remove(this)
            println("$nombre Se ha cancelado la inscripción con éxito")
        } else {
            println("$nombre No está inscrito")
        }
    }

    fun confirmarAsistencia(evento: Evento) {

        if (evento in EventosApuntados) {
            EventosAsistidos.add(evento)
            evento.UsuarioAsistente.add(this)
            println(" $nombre Ha confirmado su asistencia")

        } else {

            println("$nombre Tiene que estar apuntado previamente ")
        }
    }

    fun historialEventosInscritos() {

        if (EventosAsistidos.isNotEmpty()) {

            for (i in EventosApuntados.indices) {

                println(" Evento: ${EventosApuntados[i].nombre}")
            }
        } else {

            println("El usuario no está inscrito en ningún evento")
        }


    }

}