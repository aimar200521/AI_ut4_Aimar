package org.example;

import javax.swing.JOptionPane;

public class Cubo {

    private float lado;

    /**
     * Constructor que recibe el lado del cubo.
     *
     * @param lado Longitud del lado del cubo
     */
    public Cubo(float lado) {
        this.lado = lado;
    }

    /**
     * Getter del lado.
     *
     * @return lado del cubo
     */
    public float getLado() {
        return lado;
    }

    /**
     * Setter del lado.
     *
     * @param lado nuevo valor del lado
     */
    public void setLado(float lado) {
        this.lado = lado;
    }

    /**
     * Calcula el área de la base del cubo.
     *
     * @return área de la base
     */
    public float calcularAreaBase() {
        return lado * lado;
    }

    /**
     * Calcula el volumen del cubo.
     *
     * @return volumen del cubo
     */
    public float calcularVolumen() {
        return lado * lado * lado;
    }

    /**
     * Solicita al usuario el valor del lado con JOptionPane.
     *
     * @return lado introducido por el usuario
     */
    public static float solicitarLado() {
        String input = JOptionPane.showInputDialog("Introduce el lado del cubo:");
        return Float.parseFloat(input);
    }

    /**
     * Muestra el área de la base del cubo en una ventana.
     */
    public void mostrarAreaBase() {
        JOptionPane.showMessageDialog(null, "Área de la base: " + calcularAreaBase());
    }

    /**
     * Muestra el volumen del cubo en una ventana.
     */
    public void mostrarVolumen() {
        JOptionPane.showMessageDialog(null, "Volumen: " + calcularVolumen());
    }
}