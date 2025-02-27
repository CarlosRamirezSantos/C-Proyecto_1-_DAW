enum class Categoria {

    TALLER,
    CONFERENCIA,
    ACTIVIDAD;

    companion object {


        fun devolverEventos(): String {

            return values().random().toString()
        }
    }
}