import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;

public class Calculadora {

    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Calculadora window = new Calculadora();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Calculadora() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setForeground(new Color(0, 255, 128));
        frame.setBounds(100, 100, 330, 458);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);


        textField = new JTextField();
        textField.setBounds(32, 82, 86, 20);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(176, 82, 86, 20);
        frame.getContentPane().add(textField_1);
        textField_1.setColumns(10);

        JLabel labelResultado = new JLabel("*********");
        labelResultado.setBounds(122, 11, 54, 39);
        frame.getContentPane().add(labelResultado);

        JButton btnSomar = new JButton("   +   ");
        btnSomar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor1 = Double.parseDouble(textField.getText());
                double valor2 = Double.parseDouble(textField_1.getText());

                labelResultado.setText(""+ (valor1 + valor2));
            }
        });
        btnSomar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnSomar.setBounds(32, 152, 89, 23);
        frame.getContentPane().add(btnSomar);

        JButton btnMenos = new JButton("   -   ");
        btnMenos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor1 = Double.parseDouble(textField.getText());
                double valor2 = Double.parseDouble(textField_1.getText());

                labelResultado.setText("" + (valor1 - valor2));
            }
        });
        btnMenos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnMenos.setBounds(176, 152, 89, 23);
        frame.getContentPane().add(btnMenos);

        JButton btnMult = new JButton("   x   ");
        btnMult.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor1 = Double.parseDouble(textField.getText());
                double valor2 = Double.parseDouble(textField_1.getText());

                labelResultado.setText("" + (valor1 * valor2));
            }
        });
        btnMult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnMult.setBounds(29, 225, 89, 23);
        frame.getContentPane().add(btnMult);

        JButton btnDivi = new JButton("   ÷   ");
        btnDivi.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor1 = Double.parseDouble(textField.getText());
                double valor2 = Double.parseDouble(textField_1.getText());

                labelResultado.setText("" + (valor1 / valor2));
            }
        });
        btnDivi.setBounds(176, 225, 89, 23);
        frame.getContentPane().add(btnDivi);

    }
}
