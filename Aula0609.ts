interface IAluno {
    id: number;
    matricula: string;
    nome: string;
  
  }
  
  class Database {
  
    private static instance: Database | null = null;
  
    private alunos: IAluno[] = [];
  
    private constructor() { }
  
    public static getInstance(): Database {
      if (Database.instance === null) {
        Database.instance = new Database();
  
      }
      return Database.instance;
    }
  
  
  
    create(aluno: IAluno): void {
      this.alunos.push(aluno);
    }
  
    read(): IAluno[] {
      return this.alunos;
  
    }
  
    delete(id: number): void {
      this.alunos = this.alunos.filter((item) => item.id !== id);
    }
  
  }
  
  
  
  
  const db = Database.getInstance();
  db.create({
    id: 1,
    matricula: '5252',
    nome: 'Judson',
  });
  
  
  
  db.create({
    id: 2,
    matricula: '5259',
    nome: 'Junior',
  });
  
  
  
  
  const alunos = db.read();
  console.log(alunos);
  
  db.delete(2);
  
  console.log(alunos);
  
  
  
  //const db2 = Database.getInstance();
  
  