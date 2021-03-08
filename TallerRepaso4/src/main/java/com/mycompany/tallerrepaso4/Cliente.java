package com.mycompany.tallerrepaso4;

import javax.swing.JOptionPane;

public class Cliente {

    private String Nombre;
    private String CC;
    private int tipo;

    public Cliente() {
        this.Nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre completo");
        int x = 0;
        do {
            x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese 1 si es una persona \n"
                    + "Ingrese 2 si es una empresa"));

            if (x == 1) {
                this.tipo = 1;
                this.CC = JOptionPane.showInputDialog(null, "Ingrese el número de su cédula");
            }

            if (x == 2) {
                this.tipo = 2;
                this.CC = JOptionPane.showInputDialog(null, "Ingrese el número de su NIT");
            }
        } while (x < 1 || x > 2);
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCC() {
        return CC;
    }

    public void setCC(String CC) {
        this.CC = CC;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

}
