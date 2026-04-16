package org.example;

import javax.swing.JOptionPane;

public class Main2 {

    public static void main(String[] args) {

        Cubo cubo1 = new Cubo(3);
        Cubo cubo2 = new Cubo(5);
        Cubo cubo3 = new Cubo(2);

        GestorCubos gestor = new GestorCubos();

        gestor.inicializarCubos(new Cubo[]{cubo1, cubo2, cubo3});

        gestor.ordenarCubos();

        String resultado = "Cubos ordenados por volumen:\n";
        for (Cubo c : gestor.getListaCubos()) {
            resultado += "Lado: " + c.getLado() + " Volumen: " + c.calcularVolumen() + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);

        boolean cabe = gestor.cabeDentro(cubo3, cubo2);

        JOptionPane.showMessageDialog(null,
                "El cubo de lado " + cubo3.getLado() +
                        " cabe en el de lado " + cubo2.getLado() + ": " + cabe);
    }
}
