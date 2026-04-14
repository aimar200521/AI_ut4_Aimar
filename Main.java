package org.example;

public class Main {
    public static void main(final String[] args) {
        /**
         * Ejecuta un bucle que incrementa un contador y realiza cálculos
         * hasta que el contador alcanza el valor 100.
         *
         *
         */
        int resultadoTemporal = 0;
        int incrementoBase = 15;
        int resultadoSuma = 20;
        int contador = 0;
        do {
            resultadoSuma = 10 + incrementoBase;
            contador = contador + resultadoSuma;
            contador++;
            if (contador < 10) {
                resultadoTemporal = 15;
                contador = contador - 1;
            } else {
                resultadoTemporal = 10;
                contador = contador - 1;
            }
            int valorAuxiliar;
            valorAuxiliar = contador;
            resultadoTemporal = valorAuxiliar;
        } while (contador < 100);
    }
}
