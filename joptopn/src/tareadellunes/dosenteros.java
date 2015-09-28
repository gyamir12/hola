package tareadellunes;

import javax.swing.*;

/**
 * Created by Yamir Gudino on 09/27/2015.
 */
public class dosenteros {

    public static void main(String[] args) {
        //encontrar el mayor valor de dos enteros leidos del teclado

        String name = JOptionPane.showInputDialog("introduzca un numero entero");
        int x = Integer.parseInt(name);

        name = JOptionPane.showInputDialog("introduzca otro numero entero");
        int y = Integer.parseInt(name);

        if (x>y){
            String msg = x+" es mayor que "+y;
            JOptionPane.showMessageDialog(null, msg);
        }

        else if (x == y){
            String msg= " Son iguales ";
            JOptionPane.showMessageDialog(null, msg);
        }
        else {
            String msg = y + " es mayor que " + x;
            JOptionPane.showMessageDialog(null, msg);
        }

    }
}