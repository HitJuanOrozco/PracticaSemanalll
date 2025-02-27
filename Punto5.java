public class Punto5 {
    public void P5() {
        int dimension = 5;
        Metodos m = new Metodos();
        int[][] matriz = m.llenarMatrizEnteros(dimension);
        int[] vector = m.matrizAvector(matriz);

        System.out.println("\nVector resultante de la matriz:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
}