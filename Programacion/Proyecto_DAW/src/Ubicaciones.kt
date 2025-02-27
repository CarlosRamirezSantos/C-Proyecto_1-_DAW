enum class Ubicaciones {

    MADRID, BARCELONA, CIUDADREAL, BADAJOZ, MALAGA, TOLEDO, CUENCA, SEVILLA,
    CORDOBA, VALENCIA, BILBAO, TERUEL, HUELVA, LUGO, VALLADOLID, MURCIA;

    companion object {

        fun obtenerUbicacionAleotorio(): String {

            return values().random().name
        }
    }
}