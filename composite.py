from __future__ import annotations
from abc import ABC, abstractmethod
from typing import List

# Aqui criaremos nosso Component
class EstruturaCarros(ABC):

 @abstractmethod
 def print_content(self)-> None: pass

 @abstractmethod
 def get_price(self)-> Float: pass

 def add(self, child: EstruturaCarros)-> None: pass
 def remove(self, child: EstruturaCarros)-> None: pass

# Aqui criaremos nosso Composite
class Carro(EstruturaCarros):
  def __init__(self, name: str)-> None:
   self.name = name
   self._children: List[EstruturaCarros]= []
  
  def print_content(self)-> None:
   print(f'\n{self.name}:') 
   for child in self._children:
    child.print_content()
 
  def get_price(self)-> Float:
   return sum([
     child.get_price()for child in self._children
   ])

  def add(self, child: EstruturaCarros)-> None:
   self._children.append(child)
   
  def remove(self, child: EstruturaCarros)-> None:
   if child in self._children:
     self._children.remove(child)

#Aqui criaremos nossas folhas (produtos):

class Produto(EstruturaCarros):
  def __init__(self, name: str, price: float)-> None:
    self.name = name
    self.price = price
    
  def print_content(self) -> None:
    print(self.name, self.price)
      
  def get_price(self) -> float:
    return self.price

if __name__== "__main__":
  #Leaf
  carro1 = Produto('Shelby', 153.00)
  carro2 = Produto('Fusion', 200.00)
  carro3 = Produto('Ferrari', 500.00)

  #Composite
  caixa_carros = Carro('Modelos de carros')
  caixa_carros.add(carro1)
  caixa_carros.add(carro2)
  caixa_carros.add(carro3)
  
  #Leaf
  rodas1 = Produto('esportivas', 500.00)
  rodas2 = Produto('casuais', 200.00)

  #Composite
  caixa_rodas = Carro('Modelos de rodas')
  caixa_rodas.add(rodas1)
  caixa_rodas.add(rodas2)

   #Leaf
  placa1 = Produto('Mercosul', 400.00)
  

  #Composite
  caixa_placa = Carro('Tipo de placa')
  caixa_placa.add(placa1)
  
  
 #Composite
  caixa_carro = Carro('Todos os itens')
  caixa_carro.add(caixa_carros)
  caixa_carro.add(caixa_rodas)
  caixa_carro.add(caixa_placa)
  caixa_carro.print_content()
  print(caixa_carro.get_price())
  

