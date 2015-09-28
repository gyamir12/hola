package tareadellunes;
import java.util.Random;
import javax.swing.JOptionPane;

//imprimir dos valores enteros que vayan del 1 al 100
// Author: Yamir Gudino
public class Main {

    public static void main(String[] args) {
	// write your code here
        Random  rnd = new Random();


        String msg ="primer Numero aleatorio entero entre (1,100) : "+(int)(rnd.nextDouble() * 100 + 1);
        String msg2 ="segundo Numero aleatorio entero entre (1,100) : "+(int)(rnd.nextDouble() * 100 + 1);
        JOptionPane.showMessageDialog(null, msg);
        JOptionPane.showMessageDialog(null, msg2);


    }
}
