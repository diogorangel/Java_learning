package aula07vacina;

import java.util.Scanner;
import java.awt.event.*;
import javax.swing.*; 

public class aula07vacina extends JPanel implements ActionListener {
    
    JLabel ibdose;
    JTextField vrdose;
    JLabel lbhoraini;
    JTextField vrhoraini;
    JLabel ibhorafim;
    JTextField vrhorafim;
    JButton b1;
    
    public aula07vacina() {
        ibdose = new JLabel("Informe quantidade doses totais para o dia: "); 
        vrdose = new JTextField("", 15);
        lbhoraini = new JLabel("Informe o horário de início do expediente: "); 
        vrhoraini = new JTextField("", 15);
        ibhorafim = new JLabel("Informe o horário de fim do expediente: ");
        vrhorafim = new JTextField("");
        
        b1 = new JButton("FECHAR");
        add(ibdose);
        add(vrdose);
        add(lbhoraini);
        add(vrhoraini);
        add(ibhorafim);
        add(vrhorafim);
        add(b1);
        b1.addActionListener(this);
    }

    public static void main(String[] args) {

 

        int[] faixasdoseaplicada = new int[6];
        String[] faixasidades = new String[6];
        faixasidades[1] = " maior de 90 anos ";
        faixasidades[2] = " 85 a 89  ";
        faixasidades[3] = " 80 a 84  ";
        faixasidades[4] = " 75 a 79  ";
        faixasidades[5] = " 65 a 74  ";
        int dosesestoque = 0;
        int dosessobradas = 0;
        int dosesaplicadas = 0;
        int horainicio = 0;
        int horarafim = 0;
        int faixasincremento;

 

        //*System.out.println("Informe quantidade doses totais para o dia: ");
        dosesestoque = new Scanner(System.in).nextInt();

 

        System.out.println("Informe o hrário de início do expediente: ");
        horainicio = new Scanner(System.in).nextInt();

 

        System.out.println("Informe o hrário de fim do expediente: ");
        horarafim = new Scanner(System.in).nextInt();//*

 

        if (horainicio >= horarafim) {
            System.out.println("Hora inicio não pode ser maior ou igual a hora fim ");
            System.exit(0);
        }

 

        for (faixasincremento = 1; faixasincremento <= 5; faixasincremento = faixasincremento + 1) {
            System.out.println("Informe quantidade doses aplicadas faixa  = : " + faixasidades[faixasincremento]);
            faixasdoseaplicada[faixasincremento] = new Scanner(System.in).nextInt();
            dosesaplicadas = dosesaplicadas + faixasdoseaplicada[faixasincremento];
            if (dosesaplicadas > dosesestoque) {
                System.out.print("Doses aplicadas não pode ser maior que dose de estoque" + dosesaplicadas);
                System.exit(0);
            }
        }

 

        dosessobradas = dosesestoque - dosesaplicadas;
        System.out.println("*** Resultado Geral ****");
        System.out.println("Hora inicial de atendimento : " + horainicio);
        System.out.println("Hora Final de atendimento : " + horarafim);
        System.out.println("Quantidade de Doses Estoque Inicio dia  : " + dosesestoque);
        System.out.println("Quantidade de Doses Aplicadas  : " + dosesaplicadas);
        System.out.println("Quantidade de Doses Sobradas  : " + dosessobradas);

 

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}