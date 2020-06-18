
package cola3;

import java.util.Scanner;


public class Cola3 {
int MAX=100;
 int i=0;
int n=10, aux;
int numeros[]=new int[n];
    

    public void llenarcola(){
        for(i=1;i<n;i++){
            
         numeros[i] =(int) (Math.random() * MAX);           
                   for ( i=0; i< n; i++) {
                numeros[i] =(int) (Math.random() * MAX);
                   for(int j=0; j<i;j++){
                       if(numeros[i]==numeros[j]){
                           i--;
                            
                       }
                   }    
                   System.out.println("-->"+numeros[i]);
             int j = 0;
                   numeros[i]=numeros[i]--;
                   }                    
                 }             
            }           
       
    public void mostrarcola(){
        if(MAX>0){
                    System.out.println("los nombres son:");
                    for(i = 0; i < n; i++){
                    System.out.println("posicion de cola["+i+"]=" +numeros[i]);
                    
                    }
                    }else{
                        System.out.println("la cola esta vacia");
                    }
    }
       
    public void ordenarcola(){
         for(int j=0;j<n;j++){
                        for( i=0;i<n-1;i++){
                            if(numeros[i]>numeros[i+1]){
                             aux=numeros[i];
                             numeros[i]=numeros[i+1];
                             numeros[i+1]=aux;
                              
                            }
                        }                       
                    } 
                    {
                        System.out.println("los valores fueron ordenados");
                    }
    }
    
    public void vaciarcola(){
         MAX=0;
                    System.out.println("la cola se ha vaciado");
    }
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
       Cola3 cola= new Cola3();
        int opcion;
                
        System.out.println("Bienvenido a la cola de XLOBOX3");
        
        
        do{
            
              System.out.println("1-llenar");
              System.out.println("2-mostrar");
              System.out.println("3-ordenar");
              System.out.println("4-vaciar");
               System.out.println("5-salir");
               
               System.out.print("Opcion es --> ");
        opcion = leer.nextInt();
        
        switch (opcion){
            
            case 1:
               cola.llenarcola();
                break;               
            case 2:
              cola.mostrarcola();              
                break;
            case 3:
                cola.ordenarcola();
                break;
                
            case 4:
                cola.vaciarcola();
                break;                            
        }
      }
      while (opcion!=5);  
    }  
}
