from abc import ABCMeta, abstractmethod

class Transporte(metaclass=ABCMeta):
  
  @abstractmethod
  def entregar_method():
    """ Interface Method"""
    
class Caminhao(Transporte):
      
  def __it__(self):
    self.name = "Logística Terrestre"

  def entregar_method(self):
    print ("Logística terrestre sendo preparada")


class Navio(Transporte):
          
  def __init__(self):
    self.name = "Logística Maritima"
            
  def entregar_method(self):
     print("Logística maritima sendo preparada")

class LogisticaFactory:
  
  @staticmethod
  def build_logistica(logistica_type):
    if logistica_type == "Terrestre":
      return Caminhao()
    if logistica_type == "Maritima":
      return Navio()
    print ("Invalid Type")
    return -1

if __name__ == "__main__":
  valordigitado = input("Qual tipo de logística voce quer? \n")
  logistica =  LogisticaFactory.build_logistica(valordigitado)
  logistica.entregar_method()
            
    
  