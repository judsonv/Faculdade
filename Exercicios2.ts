class Produto{
    codigo;
    descricao;
    precoDeCompra;
    fabricante;
    importado;
  
    constructor(codigo:number, descricao:string, precoDeCompra:number, fabricante:string, importado:boolean){
      this.codigo = codigo;
      this.descricao = descricao;
      this.precoDeCompra = precoDeCompra;
      this.fabricante = fabricante;
      this.importado = importado;
    }
    
    valorDescontado(porcentagem:number):number{
      return this.precoDeCompra * (porcentagem / 100) + this.precoDeCompra
    }
    
  }
  
  const produto1 = new Produto(09, "pendrive", 10, "hp", true);
  console.log(produto1.precoDeCompra);
  
  const novoPreco = produto1.valorDescontado(20);
  console.log(novoPreco);

  