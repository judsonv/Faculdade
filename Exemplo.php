<html>
  <head>
    <title>PHP Test</title>
       <style>
          h2{
            font: 15pt Arial;
            color: #171559;
            font-weight: bold;
          }
        </style>
  </head>
  <body>
    <?php 

        // echo '<p>Hello World</p>';
         //echo "Ola mundo <br/>";
           // $idade = 3;
            //$sal = 1825.54;
           // $nome = "Leonardo";
           // $casado = false;
           // $n = 4;
            //$no = (string)"Judson";
            //echo "O $nome tem $idade anos!<br/>";
            //$n1 = $_GET["a"];
           // $n2 = $_GET["b"];
           // echo "<h2>Valores recebidos: $n1 e $n2</h2>";
            //$s = $n1 + $n2;
           // eho "A soma vale ". ($n1 + $n2);
           // echo "<br/>A subtracao vale ". ($n1 - $n2);          
           /// echo "<br/>A multiplicacao vale ".($n1 * $n2);
            ///echo "<br/>A divisao vale ".($n1/$n2);
         //   echo "<br/>O modulo vale ".($n1%$n2);


     echo "Ola mundo <br/>";
        $v1 = $_GET["x"];
        $v2 = $_GET["y"];
        echo "<h2>Valores recebidos $v1 e $v2</h2>";
        echo "O valor absoluto de $v2 e " . abs($v2);
        echo "<br/>O valor de $v1 <sup>$v2</sup> e " .pow($v1, $v2);
        echo "<br/> A raiz de $v1 e" . sqrt($v1);
        echo "<br/> O valor de $v2 arredondado e " .round($v2); //ceil(pra cima) floor(pra baixo)
        echo "<br/> A parte inteira de $v2 e " . intval($v2);
        echo "<br/> O valor de $v1 em moeda R$ e " . number_format($v1,2,",",".");
           
    ?> 


    <script src="https://replit.com/public/js/replit-badge.js" theme="blue" defer></script> 
  </body>
</html>