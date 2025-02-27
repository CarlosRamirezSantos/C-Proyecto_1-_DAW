enum class DIRECCIONES(direccion: String) {

    DIRECCION1("Gran Vía, 45"),
    DIRECCION2("Av. Diagonal, 150"),
    DIRECCION3("Plaza del Ayuntamiento"),
    DIRECCION4("Torre Sevilla"),
    DIRECCION5("Museo Guggenheim");

    companion object {

        fun devolverDireccionAleatoria(): String {

            return values().random().name
        }
    }

}