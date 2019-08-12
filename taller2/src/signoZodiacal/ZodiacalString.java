package signoZodiacal;

public enum ZodiacalString {
    PETICION_DIA("ESCRIBE TU dia de nacimiento"),
    PETICION_MES("ESCRIBE tu mes de nacimiento (el numero)"),
    PETICION_AÑO("ESCRIBE TU año de nacimiento"),
        SIGNO_ARIES("su signo es : Aries"),
    SIGNO_CAPRICORNIO("su signo es : Capricornio"),
    SIGNO_TAURO("su signo es : Tauro"),
    SIGNO_GEMINIS("su signo es :  Géminis"),
    SIGNO_CANCER("su signo es : Cáncer"),
    SIGNO_LEO("su signo es : Leo"),
    SIGNO_VIRGO("su signo es : Virgo"),
    SIGNO_LIBRA("su signo es : Libra"),
    SIGNO_ESCORPION("su signo es : ESCORPION"),
    SIGNO_SAGITARIO("su signo es : SAGITARIO"),
    SIGNO_ACUARIO("su signo es : ACUARIO"),
    SIGNO_PISIS("su signo es : PISIS"),
SIGNO_NO("SIGNO NO ENCONTRADO");



    private String mensaje;

    ZodiacalString(String s) {

        this.mensaje = s;
    }

    public String getMensaje() {
        return mensaje;
    }
}
