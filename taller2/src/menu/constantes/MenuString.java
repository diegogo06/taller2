package menu.constantes;

public enum MenuString {
    MENU("MENU :"),
    SELECCION("DEBES SELECCIONAR UNA OPCION SOBRE LA ACCION QUE DESEAS HACER"),
    IMC1("1. PARA SABER TU IMC(indice de masa corporal)"),
    SIGNO_ZODIACAL("2. PARA SABER TU SIGNO ZODIACAL"),
    SALARIO("3. PARA PROMERIA N CANTIDAD DE SALARIOS"),
    CREAR_VECTOR("4. CREAR VECTOR"),
    SALIR("0. PARA cerrar la aplicacion");
    private String mensaje;

    MenuString(String s) {

        this.mensaje = s;

    }

    public String getMensaje() {
        return mensaje;
    }
}