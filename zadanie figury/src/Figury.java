import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.math.*;

public class Figury extends JFrame {
    private JTextField textBokA;
    private JTextField textBokB;
    private JTextField textWysokosc;
    private JTextField textPromien;
    private JTextField textPole;
    private JTextField textObwod;
    private JTextField textObjetosc;
    private JButton obliczButton;
    private JButton wyczyśćButton;
    private JPanel panel1;
    private JRadioButton trapezRadioButton;
    private JRadioButton trójkątRadioButton;
    private JRadioButton prostokątRadioButton;
    private JRadioButton kwadratRadioButton;
    private JRadioButton sześcianRadioButton;
    private JRadioButton prostopadłościanRadioButton;
    private JRadioButton walecRadioButton;
    private JRadioButton kulaRadioButton;

    private double a, b, h, r, pole, Obwod, objetosc;


    public static void main(String[] args) {
        Figury Figury = new Figury();
        Figury.setVisible(true);
    }


    public Figury() {
        super("Kalkulator Figur Geometrycznych");
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setContentPane(new Figury().panel1);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setSize(600, 360);

        obliczButton.addActionListener(listener);
        wyczyśćButton.addActionListener(listener);


        textBokA.setEditable(false);
        textBokB.setEditable(false);
        textWysokosc.setEditable(false);
        textPromien.setEditable(false);
        textPole.setEditable(false);
        textObwod.setEditable(false);
        textObjetosc.setEditable(false);
    }

    ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object ob1 = e.getSource();
            if (kwadratRadioButton.isSelected()) {
                textBokA.setEnabled(true);
                textBokB.setEnabled(false);
                textWysokosc.setEnabled(false);
                textPromien.setEnabled(false);
                textPole.setEnabled(false);
                textObwod.setEnabled(false);
                textObjetosc.setEnabled(true);
            } else if (prostokątRadioButton.isSelected()) {
                textBokA.setEnabled(true);
                textBokB.setEnabled(true);
                textWysokosc.setEnabled(false);
                textPromien.setEnabled(false);
                textPole.setEnabled(false);
                textObwod.setEnabled(false);
                textObjetosc.setEnabled(true);
            } else if (trójkątRadioButton.isSelected()) {
                textBokA.setEnabled(true);
                textBokB.setEnabled(true);
                textWysokosc.setEnabled(true);
                textPromien.setEnabled(true);
                textPole.setEnabled(false);
                textObwod.setEnabled(false);
                textObjetosc.setEnabled(true);
            } else if (trapezRadioButton.isSelected()) {
                textBokA.setEnabled(true);
                textBokB.setEnabled(true);
                textWysokosc.setEnabled(true);
                textPromien.setEnabled(true);
                textPole.setEnabled(false);
                textObwod.setEnabled(false);
                textObjetosc.setEnabled(true);
            } else if (sześcianRadioButton.isSelected()) {
                textBokA.setEnabled(true);
                textBokB.setEnabled(false);
                textWysokosc.setEnabled(false);
                textPromien.setEnabled(false);
                textPole.setEnabled(false);
                textObwod.setEnabled(true);
                textObjetosc.setEnabled(true);
            } else if (prostopadłościanRadioButton.isSelected()) {
                textBokA.setEnabled(true);
                textBokB.setEnabled(true);
                textWysokosc.setEnabled(true);
                textPromien.setEnabled(false);
                textPole.setEnabled(false);
                textObwod.setEnabled(true);
                textObjetosc.setEnabled(true);
            } else if (walecRadioButton.isSelected()) {
                textBokA.setEnabled(true);
                textBokB.setEnabled(true);
                textWysokosc.setEnabled(false);
                textPromien.setEnabled(false);
                textPole.setEnabled(true);
                textObwod.setEnabled(true);
                textObjetosc.setEnabled(true);
            } else if (kulaRadioButton.isSelected()) {
                textBokA.setEnabled(false);
                textBokB.setEnabled(false);
                textWysokosc.setEnabled(false);
                textPromien.setEnabled(false);
                textPole.setEnabled(true);
                textObwod.setEnabled(true);
                textObjetosc.setEnabled(true);
            }

