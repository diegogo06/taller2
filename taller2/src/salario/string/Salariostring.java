package salario.string;

public enum Salariostring {

    MENSAJE_CANTIDAD_SALARIO("cuantos salarios va ingresar?") ,

    MENSAJE_SALARIO_MAYOR("El salario de mayor valor es "),
    MENSAJE_REQUERIMIENTO("escribe el salario como entero"),

    SALARIO_MENOR("el salario mas Bajo es "),
    PROMEDIO("EL PROMEDIO ES "),
    INGRESE_SALARIO("Ingrese un salario para la posicion [ "),
    INGRESE_SALARIO2(" ] "),
    TOTAL_SALARIO("TOTAL SALARIOS A PAGAR ");


        Salariostring(String ss) {
            this.mensaje = ss;
        }

        public String getMensaje() {
            return mensaje;
        }



        private String mensaje;

}
