class Online : Evento {


    var plataforma = ""


    constructor() : super() {

    }

    constructor(plataforma: String) : super() {
        this.plataforma = plataforma
    }


    /* override fun inscribirUsuario(usuario: Usuario) {
         super.inscribirUsuario(usuario)
     }

     override fun confirmarAsistencia(usuario: Usuario): Boolean {
         return super.confirmarAsistencia(usuario)
     }

     override fun cancelarSuscripcion(usuario: Usuario) {
         super.cancelarSuscripcion(usuario)
     }*/
}