package ex2;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class View extends JFrame implements Observer{

    Controller controller = new Controller(this);
    private JTextField jTextFieldC;
    private JTextField jTextFieldF;

    public static void main(String[] args) {
        View view = new View();
    }

    public View() {
        controller.getTempurateData().add(this);
        init();
    }

    public void init() {
        this.setLayout(new BorderLayout());

        JPanel panelC = new JPanel();
        panelC.setLayout(new GridLayout(2,1));

        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());

         jTextFieldC = new JTextField("10",10);
        jTextFieldC.setEnabled(false);
        JButton button1 = new JButton("riseC");
        button1.addActionListener(controller);
        JButton button2 = new JButton("lowC");
        button2.addActionListener(controller);

        panel2.add(button1);
        panel2.add(button2);

        TitledBorder titledBorder = BorderFactory.createTitledBorder("Celius Temperate ");
        titledBorder.setTitleJustification(TitledBorder.CENTER);

        panelC.setBorder(titledBorder);
        panelC.add(jTextFieldC);
        panelC.add(panel2);

        JPanel panelF = new JPanel();
        panelF.setLayout(new GridLayout(2,1));
        JPanel panel4 = new JPanel();
        panel4.setLayout(new FlowLayout());

        jTextFieldF = new JTextField("50",10);
        jTextFieldF.setEnabled(false);
        JButton button3 = new JButton("riseF");
        button3.addActionListener(controller);
        JButton button4 = new JButton("lowF");
        button4.addActionListener(controller);

        panel4.add(button3);
        panel4.add(button4);

        TitledBorder titledBorder2 = BorderFactory.createTitledBorder("Fahrenheit Temperate ");
        titledBorder2.setTitleJustification(TitledBorder.CENTER);

        panelF.setBorder(titledBorder2);
        panelF.add(jTextFieldF);
        panelF.add(panel4);

        this.add(panelC, BorderLayout.NORTH);
        this.add(panelF, BorderLayout.SOUTH);
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    @Override
    public void update(double tempurateC, double tempurateF) {
        System.out.println("vao view");
        this.jTextFieldC.setText(tempurateC+"");
        this.jTextFieldF.setText(tempurateF+"");
    }

    public String getjTextFieldC() {
        return jTextFieldC.getText();
    }

    public void setjTextFieldC(JTextField jTextFieldC) {
        this.jTextFieldC = jTextFieldC;
    }

    public String getjTextFieldF() {
        return jTextFieldF.getText();
    }

    public void setjTextFieldF(JTextField jTextFieldF) {
        this.jTextFieldF = jTextFieldF;
    }
}
