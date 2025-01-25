//let nome:string="Judson";
//nome = "Vieira";

//let idade:number = 28;
//idade =33;

//let professor: boolean = true;
//professor = false;

//let numeros : number[] = [1,2,3,4,5,6];
//let nomes : string[] = ["a", "b", "c"];
//console.log(numeros.length);


//OBJETOS

//const usuario:{nome:string, idade:number} = {
 // nome: "Judson",
 // idade: 28,
//}

//TIPAGEM CONDICIONAL

//let qualquer: number | string;
//qualquer = "i";
//qualquer = 12;


//TYPE
//type TypeVar = number | string;
//let outraVar: TypeVar;


//ENUM

//enum Size{
 // P = "Pequeno",
 // M = "Médio",
 // G = "Grande"
//}


//type RoupaType = {
  //nome:string;
 // tamanho:string;
  
//}

//const roupa:RoupaType = {
 // nome: "calça",
 // tamanho: Size.M,
//}

//FUNÇÕES

//function soma(n1:number, n2:number=5):number{
  //return n1 + n2;
  
//}

//soma(10);


//EXERCÍCIO 1
 //function nome2(n1:string, n2:string):string{
  // return n1 + " " + n2;
 //}
//const nomeCompleto = nome2("Judson", "Vieira")

//console.log(nomeCompleto)

//EXERCICIO 1 OUTRA FORMA
//function nome3(n1:string, n2:string):string{
 //  return `${n1} ${n2}`;
 //}
//const nomeCompleto2 = nome3("Judson", "Vieira")

//PARAMETROS NOMEADOS
//interface Iparams{
 // nome:string;
 // sobrenome:string;
//}

//function concatenaNomes(params:Iparams):string{
 // return params.nome + params.sobrenome;
//}

//concatenaNomes({nome:"Judson", sobrenome:"Vieira"});

//SEGUNDA FORMA
interface Iparams{
    nome:string;
    sobrenome:string;
  }
  
  function concatenaNomes({nome, sobrenome, idade}):Iparams):string{
    return `${nome} ${sobrenome}`;
  }
  
  var nomeC = concatenaNomes({nome:"Judson", sobrenome:"Vieira", idade:28});
  
  
  
  
  