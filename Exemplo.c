#include <stdio.h>
#include <string.h>
#include <locale.h>
int main ()
{
  char str1[15] = "Casamento";
  char str2[15] = "Casa";
  int retorno;
  setlocale (LC_ALL, "");
  retorno = strncmp (str1, str2, 4);
  printf("Retorno da comparação = %d\n", retorno);
  if(retorno == 0)
  printf("\n(%s) e (%s), comparando até a %dª posição são IGUAIS.\n\n", str1, str2, 4);
  else 
  printf("\n(%s) e (%s), comparando até a %dª posição são DIFERENTES.\n\n", str1, str2, 4);
system("pause");
  return 0;
}
 