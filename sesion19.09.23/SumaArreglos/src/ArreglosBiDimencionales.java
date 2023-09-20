import java.util.Scanner;

public class ArreglosBiDimencionales {
    public static void main(String[] args) throws Exception {
        Scanner lector=new Scanner(System.in);
        int MatrizB[][]= {
            {1,2},
            {3,4}
        };
        System.out.println("Cantidad de filas");
        int filas =lector.nextInt();
        System.out.println("Cantidad de columnas");
        int columnas =lector.nextInt();

        int [][] MatrizA = new int[filas][columnas];
        System.out.println("Ingrese los elementos de la matriz A");
        for(int i=0; i<MatrizA.length;i++){//para filas
            for(int j=0; j<MatrizA[i].length;j++){//para columnas
                System.out.println("Arreglo A["+i+","+j+"] = ");
                MatrizA[i][j]=lector.nextInt();

            }
        }
        System.out.println("Los daros en la forma de la matriz son:");
        for(int i=0; i<MatrizA.length;i++){//para filas
            for(int j=0; j<MatrizA[i].length;j++){//para columnas
                System.out.print(MatrizA[i][j]+"\t");
            }
        }
        System.out.println();

        lector.close();
    }
}