            if ((ob1 == kwadratRadioButton || ob1 = obliczButton)) {
                a = Double.parseDouble(textBokA.getText());
                pole = a * a;
                Obwod = 4 * a;
                textPole.setText(String.valueOf(pole));
                textObwod.setText(String.valueOf(Obwod));
            } else if (ob1 == prostokątRadioButton || ob1 == obliczButton) {
                a = Double.parseDouble(textBokA.getText());
                b = Double.parseDouble(textBokB.getText());
                pole = a * b;
                Obwod = 2 * a + 2 * b;
                textPole.setText(String.valueOf(pole));
                textObwod.setText(String.valueOf(Obwod));
            } else if (ob1 == trójkątRadioButton || ob1 == obliczButton) {
                a = Double.parseDouble(textBokA.getText());
                b = Double.parseDouble(textBokA.getText());
                h = Double.parseDouble(textWysokosc.getText());
                pole = a * h / 2;
                Obwod = a + b + c;
                textPole.setText(String.valueOf(pole));
                textObwod.setText(String.valueOf(Obwod));
            } else if (ob1 == trapezRadioButton || ob1 == obliczButton) {
                a = Double.parseDouble(textBokA.getText());
                b = Double.parseDouble(textBokB.getText());
                h = Double.parseDouble(textWysokosc.getText());
                pole = (a + b) * h / 2;
                Obwod = a + b * 3;
                textPole.setText(String.valueOf(pole));
                textObwod.setText(String.valueOf(Obwod));
            } else if (ob1 == sześcianRadioButton || ob1 == obliczButton) {
                a = Double.parseDouble(textBokA.getText());
                pole = 6 * (a * a);
                objetosc = a * a * a;
                textPole.setText(String.valueOf(pole));
                textObjetosc.setText(String.valueOf(objetosc));
            } else if (ob1 == prostopadłościanRadioButton || ob1 == obliczButton) {
                a = Double.parseDouble(textBokA.getText());
                b = Double.parseDouble(textBokB.getText());
                h = Double.parseDouble(textWysokosc.getText());
                pole = 2 * a * b + 2 * a * h + 2 * h * b;
                objetosc = a * b * h;
                textPole.setText(String.valueOf(pole));
                textObjetosc.setText(String.valueOf(objetosc));
            } else if (ob1 == walecRadioButton || ob1 == obliczButton) {
                h = Double.parseDouble(textBokA.getText());
                r = Double.parseDouble(textPromien.getText());
                pole = 2 * 3.14 * (r * r) + 2 * 3.14 * r * h;
                objetosc = 3.14 * (r * r) * h;
                textPole.setText(String.valueOf(pole));
                textObjetosc.setText(String.valueOf(objetosc));
            } else if (ob1 == kulaRadioButton || ob1 == obliczButton) {
                r = Double.parseDouble(textPromien.getText());
                pole = 4 * Math.PI * (r * r);
                objetosc = 4 / 3 * 3.14 * (r * r * r);
                textPole.setText(String.valueOf(pole));
                textObjetosc.setText(String.valueOf(objetosc));


            } else if (ob1 == wyczyśćButton) {
                textBokA.setText("");
                textBokB.setText("");
                textWysokosc.setText("");
                textPromien.setText("");
                textPole.setText("");
                textObwod.setText("");
                textObjetosc.setText("");
                kwadratRadioButton.setSelected(false);
                prostokątRadioButton.setSelected(false);
                trójkątRadioButton.setSelected(false);
                trapezRadioButton.setSelected(false);
                sześcianRadioButton.setSelected(false);
                prostopadłościanRadioButton.setSelected(false);
                walecRadioButton.setSelected(false);
                kulaRadioButton.setSelected(false);
            }
        }

        ;
    };
}




