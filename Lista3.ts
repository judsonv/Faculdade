interface IProduct{
    codigo: string | number;
    nome: string;
    preco: number;
    fabricante: string;
  }
  
  class Singleton {
    private static instance: Singleton | null = null;
  
    private products: IProduct[] = [];
  
    private constructor() { }
  
  interface IProduct {
    codigo: string | number;
    nome: string;
    preco: number;
    fabricante: string;
  }
  
  class Singleton {
    private static instance: Singleton | null = null;
  
    private products: IProduct[] = [];
  
    private constructor() { }
  
    static getInstance(): Singleton {
      if (Singleton.instance === null) {
  
        Singleton.instance = new Singleton();
  
      }
      return Singleton.instance;
    }
  
    getProducts(): IProduct[] {
      return this.products;
    }
  
    addProduct({ codigo, fabricante, nome, preco }: IProduct) {
      this.products = [...this.products, { codigo, fabricante, nome, preco }]
    }
  
    removeProduct(codigo: string | number): void {
      this.products = this.products.filter((product) => product.codigo !== codigo);
    }
  
    findProductByCode(codigo: string | number): IProduct | undefined {
      const product = this.products.find((product) => product.codigo === codigo);
      return product;
    }
  
    updateNameProduct(codigo: string | number, newName: string, newPreco:number) {
      const product = this.products.find((product) => product.codigo === codigo)
  
  
      if (product) {
        product.nome = newName;
        product.preco = newPreco;
      }
    }
  
  
  }
  
  const sg1 = Singleton.getInstance();
  
  sg1.addProduct({
    codigo: 1,
    fabricante: 'Minas Fab',
    nome: "Queijo Minas",
    preco: 20
  })
  sg1.addProduct({
    codigo: 2,
    fabricante: 'SP Fab',
    nome: "Queijo SP",
    preco: 25
  })
  
  
  //sg1.removeProduct(1)
  const products = sg1.getProducts();
  console.log(products);
  
  sg1.updateNameProduct(1, "Queijo Minas Gerais", 50)
  
  const updatedProducts = sg1.getProducts();
  
  console.log(updatedProducts);
  
  
  