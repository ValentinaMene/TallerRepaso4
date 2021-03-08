package com.mycompany.tallerrepaso4;

import javax.swing.JOptionPane;

public class Platos {

    private String Nombre;
    private String Descripcion;
    private int costo;
    private int PrecioDeVenta;
    private int NumPlatos;
    private String TipoDePlato;

    public Platos() {
        this.Nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del plato");
        this.Descripcion = JOptionPane.showInputDialog(null, "Ingrese la descripcion del plato");
        this.costo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el costo del plato (Mano de obra)"));
        this.PrecioDeVenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el precio del plato (Precio de venta)"));
        this.NumPlatos = NumPlatos;
        int x = 0;
        do {
            x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese 1 si es de tipo Desayuno \n"
                    + "Ingrese 2 si es de tipo Almuerzo \n"
                    + "Ingrese 3 si es de tipo Cena"));
            if (x == 1) {
                this.TipoDePlato = "Desayuno";
            }

            if (x == 2) {
                this.TipoDePlato = "Almuerzo";
            }

            if (x == 3) {
                this.TipoDePlato = "Cena";
            }

            if (x < 1 || x > 3) {
                JOptionPane.showMessageDialog(null, "Usted ingresó un valor incorrecto, por favor ingrese un valor del 1 al 3 ");
            }
        } while (x < 1 || x > 3);

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getPrecioDeVenta() {
        return PrecioDeVenta;
    }

    public void setPrecioDeVenta(int PrecioDeVenta) {
        this.PrecioDeVenta = PrecioDeVenta;
    }

    public int getNumPlatos() {
        return NumPlatos;
    }

    public void setNumPlatos(int NumPlatos) {
        this.NumPlatos = NumPlatos;
    }

    public String getTipoDePlato() {
        return TipoDePlato;
    }

    public void setTipoDePlato(String TipoDePlato) {
        this.TipoDePlato = TipoDePlato;
    }

    public int venta(String nombre, String cc, int tipo) {
        int x = 0;
        x = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántos platos desea comprar?"));
        if (tipo == 1) {
            JOptionPane.showMessageDialog(null, "El señor o señora: " + nombre + " con cedula: " + cc + " Compro un total de: " + x + " platos de: "
                    + this.Nombre + " generando una venta total de: " + (this.PrecioDeVenta * x));
            this.NumPlatos = this.NumPlatos + x;
        } else {
            JOptionPane.showMessageDialog(null, "La empresa: " + nombre + " con Nit: " + cc + " Compro un total de: " + x + " platos de: "
                    + this.Nombre + " generando una venta total de: " + (this.PrecioDeVenta * x));
            this.NumPlatos = this.NumPlatos + x;
        }
        return this.PrecioDeVenta * x;
    }

}
