/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predecir_emisiones_gas;

/**
 *
 * @author Ana Pico Solis
 */
import java.util.*;
import java.util.Scanner;
public class Predecir_emisiones_gas {

    /**
     * @param args the command line arguments
     */
    
     public static String Predecir_emision_gas(){
        
        String tipo_emision_gas;
        int codigo;
        int valor_emision_gas;
        
        Scanner pe=new Scanner(System.in);
        System.out.println("Ingrese el tipo de emisión del gas: ");
         tipo_emision_gas= pe.nextLine();
        System.out.println("Determine el valor emisión gas, en %: ");
         valor_emision_gas= pe.nextInt();
        return tipo_emision_gas;
    }
    
    public static int Generar_energia_motor(){
    
        int codigo;
        String tipo_motor;
        int potencia_motor;
        
        Scanner ge=new Scanner(System.in);
        System.out.println("Determinar el tipo de motor: ");
        tipo_motor= ge.next();
        System.out.println("Ingresar la potencia del motor en W: ");
        potencia_motor= ge.nextInt();
        return  potencia_motor;
    }
    
    
    public static int Analizar_biodiesel_higuerilla(){
    
        int codigo;
        int viscosidad_biodiesel_higuerilla;
        String calidad_biodiesel_higuerilla;
        int cantidad_biodiesel_higuerilla;
        
        Scanner ab=new Scanner(System.in);
        System.out.println("Analice la viscosidad del biodiesel de higuerilla, en Pa*s: ");
        viscosidad_biodiesel_higuerilla = ab.nextInt();
        System.out.println("Analice la calidad del biodiesel de higuerilla: ");
        calidad_biodiesel_higuerilla= ab.next();
        System.out.println("Analice la cantidad de biodiesel de higuerilla, en %: ");
        cantidad_biodiesel_higuerilla= ab.nextInt();
        return 0;
    }
    
    
      public static String Controlar_variable(){
        int codigo;
        String tipo_variable;
        
        Scanner cv=new Scanner(System.in);
        System.out.println("Controlar los tipos de variable: ");
        tipo_variable= cv.next();
        return tipo_variable;
        
      }
      
      public static String Identificar_sistema(){
         int codigo;
         String tipo_sistema;
         
         Scanner is=new Scanner (System.in);
         System.out.println("Identifique el tipo de sistema: ");
         tipo_sistema= is.next();
         return tipo_sistema;
      }
    
      public static String Validar_prediccion_emision_gas(){
          int codigo;
          String tipo_emision_gas;
          int potencia_carga_motor;
          int trabajo;
          int tiempo;
          
          Scanner vp= new Scanner(System.in);
          System.out.println("Validar el tipo de emisión: ");
          tipo_emision_gas= vp.next();
          
           System.out.println("Ingrese el valor del trabajo, en [J]: ");
           trabajo= vp.nextInt();
           
           System.out.println("Ingrese el valor de tiempo de trabajo, en [s]: ");
           tiempo = vp.nextInt();
           
           potencia_carga_motor= trabajo/tiempo;
          System.out.println("Validar potencia de carga del motor en W: "+ potencia_carga_motor);
          
     
          return tipo_emision_gas;
          
      }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Predecir_emision_gas();
        Generar_energia_motor();
        Analizar_biodiesel_higuerilla();
        Controlar_variable();
        Identificar_sistema();
        Validar_prediccion_emision_gas();

        
    }
    
}
