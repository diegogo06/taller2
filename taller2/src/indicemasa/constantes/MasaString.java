package indicemasa.constantes;

public enum MasaString {
    SOLICITUD_PESO("ESCRIBE TU PESO en kg"),
    SOLICITUD_ALTURA("ESCRIBE TU estatura en cm"),
    RESPUESTA_IMC("SU indice de masa corporal es: "),
    IMC(" [IMC]");
    private String mensaje;

    MasaString(String s) {

        this.mensaje = s;

    }

    public String getMensaje() {
        return mensaje;
    }
}
