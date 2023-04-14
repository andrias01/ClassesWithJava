package com.andresVelez.CalculatorJOpcion.app;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

public class JOptionApp {
    private static final ImageIcon APP_ICON = new ImageIcon(JOptionApp.class.getResource("uco.png"));
    private static final String APP_TITLE = "POO - Calculator";
    private static final Object[] APP_OPTIONS = Arrays.asList("sumar", "restar", "multiplicar", "dividir").toArray();

    public static void main(String[] args) throws MalformedURLException {
        //ImageIcon icon = new ImageIcon(new URL("https://th.bing.com/th/id/OIP.NE9tzDlYewfd6uPS6_KLIwAAAA?pid=ImgDet&rs=1"));
        //JOptionPane.showMessageDialog(null,"HOla mundo",APP_TITLE, JOptionPane.PLAIN_MESSAGE, APP_ICON);
        //String name = JOptionPane.showInputDialog("¿Cual es tu nombre", "Carlos velez");
        //String name = (String) JOptionPane.showInputDialog(null,"Selecciona tu nombre",APP_TITLE,JOptionPane.PLAIN_MESSAGE,APP_ICON,new Object[] {"Carlos", "David", "Andres", "Julian"},"David");
        //String name = (String) JOptionPane.showInputDialog(null,"Selecciona tu nombre",
        // APP_TITLE,JOptionPane.PLAIN_MESSAGE,APP_ICON, Arrays.asList("Carlos", "David", "Andres", "Julian").toArray(),"David");

//        int selectedOption = JOptionPane.showConfirmDialog(null,"Quieres continuar?",APP_TITLE,JOptionPane.YES_NO_CANCEL_OPTION);
        /*int selectedOption = JOptionPane.showConfirmDialog(null,"Seleccione tu boton");
        switch (selectedOption) {
            case JOptionPane.YES_OPTION -> showMessage("Seleccionó si...");
            case JOptionPane.NO_OPTION -> showMessage("Seleccionó NO..");
            default -> showMessage("Seleccionó otra cosa");
        }*/
        //showMessage("Opción elegida " + selectedOption);
        while (true){
            int selectedOption = JOptionPane.showOptionDialog(null,"Seleccione la operación a realizar",APP_TITLE, 0 ,0,
                    APP_ICON,APP_OPTIONS,null);
            switch (selectedOption) {
                case 0 -> showMessage("SUMAR");
                case 1 -> showMessage("RESTAR");
                case 2 -> showMessage("MULTIPLICAR");
                case 3 -> showMessage("DIVIDIR");
                default -> System.exit(0);
            }
        }

//        showMessage("Opción elegida " + selectedOption);
    }

    public static void showMessage(String message) {
        JOptionPane.showMessageDialog(null,message,APP_TITLE,JOptionPane.INFORMATION_MESSAGE, APP_ICON);
    }
}
