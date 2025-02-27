public class Punto3 {
    public void P3() {
        int dimension = 5;
        Metodos m = new Metodos();
        int[][] matriz = m.llenarMatrizEnteros(dimension);
        int[] sumaFilas = m.sumarFilas(matriz);
        int[] sumaColumnas = m.sumarColumnas(matriz);

        System.out.println("\nSuma de cada fila:");
        for (int i = 0; i < sumaFilas.length; i++) {
            System.out.println("Fila " + (i + 1) + ": " + sumaFilas[i]);
        }

        System.out.println("\nSuma de cada columna:");
        for (int i = 0; i < sumaColumnas.length; i++) {
            System.out.println("Columna " + (i + 1) + ": " + sumaColumnas[i]);
        }
    }
}
