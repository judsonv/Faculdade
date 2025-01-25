import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Main {
  public static void main(String[] args) {
    
    JFrame janela = new JFrame("Cadastro de Professores");
    janela.setSize(300, 300);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janela.setVisible(true);

    
    JPanel painel=new JPanel();
    painel.setBackground(Color.gray);
    janela.setContentPane(painel);
    painel.setLayout(new GridLayout(0,2));
  

    
    JLabel rotulo=new JLabel("Nome completo: ");
    painel.add(rotulo);

    JTextField campoTexto=new JTextField(20);
    painel.add(campoTexto);

    JLabel rotulo2=new JLabel("Registro: ");
    painel.add(rotulo2);

    JTextField campoTexto2=new JTextField(20);
    painel.add(campoTexto2);



    JLabel rotulo3=new JLabel("Senha:");
    painel.add(rotulo3);

    JPasswordField campoSenha=new JPasswordField(20);
    painel.add(campoSenha);

     

  JLabel rotulo5=new JLabel("Título: ");
    painel.add(rotulo5);

    String [] itens=new String[3];
    itens[0]="Especialista";
    itens[1]="Mestre";
    itens[2]="Doutor";
    
    JComboBox menu=new JComboBox(itens);
    painel.add(menu);

     JLabel rotulo8=new JLabel("Data de admissão: ");
    painel.add(rotulo8);

    JTextField campoTexto4=new JTextField(8);
    painel.add(campoTexto4);


    
    JButton botao1=new JButton("SALVAR");
    painel.add(botao1);
     botao1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            botao1.setText("CADASTRADO!!!");
            JFrame janela2=new JFrame("CADASTRADO");
            janela2.setSize(200,200);
            janela2.setVisible(true);
                   
            JLabel rotulo2=new JLabel();
            rotulo2.setText(campoTexto.getText()+ " Professor(a) X cadastrado(a) com sucesso");
            janela2.add(rotulo2);
            }
        });

    JButton botao2=new JButton("LIMPAR");
    painel.add(botao2);

    
 
  }

}