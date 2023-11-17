
package com.mycompany.lucasian;


import javax.swing.JOptionPane;

    public class Lucasian {

        public static void main(String[] args) {
        String name;
        Float price;
        float porcentApply;
        float finalPrice = 0;

        name = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
        price = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el precio de su compra: "));
        if (price >= 200000) {
            finalPrice = disacountPorcent(price, 15.0f);
            porcentApply = 15.0f; 
        } else if (price >= 50000) {
            finalPrice = disacountPorcent(price, 2.0f); 
            porcentApply = 2.0f; 
        } else if (price >= 20000) {
            finalPrice = disacountPorcent(price, (float) 1.5);
            porcentApply = (float) 1.5; 
        } else {
            porcentApply = 0;
        }

        printCheckIn(name, porcentApply, finalPrice, price);
    }

    
    public static float disacountPorcent(Float value, Float porcent)
    {
        Float newvalue = (value * porcent) / 100;
        return value - newvalue;
    }
    
    public static void printCheckIn(String name, double porcentApply, double finalPrice, double price) {
        System.out.println("""
            nombre del cliente: %s
            Precio Total: $%.2f
            Bono de descuento: %.1f%%
            valor descuento: $%.2f
            --------------------------
            Precio final: $%.2f
            """.formatted(
                name, price,  porcentApply, (price * porcentApply) / 100 ,finalPrice == 0 ? price : finalPrice ));
    }

}
