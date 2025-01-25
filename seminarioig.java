import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class Main {
  public static void main(String[] args) {
    
    JFrame janela = new JFrame("Tela de cadastro Site de Cifras");
    janela.setSize(400, 400);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janela.setVisible(true);

    JPanel painel=new JPanel();
    painel.setBackground(Color.pink);
    janela.setContentPane(painel);
    painel.setLayout(new GridLayout(0,2));
    
    JLabel rotulo=new JLabel("Nome completo: ");
    painel.add(rotulo);

    JTextField campoTexto=new JTextField(20);
    painel.add(campoTexto);

    JLabel rotulo2=new JLabel("E-mail: ");
    painel.add(rotulo2);

    JTextField campoTexto2=new JTextField(20);
    painel.add(campoTexto2);


    JLabel rotulo3=new JLabel("Senha:");
    painel.add(rotulo3);

    JPasswordField campoSenha=new JPasswordField(20);
    painel.add(campoSenha);

    
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
            rotulo2.setText(campoTexto.getText()+ " cadastro realizado com sucesso");
            janela2.add(rotulo2);
            }
        });
 
    JButton botao2=new JButton("LIMPAR");
    painel.add(botao2);

   
    JLabel rotulo7=new JLabel("Como conheceu o site? ");
    painel.add(rotulo7);
      JTextArea campoGrande=new JTextArea(10,20);
    painel.add(campoGrande);
     JLabel vazio4=new JLabel(" ");
    painel.add(vazio4);
     JButton botao3=new JButton("ENVIAR RESPOSTA: ");
    painel.add(botao3);
     

  

    
    JLabel rotulo4=new JLabel("Qual seu estilo musical favorito?");
    painel.add(rotulo4);

        JLabel vazio3=new JLabel(" ");
    painel.add(vazio3);

    JCheckBox check1=new JCheckBox("rock");
    painel.add(check1);
    JCheckBox check2=new JCheckBox("sertanejo");
    painel.add(check2);
    JCheckBox check3=new JCheckBox("forró");
    painel.add(check3);
    JCheckBox check4=new JCheckBox("funk");
    painel.add(check4);

  
    
  JLabel rotulo5=new JLabel("Qual é a sua plataforma de música favorita: ");
    painel.add(rotulo5);

    String [] itens=new String[5];
    itens[0]="Spotify";
    itens[1]="Deezer";
    itens[2]="Amazon Music";
    itens[3]="Youtube Premiun";
    itens[4]="Itunes";
    JComboBox menu=new JComboBox(itens);
    painel.add(menu);

    

    JLabel rotulo6=new JLabel("Sexo:");
    painel.add(rotulo6);

    JLabel vazio2=new JLabel(" ");
    painel.add(vazio2);

    JRadioButton radio1=new JRadioButton("Feminino");
    painel.add(radio1);
    JRadioButton radio2=new JRadioButton("Masculino");
    painel.add(radio2);
    ButtonGroup grupoBotoes=new ButtonGroup();
    grupoBotoes.add(radio1);
    grupoBotoes.add(radio2);


   JLabel rotulo8=new JLabel("Você toca algum instrumento musical:");
    painel.add(rotulo8);

    JLabel vazio5=new JLabel(" ");
    painel.add(vazio5);

    JRadioButton radio3=new JRadioButton("Sim");
    painel.add(radio3);
    JRadioButton radio4=new JRadioButton("Não");
    painel.add(radio4);
    ButtonGroup grupoBotoes2=new ButtonGroup();
    grupoBotoes.add(radio3);
    grupoBotoes.add(radio4);

    JLabel rotulo9=new JLabel("Caso toque, qual instrumento(s) você toca?");
    painel.add(rotulo9);

        JLabel vazio9=new JLabel(" ");
    painel.add(vazio9);

    JCheckBox check5=new JCheckBox("violão");
    painel.add(check5);
    JCheckBox check6=new JCheckBox("guitarra");
    painel.add(check6);
    JCheckBox check7=new JCheckBox("teclado");
    painel.add(check7);
    JCheckBox check8=new JCheckBox("bateria");
    painel.add(check8);

  }
}