/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin25.pkg3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author oquintansocampo
 */
public class Ventana implements ActionListener {

    JFrame marco;
    JPanel panel;
    JButton boton1, boton2;
    JLabel etiqueta;

    public Ventana() {
        marco = new JFrame(" Evento ");
        panel = new JPanel();
        boton1 = new JButton(" Saludo ");
        boton2 = new JButton(" Despedida ");
        etiqueta = new JLabel();
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(etiqueta);
        marco.add(panel);

        marco.setSize(200, 150);
        marco.setResizable(false);
        marco.setLocationRelativeTo(null);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (boton1 == e.getSource()) {
            etiqueta.setText("Un saludo a DAM");
        } else if (boton2 == e.getSource()) {
            etiqueta.setText("Fin del programa");
        }
    }
}
