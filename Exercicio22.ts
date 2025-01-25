interface IProdutos {
    codigo: number;
    nome: string;
    preco: number;
    fabricante: string;
  }
  
  class Database {
  
    private static instance: Database | null = null;
  
    private produtos: IProdutos[] = [];
  
    private constructor() { }
  
    public static getInstance(): Database {
      if (Database.instance === null) {
        Database.instance = new Database();
      }
      return Database.instance;
    }
  
    create(produto: IProdutos): void {
      this.produtos.push(produto);
    }
  
    read(): IProdutos[] {
      return this.produtos;
    }
  
    delete(codigo: number): void {
      this.produtos = this.produtos.filter((item) => item.codigo !== codigo); 
    }
  
    search(codigo:number):IProdutos | null {
      for(var i =  0; i <this.produtos.length; i++){
    if(this.produtos[i].codigo == codigo){
      return this.produtos[i];
    }
      }
  return null;
    }
  }
  
  
  const db = Database.getInstance();
  db.create({
    codigo: 1234,
    nome: 'ix35',
    preco: 80.000,
    fabricante: 'Hiunday',
  });
  
  
  
  db.create({
    codigo: 1034,
    nome: 'Shelby',
    preco: 100.000,
    fabricante: 'Mustang',
    
  });
  
  db.create({
    codigo: 1057,
    nome: 'Fusion',
    preco: 75.000,
    fabricante: 'Ford',
    
  });
  
  const produtos = db.read(); 
  
  db.delete(1057);
  
  console.log(db.read());
  console.log(produtos)
  console.log("Buscar produto com código 1234");
  console.log(db.search(1234));