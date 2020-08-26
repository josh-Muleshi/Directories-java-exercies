package com.company;
import javax.swing.JOptionPane;
public class Main extends Nozero{

    public static void main(String[] args) {
        //affichage();
        int selection;
        boolean isYes;
        selection = JOptionPane.showConfirmDialog(null,
                "Do you want to upgrade to first class?");
        isYes = (selection == JOptionPane.YES_OPTION);
        JOptionPane.showMessageDialog(null,
                "You responded " + isYes);
    }
}

