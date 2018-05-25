package Calculador;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Principal {
    
     public static void main(String[] args){
       
      //  crear objeto de la clase Calculadora
      
    Calculador  miCalculador; //definicion
    
    miCalculador=new Calculador(); //construir el objeto
    
   }
     
     
       
   Scanner miEscaner;
   
   miEscaner=new Scanner(System.in);
   
   
 int opcion;

System.out.println( "ingrese el numero de la operacion");
System.out.println( "a.sumar");
System.out.println( "b.restar");
System.out.println( "c.multiplicar");
System.out.println( "d.coseno");


 opcion =(int) miEscaner.nextFloat();
   miCalculadora.setX(opcion);
   
 
   
  switch (opcion){
      
      case 1: {
          
          float entrada;
          
       System.out.println( "INGRESE EL PRIMER NUMERO");
       
       
       
       entrada = miEscaner.nextFloat();
      miCalculadora.setX((int) entrada);
   
   
      System.out.println( "INGRESE EL SEGUNDO NUMERO");
      
      
             entrada = miEscaner.nextFloat();
        miCalculadora.setY((int) entrada);
   
    
          miCalculadora.sumar();
        
      }
     
  
  
  break;
  
  
  case 2:{
      
        miCalculadora.restar();
  }
  
   break;
  
  
  case 3:{
  
      Calculador.multiplicar();
  }
  
     break;
     
     
  default:{
  
  }
  }
   }

}
     
     
     

    

