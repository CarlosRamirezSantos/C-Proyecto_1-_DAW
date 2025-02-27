enum class Fechas(fecha: String) {

    ENERO("20/01/2025"),
    FEBRERO("02/02/2025"),
    ABRIL("18/04/2026"),
    MAYO("01/12/2028"),
    JUNIO("23/08/2025");

    companion object {
        fun obtenerFechaAleatoria(): String {

            return values().random().name
        }

    }

}