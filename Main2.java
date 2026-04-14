package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.JOptionPane;

public class Main2 {

    public static void main(String[] args) {

        Cubo cubo1 = new Cubo(Cubo.solicitarLado());
        Cubo cubo2 = new Cubo(Cubo.solicitarLado());
        Cubo cubo3 = new Cubo(Cubo.solicitarLado());

        cubo1.mostrarAreaBase();
        cubo1.mostrarVolumen();

        cubo2.mostrarAreaBase();
        cubo2.mostrarVolumen();

        cubo3.mostrarAreaBase();
        cubo3.mostrarVolumen();

        Cubo mayor = cubo1;

        if (cubo2.calcularVolumen() > mayor.calcularVolumen()) {
            mayor = cubo2;
        }

        if (cubo3.calcularVolumen() > mayor.calcularVolumen()) {
            mayor = cubo3;
        }

        JOptionPane.showMessageDialog(null,
                "El cubo con mayor volumen tiene lado: " + mayor.getLado() +
                        "\nVolumen: " + mayor.calcularVolumen());
    }
}

