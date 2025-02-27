enum class PLATAFORMAS {
    ZOOM,
    GOOGLE_MEET,
    MICROSOFT_TEAMS,
    SKYPE,
    DISCORD;

    companion object {
        fun obtenerAleatorio(): String {
            return values().random().name
        }
        /*fun devolverEventos ():String{

            return values().random().toString()
        }*/
    }
}