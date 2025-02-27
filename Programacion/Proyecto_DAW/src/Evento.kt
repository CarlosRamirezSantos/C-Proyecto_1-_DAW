open class Evento {

    var nombre = ""
    var duracion = 0
    var IdEvento = 0
    var aforo = 0
    var fecha = ""
    var ubicacion = ""
    var UsuarioInscrito = ArrayList<Usuario>()
    var UsuarioAsistente = ArrayList<Usuario>()
    var Organizador = ArrayList<Organizador>()
    var categoria = "" //porque con categoria no va

    companion object {

        private var contador = 1
    }

    constructor() {
        IdEvento = contador
        contador++
    }

    constructor(
        nombre: String,
        fecha: String,
        ubicacion: String,
        categoria: String
    ) {
        this.nombre = nombre
        this.fecha = fecha
        this.ubicacion = ubicacion
        this.categoria = categoria
        IdEvento = contador
        contador++
    }


    /*open fun inscribirUsuario (usuario:Usuario){

    UsuarioInscrito.add(usuario)
}

 open fun confirmarAsistencia (usuario:Usuario):Boolean{

     var asiste = false

     if (usuario in UsuarioInscrito){

         UsuarioAsistente.add(usuario)
         asiste = true

     }else {

         println("El usuario no está inscrito, no puede asistir")
     }
     return asiste
 }

    open fun cancelarSuscripcion (usuario: Usuario){

        UsuarioInscrito.remove(usuario)
    }






*/
}