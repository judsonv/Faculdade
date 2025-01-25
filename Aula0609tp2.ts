class Usuario {
    private matricula;
    private nome;
    constructor(matricula: string, nome: string) {
      this.matricula = matricula;
      this.nome = nome;
    }
    getNome(): string {
      return this.nome;
    }
    setNome(novoNome: string): void {
      this.nome = novoNome;
    }
    const usuario1 = new Usuario("2568", "Judson Vieira");
    usuario1.setNome("Joao");
    usuario1.getNome();
  
  }