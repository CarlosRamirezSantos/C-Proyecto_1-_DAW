fun main() {
    var portalEventos = PortalEventos()
    var evento1 = Evento("EcoIndra", "21/05/2025", "Ciudad Real", "Taller")
    var evento2 = Evento("EcoIndra1", "11/08/2025", "Ciudad Real", "Conferencia")
    portalEventos.aniadirEvento(evento1)
    portalEventos.aniadirEvento(evento2)


    do {
        println("Bienvenidos al portal web sostenible")
        var opcion = 0
        do {
            println("Es usted organizador[1] o usuario[2]")
            opcion = readln().toIntOrNull() ?: -1
        } while (opcion != 1 && opcion != 2)
        var salirDelPortal = false
        when (opcion) {
            1 -> {
                var organizador = Factoria.nuevoOrganizador()
                println("Bienvenido/a ${organizador.nombre}")
                var eleccionOrganizador = 0

                do {
                    println(
                        "Que desea hacer:" +
                                "[1] Crear un evento" +
                                "[2] Eliminar un evento" +
                                "[3] Modificar un evento" +
                                "[4] Consultar sus eventos" +
                                "[5] Salir del portal web"
                    )
                    eleccionOrganizador = readln().toIntOrNull() ?: -1
                    when (eleccionOrganizador) {
                        1 -> {
                            var nuevoEvento = organizador.eligeEventoAcrear()
                        }

                        2 -> {
                            println("¿Que evento quieres eliminar?")
                            var contador = 1
                            for (i in organizador.eventosCreados.indices) {
                                println("Evento $contador: ${organizador.eventosCreados[i].nombre}")
                                contador++
                            }
                            var eleccion = readln().toIntOrNull() ?: -1
                            organizador.eliminarEvento(organizador.eventosCreados[eleccion - 1])
                        }

                        3 -> {
                            println("¿Que evento quieres modificar?")
                            var contador = 1
                            for (i in organizador.eventosCreados.indices) {
                                println("Evento $contador: ${organizador.eventosCreados[i].nombre}")
                                contador++
                            }
                            var eleccion = readln().toIntOrNull() ?: -1
                            organizador.modificarEvento(organizador.eventosCreados[eleccion - 1])
                        }

                        4 -> organizador.monstrarEventos()
                        5 -> {
                            salirDelPortal = true
                            println("Gracias por su visita.")
                        }
                    }
                } while (!salirDelPortal)
            }

            2 -> {
                var usuario = Factoria.crearUsuario()
                var eleccionUsuario = 0

                do {
                    println("Menu de usuario:")
                    println("Bienvenid@ ${usuario.nombre}")
                    println(
                        "Que desea hacer:" +
                                "[1] Inscribirse a un evento" +
                                "[2] Confirmar Asistencia a un evento" +
                                "[3] Cancelar inscripcion a un evento" +
                                "[4] Consultar lista de eventos" +
                                "[5] Consultar lista de eventos a los que estás inscrito" +
                                "[6] Mostrar información de los eventos" +
                                "[7] Salir del portal web"
                    )
                    eleccionUsuario = readln().toIntOrNull() ?: -1

                    when (eleccionUsuario) {
                        1 -> {
                            println("¿A cual evento quieres inscribirte?")
                            var contador = 1
                            for (i in portalEventos.eventos.indices) {
                                println("Evento $contador: ${portalEventos.eventos[i].nombre}")
                                contador++
                            }
                            var eleccion = readln().toIntOrNull() ?: -1
                            usuario.inscribirEvento(portalEventos.eventos[eleccion - 1])
                        }

                        2 -> {
                            println("¿En cual evento quieres confirmar asistencia?")
                            var contador = 1
                            for (i in portalEventos.eventos.indices) {
                                println("Evento $contador: ${portalEventos.eventos[i].nombre}")
                                contador++
                            }
                            var eleccion = readln().toIntOrNull() ?: -1
                            usuario.confirmarAsistencia(portalEventos.eventos[eleccion - 1])
                        }

                        3 -> {
                            println("¿En cual evento quieres cancelar la inscripción?")
                            var contador = 1
                            for (i in portalEventos.eventos.indices) {
                                println("Evento $contador: ${portalEventos.eventos[i].nombre}")
                                contador++
                            }
                            var eleccion = readln().toIntOrNull() ?: -1
                            usuario.cancelarInscripcionEvento(portalEventos.eventos[eleccion - 1])
                        }

                        4 -> portalEventos.monstrarEventos()
                        5 -> usuario.historialEventosInscritos()
                        6 -> {
                            println("¿De cual evento quieres saber la información?")
                            var contador = 1
                            for (i in portalEventos.eventos.indices) {
                                println("Evento $contador: ${portalEventos.eventos[i]}")
                                contador++
                            }
                            var eleccion = readln().toIntOrNull() ?: -1
                            portalEventos.eventos.toString()
                        }

                        7 -> {
                            salirDelPortal = true
                            println("Gracias por su visita.")
                        }
                    }
                } while (eleccionUsuario in 1..7 && !salirDelPortal)
            }
        }
    } while (!salirDelPortal)
}
