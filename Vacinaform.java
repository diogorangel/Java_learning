package Vacinaform; 

// JLABEL + JTEXTFIELD + JBUTTON + EVENTO 

 

import java.awt.event.*; 

import javax.swing.*; 

 

public class Vacinaform extends JPanel implements ActionListener { 

 

    JLabel lbdose; 

    JTextField vrdose; 

    JLabel lbhoraini; 

    JTextField vrhoraini; 

    JLabel lbhorafim; 

    JTextField vrhorafim; 

    JButton b1; 

     

 

    public Vacinaform() { 

        lbdose = new JLabel("Informe quantidade doses totais para o dia: "); 

        vrdose = new JTextField("", 15); 

        lbhoraini = new JLabel("Informe o horário de início do expediente: "); 

        vrhoraini = new JTextField("", 15); 

        lbhorafim = new JLabel("Informe o horário de FIM do expediente: "); 

        vrhorafim = new JTextField("", 15); 

       

        b1 = new JButton("FECHAR"); 

        add(lbdose); 

        add(vrdose); 

        add(lbhoraini); 

        add(vrhoraini); 

        add(lbhorafim); 

        add(vrhorafim); 

        add(b1); 

        b1.addActionListener(this); 

    } 

 

    public void actionPerformed(ActionEvent evt) { 

        Object source = evt.getSource(); 

        System.exit(0); 

    } 

 

    public static void main(String[] args) { 

        JFrame Vacinaform = new JFrame("Exemplo com JLabel, JTextField e JButton"); 

        Vacinaform.addWindowListener(new WindowAdapter() { 

            public void windowClosing(WindowEvent e) { 

                System.exit(0); 

            } 

        }); 

        Vacinaform.setContentPane( 

        new Vacinaform()); 

        Vacinaform.setSize(500 ,350); 

        Vacinaform.show(); 

    } 

} 