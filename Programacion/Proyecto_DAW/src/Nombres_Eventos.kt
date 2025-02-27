enum class Nombres_Eventos {


    ECOFLOW, GREENBIZ25, ECOCONSCIOUS, SUSTAINIA, ECOVISION, ECOZENITH, ECOVERSE, ECOPULSE, ECOFUSION, ECOGLOW, ECOWAVE, ECOTECH, ECOCLEAN, ECOPURITY, GREENTECH, FUTUREBUILD, PLANETIERS;

    companion object {

        fun devolverNombreEvento(): String {

            return values().random().name
        }
    }
}