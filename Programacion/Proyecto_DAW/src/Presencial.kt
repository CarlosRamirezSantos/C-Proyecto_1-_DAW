class Presencial : Evento {


    var direccion = ""

    constructor() : super() {

    }

    constructor(direccion: String) : super() {
        this.direccion = direccion

    }


    /*override fun inscribirUsuario(usuario: Usuario) {
        super.inscribirUsuario(usuario)
    }

    override fun confirmarAsistencia(usuario: Usuario): Boolean {
        return super.confirmarAsistencia(usuario)
    }

    override fun cancelarSuscripcion(usuario: Usuario) {
        super.cancelarSuscripcion(usuario)
    }*/
}