package tareadellunes;

import javax.swing.*;

/**
 * Created by Yamir Gudino on 09/27/2015.
 */
public class unentero {

    public static void main(String[] args) {
        /*leer un valor entero y determinar si se trata de:
    *par o impar,
    * positivo, negativo o neutro
     */
        String name = "";
        name= JOptionPane.showInputDialog("introduzca un numero entero");
        int x = Integer.parseInt(name);
        if (x% 2 == 0) {
            if (x > 0){
                String msg ="el numero " +x+ " es positivo y es par";
                JOptionPane.showMessageDialog(null, msg);


            }
            else if (x == 0){
                String msg ="el numero " +x+ " es neutro y es par";
                JOptionPane.showMessageDialog(null, msg);
            }
            else {
                String msg ="el numero " +x+ " es negativo y es par";
                JOptionPane.showMessageDialog(null, msg);
            }
        }
        else {
            if (x > 0) {
                String msg ="el numero " + x + " es positivo y es impar";
                JOptionPane.showMessageDialog(null, msg);
            } else {
                String msg =  x+  " es negativo y es impar";
                JOptionPane.showMessageDialog(null, msg);
            }
        }




    }
}
