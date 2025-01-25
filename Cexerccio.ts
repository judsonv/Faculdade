class Usuario {
    nome;
    sobrenome;
    anoNascimento;
    setorQueTrabalha;
    salario;
  
    constructor(nome: string,
      sobrenome: string,
      anoNascimento: number,
      setorQueTrabalha: string,
      salario: number) {
      this.nome = nome;
      this.sobrenome = sobrenome;
      this.anoNascimento = anoNascimento;
      this.setorQueTrabalha = setorQueTrabalha;
      this.salario = salario;
    }
  
    
    juntarNomeComSobrenome(): string {
      return `${this.nome} ${this.sobrenome}`;
  
    }
  
  
    verificarSetorQueUsuarioTrabalha(setor: string): boolean {
      if (this.setorQueTrabalha === setor) {
        return true;
      }
  
      return false;
    }
  
  
    
    aumentarSalario(porcentagem: number): number {
      return this.salario * (porcentagem / 100) + this.salario;
    }
  
  
  }
  
  const usuario1 = new Usuario("Judson", "Vieira", 1993, "Ti", 2000);
  console.log(usuario1.nome);
  
  const trabalhaNoSetor = usuario1.verificarSetorQueUsuarioTrabalha("Ti");
  console.log(trabalhaNoSetor);
  
  const novoSalario = usuario1.aumentarSalario(10);
  console.log(novoSalario);