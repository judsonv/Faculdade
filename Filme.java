
public class Filme {
    private String titulo;
    private String diretor;
    private String duracao;
    private int ano;

    public Filme(String titulo, String diretor, String duracao, int ano) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void informacoes(){
        System.out.println("Titulo= "+ titulo);
        System.out.println("Diretor= "+ diretor);
        System.out.println("Duracao= "+ duracao);
        System.out.println("Ano= "+ ano);
    }
           
    
}

