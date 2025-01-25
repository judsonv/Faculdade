import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class Main {
  public static void main(String[] args) {
    
    JFrame janela = new JFrame("Cadastramento de  Alunos");
    janela.setSize(400, 400);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janela.setVisible(true);

    JPanel painel=new JPanel();
    painel.setBackground(Color.gray);
    janela.setContentPane(painel);
    painel.setLayout(new GridLayout(0,2));
    
    JLabel rotulo=new JLabel("Matrícula: ");
    painel.add(rotulo);

    JTextField campoTexto=new JTextField(20);
    painel.add(campoTexto);

    JLabel rotulo2=new JLabel("Nome: ");
    painel.add(rotulo2);

    JTextField campoTexto2=new JTextField(20);
    painel.add(campoTexto2);

   
   
    
    

     JLabel rotulo5=new JLabel("Curso: ");
    painel.add(rotulo5);

    String [] itens=new String[4];
    itens[0]="Técnico em Informática";
    itens[1]="Técnico em Eletrotécnica";
    itens[2]="Técnico em Zootecnia";
    itens[3]="Técnica em Agropecuária";
    JComboBox menu=new JComboBox(itens);
    painel.add(menu);
    
  

    JLabel rotulo6=new JLabel("Turno:");
    painel.add(rotulo6);

     JLabel vazio3=new JLabel(" ");
    painel.add(vazio3);

    JCheckBox check1=new JCheckBox("Manhã");
    painel.add(check1);
    JCheckBox check2=new JCheckBox("Tarde");
    painel.add(check2);
    JCheckBox check3=new JCheckBox("Noite");
    painel.add(check3);
    
     JLabel vazio4=new JLabel(" ");
    painel.add(vazio4);

   JLabel rotulo9=new JLabel("Sexo:");
    painel.add(rotulo9);

    JLabel vazio2=new JLabel(" ");
    painel.add(vazio2);

    JRadioButton radio1=new JRadioButton("Feminino");
    painel.add(radio1);
    JRadioButton radio2=new JRadioButton("Masculino");
    painel.add(radio2);
    ButtonGroup grupoBotoes=new ButtonGroup();
    grupoBotoes.add(radio1);
    grupoBotoes.add(radio2);


     JLabel rotulo10=new JLabel("Idade: ");
    painel.add(rotulo10);

    JTextField campoTexto6=new JTextField(5);
    painel.add(campoTexto6);

     JButton botao1=new JButton("CADASTRAR");
    painel.add(botao1);
       botao1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            botao1.setText("Cadastrado!!");
            JFrame janela2=new JFrame("CADASTRADO");
            janela2.setSize(200,200);
            janela2.setVisible(true);
                   
            JLabel rotulo2=new JLabel();
            rotulo2.setText("Aluno " + campoTexto2.getText() +  " cadastrado com sucesso no Curso X" );
            janela2.add(rotulo2);
            }
        });
 
    JButton botao2=new JButton("LIMPAR");
    painel.add(botao2);

       JButton botao8=new JButton("FECHAR");
    painel.add(botao8);



  }
}
