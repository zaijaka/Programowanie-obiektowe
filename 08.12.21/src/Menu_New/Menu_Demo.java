package Menu_New;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Menu_Demo extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu menuPlik, menuEdit;
    JMenuItem nProject, nFile, mWyjscie, radioButton, radioButton_2, mSub;
    JCheckBoxMenuItem checkBox , checkBox_2, checkBox_Sub;


    public Menu_Demo() {
        int DEFAULT_WIDTH = 300;
        int DEFAULT_HEIGHT = 300;
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setTitle("Menu Demo");
        setLayout(null);

        menuBar = new JMenuBar();
        //=========================================
        menuPlik = new JMenu("File");
        menuEdit = new JMenu("Edit");
        nProject = new JMenuItem("New Project", 'O');// dodanie menu Item wraz z memonic
        nProject.addActionListener(this);
        nFile = new JMenuItem("New File");
        nFile.addActionListener(this);
        checkBox = new JCheckBoxMenuItem("First CheckBox");
        checkBox.addActionListener(this);
        checkBox_2 = new JCheckBoxMenuItem("Second CheckBox");
        checkBox_2.addActionListener(this);
        checkBox_Sub = new JCheckBoxMenuItem("Sub CheckBox");
        checkBox_Sub.addActionListener(this);
        radioButton = new JRadioButtonMenuItem("First RadioButton");
        radioButton.addActionListener(this);
        radioButton_2 = new JRadioButtonMenuItem("Second RadioButton");
        radioButton_2.addActionListener(this);

        mSub = new JMenu("Sub Menu");
        mSub.add(checkBox_Sub);
        mWyjscie = new JMenuItem("Wyjscie");
        //dodanie od menu
        menuPlik.add(nProject);
        menuPlik.add(nFile);
        menuPlik.addSeparator();

        menuPlik.add(checkBox);
        menuPlik.add(checkBox_2);
        menuPlik.addSeparator();

        menuPlik.add(radioButton);
        menuPlik.add(radioButton_2);
        //wstawienie separatora
        menuPlik.addSeparator();
        menuPlik.add(mSub);
        menuPlik.add(mWyjscie);
        mWyjscie.addActionListener(this);

        //dodane skrótu klawiszowego.
        mWyjscie.setAccelerator(KeyStroke.getKeyStroke("ctrl X"));
        nProject.setAccelerator(KeyStroke.getKeyStroke("alt 1"));

        //metoda dodająca menuBar do okna
        setJMenuBar(menuBar);
        //dodanie poszczegolne elementy do mnu
        menuBar.add(menuPlik);
        menuBar.add(menuEdit);

    }


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                Menu_Demo frame = new Menu_Demo();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);

            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object zrodlo = e.getSource();

        if (zrodlo == mWyjscie) {
            dispose();
        } else if (zrodlo == nProject) {
            JFileChooser fc = new JFileChooser();//klas wykorzystywana do otwierania plikow
            if (fc.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
                File plik = fc.getSelectedFile();
                //wyświeltlenie nazwy
                JOptionPane.showMessageDialog(null,"wybrany plik: "+ plik.getAbsolutePath());
            }

        } else if (zrodlo == nFile) {
            JFileChooser fc = new JFileChooser();
            if(fc.showSaveDialog(null)==JFileChooser.APPROVE_OPTION){
                File plik = fc.getSelectedFile();
                //wyświeltlenie zapisanego obiektu
                JOptionPane.showMessageDialog(null,"wybrany plik: "+ plik);
            }
        }
    }
}


