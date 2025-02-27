enum class Nombre_Empresas {

    INDRA, INDITEX, MAHOU, TELEPIZZA, LAHORMIGA, COCACOLA, BBVA,
    SANTADER, SOLISYON, AUDAX, TELEFONICA, NESTLE;

    companion object {
        fun obtenerAleatorio(): String {
            return values().random().name
        }
    }
}