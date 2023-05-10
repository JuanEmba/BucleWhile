package buclewhile;

/**
 *
 * @author maryse
 * 
 * While --> Bucle de muestra con while
 */

public class BucleWhile {
     static int contador = 0;
     
    public void entrada (){
        
        // inicializa la condición
        while (contador < 6) // condición de prueba
        {
            contador++; // cuerpo del bucle
            System.out.println("contador: " + contador);
        } 
    }
    

    
    
    public static void main(String[] a) {
        
        System.out.println("Terminado.Contador: " + contador);
    }
}
