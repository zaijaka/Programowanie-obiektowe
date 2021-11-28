import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUITEMP extends JFrame{
    private JTextField textFCelcjusz;
    private JTextField textFFarenheit;
    private JButton konwertujButton;
    private JButton wyczyscButton;
    private JButton wyjscieButton;
    private JRadioButton czionkaMałaRadioButton;
    private JRadioButton czionkaŚredniaRadioButton;
    private JRadioButton czicionkaDużaRadioButton;
    private JCheckBox wielkieLiteryCheckBox;
    private JButton resetujButton;
    private JPanel panel1;

    private double tempC, tempF;

    public static void main(String[] args){
        GUITEMP conTemp = new GUITEMP();
        conTemp.setVisible(true);
    }

    public GUITEMP(){
        super("Konwerowanie stopni C -> F");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        setLayout(null);
        konwertujButton.addActionListener(listener);
        wyczyscButton.addActionListener(listener);
        wyjscieButton.addActionListener(listener);
        wyjscieButton.addActionListener(listener);
        wielkieLiteryCheckBox.addActionListener(listener);
        czionkaMałaRadioButton.addActionListener(listener);
        czionkaŚredniaRadioButton.addActionListener(listener);
        czicionkaDużaRadioButton.addActionListener(listener);
    }

    ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object ob1 = e.getSource();
            if (ob1 == konwertujButton || ob1 == textFCelcjusz){
                tempC = Double.parseDouble(textFCelcjusz.getText());
                tempF = 32.00 + (9.0 / 5.0) * tempC;
                textFFarenheit.setText(String.valueOf(tempF));
            } else if (ob1 == wyczyscButton){
                textFCelcjusz.setText("");
                textFFarenheit.setText("");
                if(wielkieLiteryCheckBox.isSelected() == true) wielkieLiteryCheckBox.setSelected(false);
                else if(czionkaMałaRadioButton.isSelected() == true) czionkaMałaRadioButton.setSelected(false);
                else if(czionkaŚredniaRadioButton.isSelected() == true) czionkaŚredniaRadioButton.setSelected(false);
                else if(czicionkaDużaRadioButton.isSelected() == true) czicionkaDużaRadioButton.setSelected(false);

            } else if (ob1 == wielkieLiteryCheckBox) {
                if(wielkieLiteryCheckBox.isSelected() == true) {
                    textFFarenheit.setFont(new Font("SensSerif", Font.BOLD, 18));
                } else {
                    textFFarenheit.setFont(new Font("SensSerif", Font.PLAIN, 12));
                }
            } else if (ob1 == czionkaMałaRadioButton) {
                textFFarenheit.setFont(new Font("SensSerif", Font.PLAIN, 8));
            } else if (ob1 == czionkaŚredniaRadioButton) {
                textFFarenheit.setFont(new Font("SensSerif", Font.PLAIN, 12));
            } else if (ob1 == czicionkaDużaRadioButton) {
                textFFarenheit.setFont(new Font("SensSerif", Font.PLAIN, 20));
            }
        }
    };


}
