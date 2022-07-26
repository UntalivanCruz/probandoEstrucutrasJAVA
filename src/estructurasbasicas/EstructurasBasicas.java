/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructurasbasicas;

/**
 *
 * @author Developer
 */
public class EstructurasBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int numero=0;
        double decimales=10.5;
        char caracter='A';
        boolean binario=false;


       float nota=85;
       float MAXAPR = 60;

//ESTRUCTURAS DECISION
  /*    if(nota>=MAXAPR){
System.out.println("Aprobo la clase con exito!");
      }
else{
System.out.println("Reprobo la clase");
}*/

//OPERADOR Ternario

System.out.println( nota>MAXAPR ? "Aprobo la clase con exito!" : "Reprobo la clase");

System.out.println(!binario);


if(nota>=0 && nota<60){
    System.out.println("Reprobado");
}else if(nota>=60 && nota<80){
    System.out.println("Bueno");
} else if(nota>=80 && nota<90){
    System.out.println("Muy bueno");
}else{
    System.out.println("Excelente");
}

switch(numero){
case 10:
    System.out.println(5+5);
    break;
case 5:
    System.out.println(10+10);
    break;
default:
    System.out.println(0);
    break;
}

switch (caracter){
case 'A':
    System.out.println("El caracter A");
    break;
case 'X':
    System.out.println("Caracter X");
    break;
}

//OPERADORES LOGICOS
//  AND   &
//  OR    |

//ESTRUCTURAS REPETITIVAS

while(numero>10){
    System.out.println("Hola");
    numero++;
//Operadores  ++ --
}

do{
    System.out.println("Hola");
    numero++;
}while(numero>10);


for(int x=0; x<numero;x++){
    System.out.println("Hola");
}

int prueba=10;
int nuevoValor=20;

        System.out.println(prueba++);
// Usando operador de incremento ++ y decremento --

nuevoValor += prueba;
        System.out.println("Nuevo valor: " + nuevoValor);

//Operadores Acumuladores +=    -=   *=    /=



int cajero500= 5423/500;
System.out.println("Billetes de 500: " + cajero500);

int cajero200= 423/200;
System.out.println("Billetes de 200: " + cajero200);



    }
    
}
