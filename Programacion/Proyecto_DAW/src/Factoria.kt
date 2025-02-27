class Factoria {

    companion object {

        fun crearUsuario(): Usuario {
            var usuario = Usuario(Nombres_Usuarios.obtenerAleatorio())

            return usuario
        }

        fun nuevoOrganizador(): Organizador {

            var organizador = Organizador(Nombre_Empresas.obtenerAleatorio())
            return organizador
        }

    }

}