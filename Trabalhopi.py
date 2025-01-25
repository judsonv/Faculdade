from abc import ABCMeta, abstractmethod


class Transporte(metaclass=ABCMeta):

  @abstractmethod
  def tipoCarro_method():
    """ Interface Method"""


class Motor_gasolina(Transporte):

  def __init__(self):
    self.name = "Esportivo"
    

  def tipoCarro_method(self):
    print("Modelo a gasolina está sendo preparado")


class Motor_diesel(Transporte):

  def __init__(self):
    self.name = "Caminhonete"

  def tipoCarro_method(self):
    print("Modelo a diesel sendo preparado")


class LogisticaFactory:

  @staticmethod
  def build_logistica(logistica_type):
    if logistica_type == "Esportivo":
      return Motor_gasolina()
    if logistica_type == "Caminhonete":
      return Motor_diesel()
    print("Invalid Type")
    return -1


if __name__ == "__main__":
  valordigitado = input("Qual tipo de carro você quer? \n")
  logistica = LogisticaFactory.build_logistica(valordigitado)
  logistica.tipoCarro_method()
  #print(logistica)
  
