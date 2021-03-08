package com.mycompany.tallerrepaso4;

import javax.swing.JOptionPane;

public class Menu {

    public static void main(String[] args) {

        long ventas = 0;
        int con = 0;
        Platos menu[] = new Platos[6];
        Cliente lista[] = new Cliente[10];
        for (int i = 0; i < menu.length; i++) {
            JOptionPane.showMessageDialog(null, "Registre su plato");
            menu[i] = new Platos();
        }

        for (int i = 0; i < lista.length; i++) {
            // JOptionPane.showMessageDialog(null, "Registre su plato");
            lista[i] = null;
        }

        int x = 0;
        do {
            JOptionPane.showMessageDialog(null, "Bienvenido al restaurante La sazón del gatito");
            x = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Mostrar lista de platos \n"
                    + "2.Mostrar lista de clientes \n"
                    + "3.Mostrar ventas totales del dia \n"
                    + "4.Comprar algun plato \n"
                    + "5.Salir"));
            switch (x) {
                case 1: {
                    JOptionPane.showMessageDialog(null, menu[0].getNombre() + " con un precio de: " + menu[0].getPrecioDeVenta() + " Tipo de comida: " + menu[0].getTipoDePlato() + "\n"
                            + menu[1].getNombre() + " con un precio de: " + menu[1].getPrecioDeVenta() + " Tipo de comida: " + menu[1].getTipoDePlato() + "\n"
                            + menu[2].getNombre() + " con un precio de: " + menu[2].getPrecioDeVenta() + " Tipo de comida: " + menu[2].getTipoDePlato() + "\n"
                            + menu[3].getNombre() + " con un precio de: " + menu[3].getPrecioDeVenta() + " Tipo de comida: " + menu[3].getTipoDePlato() + "\n"
                            + menu[4].getNombre() + " con un precio de: " + menu[4].getPrecioDeVenta() + " Tipo de comida: " + menu[4].getTipoDePlato() + "\n"
                            + menu[5].getNombre() + " con un precio de: " + menu[5].getPrecioDeVenta() + " Tipo de comida: " + menu[5].getTipoDePlato());
                    break;
                }
                case 2: {
                    if (lista == null) {
                        JOptionPane.showMessageDialog(null, "No hay ningun cliente registrado");
                    } else {
                        for (int i = 0; i < 10; i++) {
                            if (lista[i] != null) {
                                JOptionPane.showMessageDialog(null, lista[i].getNombre());
                            }
                        }
                    }
                    break;
                }
                case 3: {
                    if (ventas == 0) {
                        JOptionPane.showMessageDialog(null, "No se ha realizado ninguna venta hasta ahora");
                    } else {
                        JOptionPane.showMessageDialog(null, "El promedio de platos vendidos al dia de: " + menu[0].getNombre() + " es de :" + menu[0].getNumPlatos() + " dando un total de: " + (menu[0].getNumPlatos() * menu[0].getPrecioDeVenta()) + "\n"
                                + "El promedio de platos vendidos al dia de: " + menu[1].getNombre() + " es de: " + menu[1].getNumPlatos() + " dando un total de: " + (menu[1].getNumPlatos() * menu[1].getPrecioDeVenta()) + "\n"
                                + "El promedio de platos vendidos al dia de: " + menu[2].getNombre() + " es de: " + menu[2].getNumPlatos() + " dando un total de: " + (menu[2].getNumPlatos() * menu[2].getPrecioDeVenta()) + "\n"
                                + "El promedio de platos vendidos al dia de: " + menu[3].getNombre() + " es de: " + menu[3].getNumPlatos() + " dando un total de: " + (menu[3].getNumPlatos() * menu[3].getPrecioDeVenta()) + "\n"
                                + "El promedio de platos vendidos al dia de: " + menu[4].getNombre() + " es de: " + menu[4].getNumPlatos() + " dando un total de: " + (menu[4].getNumPlatos() * menu[4].getPrecioDeVenta()) + "\n"
                                + "El promedio de platos vendidos al dia de: " + menu[5].getNombre() + " es de: " + menu[5].getNumPlatos() + " dando un total de: " + (menu[5].getNumPlatos() * menu[5].getPrecioDeVenta()) + "\n"
                                + "Las ventas totales de todos los platos es de:" + ventas);
                    }
                    break;
                }
                case 4: {
                    int y = 0;
                    do {
                        y = Integer.parseInt(JOptionPane.showInputDialog(null, "Elija una opcion de comida \n"
                                + "1. " + menu[0].getNombre() + "\n"
                                + "2. " + menu[1].getNombre() + "\n"
                                + "3. " + menu[2].getNombre() + "\n"
                                + "4. " + menu[3].getNombre() + "\n"
                                + "5. " + menu[4].getNombre() + "\n"
                                + "6. " + menu[5].getNombre()));
                        if (y < 1 || y > 6) {
                            JOptionPane.showMessageDialog(null, "Ingreso un valor incorrecto, por favor ingrese un numero entre el 1 al 6");
                        } else {
                            //  String cc=JOptionPane.showInputDialog(null,"Ingrese la cedula o Nit para validar en la base de datos");
                            boolean z = false;

                            //  for(int i=0; i<10; i++){
                            //  if(lista[i].getCC()!=null && lista[i].getCC().equalsIgnoreCase(cc)){
                            //JOptionPane.showMessageDialog(null,"Usted ya se encuentra registrado en nuestra base de datos");
                            // ventas=menu[y-1].venta(lista[i].getNombre(),lista[i].getCC());
                            //    i=10;
                            //     z=true;
                            // } 
                            //  }
                            if (con < 10) {
                                if (z == false) {
                                    lista[con] = new Cliente();
                                    ventas = ventas + menu[y - 1].venta(lista[con].getNombre(), lista[con].getCC(), lista[con].getTipo());
                                    con++;
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "En este momento tenemos la casa llena, por favor regrese mañana");
                            }
                        }
                    } while (y < 1 || y > 6);
                    break;
                }
                case 5: {
                    JOptionPane.showMessageDialog(null, "Hasta luego, vuelva pronto, pikox uwu");
                    break;
                }
            }
        } while (x < 5);

    }

}
