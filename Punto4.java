public class Punto4 {
    public void P4() {
        int dimension = 10;
        Metodos m = new Metodos();
        int[][] matriz = m.llenarMatrizEnteros(dimension);
        int[] sumaColumnas = m.sumarColumnas(matriz);
        
        // Encontrar la columna con la máxima suma
        int maxSuma = sumaColumnas[0];
        int columnaMaxima = 0;
        
        for (int i = 1; i < sumaColumnas.length; i++) {
            if (sumaColumnas[i] > maxSuma) {
                maxSuma = sumaColumnas[i];
                columnaMaxima = i;
            }
        }

        System.out.println("\nLa columna con la máxima suma es la columna " + (columnaMaxima + 1) + " con una suma de " + maxSuma);
    }
}