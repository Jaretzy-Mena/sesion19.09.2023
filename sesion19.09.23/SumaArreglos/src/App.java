import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector=new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los arreglos");
        int tamano = lector.nextInt();

        while(tamano<=0){
            System.out.println("El tamaño de los arreglos no puede ser menor o igaul que cero");
            System.out.println("Ingrese el tamaño de los arreglos");
            tamano=lector.nextInt();
        }
        //Declarar arreglos
        int[]arregloA =new int[tamano];
        int[]arregloB =new int[tamano];
        int[]ArreglosSuma =new int[tamano];
        //Pedir los elementos de los arreglos al usuario
        System.out.println("Elementos del arreglo A:");
        for(int i=0; i<arregloA.length; i++){
            System.out.print("Elemento ["+(i+1)+"] = ");
            arregloA[i]=lector.nextInt();
        }
        
        System.out.println("Elementos del arreglo B:");
        for(int i=0; i<arregloB.length; i++){
            System.out.print("Elemento ["+(i+1)+"] = ");
            arregloB[i]=lector.nextInt();
        }
        //Sumar elementos
        for(int i=0;i<ArreglosSuma.length;i++){
            ArreglosSuma[i]=arregloA[i]+arregloB[i];
        }
        //Mostrar resultados
        System.out.println("Elementos del arreglo A");
        System.out.print("Arreglos A=[");
        for(int i=0; i<ArreglosSuma.length;i++){
            System.out.print(arregloA[i]+" , ");
        }
        System.out.print("]\n");
        System.out.println("Elementos del arreglo B");
        System.out.print("Arreglos B=[");
        for(int i=0; i<ArreglosSuma.length;i++){
            System.out.print(arregloB[i]+" , ");
        }
        System.out.print("]\n");

        System.out.print("Suma de los arreglos=[");
        for(int i=0; i<ArreglosSuma.length;i++){
            System.out.print(ArreglosSuma[i]+" , ");
        }
        System.out.print("]\n");


        lector.close();
    }
}
