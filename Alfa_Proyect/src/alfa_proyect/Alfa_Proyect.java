/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfa_proyect;
import javax.swing.JOptionPane;

/**
 *
 * @author joterodelrio
 */
public class Alfa_Proyect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String passwordInput;
        String password = "adrigay";
        passwordInput = JOptionPane.showInputDialog("Introduzca su contraseña por favor:");
        if (password.equals(passwordInput)){
            JOptionPane.showMessageDialog(null, "Bienvenido Jota!!!");
        }
        else{
            JOptionPane.showMessageDialog(null,"Error de contraseña");
        }
           
        //Comentario para segundo commit
        JOptionPane.showMessageDialog(null,"Esto es un mensaje para Adri: Te quiero");
        System.out.println("el mikys cambió esto");
    }
    //cambio en el proyect alfa de Jorge
}
