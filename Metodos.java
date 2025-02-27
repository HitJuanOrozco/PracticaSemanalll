import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    //Suma de cada columna
    public ObjProducto[][] llenarMatriz(int dimension) {
        ObjProducto[][] m = new ObjProducto[dimension][dimension];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                ObjProducto o = new ObjProducto();
                System.out.println("Ingrese el nombre del producto");
                o.setNombre(sc.next());
                System.out.println("Ingrese el precio del producto");
                o.setPrecio(sc.nextDouble());
                System.out.println("ingrese la cantidad del producto");
                o.setCantidad(sc.nextInt());
                m[i][j] = o;
            }
        }
        return m;

    }

    //Llenar matriz de tiendas
    public ObjTienda[][] llenarMatrizTienda(int dimension) {
        ObjTienda[][] m = new ObjTienda[dimension][dimension];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                ObjTienda o = new ObjTienda();
                System.out.println("Ingrese la marca");
                o.setMarca(sc.next());
                System.out.println("ingrese la cantidad del producto");
                o.setCantidad(sc.nextInt());
                m[i][j] = o;
            }
        }
        return m;

    }

    //Mostrar matriz de tiendas
    public void mostrarMatriz(ObjTienda[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Marca: " + m[i][j].getMarca());
                System.out.println("Cantidad: " + m[i][j].getCantidad());
            }
            System.out.println();
        }
    }

    //Mostrar matriz de productos
    public void mostrarMatriz(ObjProducto[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Nombre: " + m[i][j].getNombre());
                System.out.println("Precio: " + m[i][j].getPrecio());
                System.out.println("Cantidad: " + m[i][j].getCantidad());
            }
            System.out.println();
        }
    }

    //Suma cantidades
    public int SumarCantidades(ObjTienda[][] m) {
        int suma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                suma = suma + m[i][j].getCantidad();
            }
        }
        return suma;
    }

    //Mostrar la posicion de un elemento
    public String MostrarposicionElemento(ObjProducto[][] m) {
        String nombreBuscar = "";
        System.out.println("Ingrese el nombre del prooducto a buscar");
        nombreBuscar = sc.next();
        String result = "";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j].getNombre().toLowerCase().equals(nombreBuscar)) {
                    result += "el producto se encuentra en la posicion: " + (i + 1) + "," + (j + 1) + "\n";
                }
            }
        }
        return result;
    }

    //Llenar matriz de enteros
    public int[][] llenarMatrizEnteros(int dimension) {
        int[][] matriz = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.println("Ingrese un número para la posición [" + (i+1) + "][" + (j+1) + "]:");
                while (!sc.hasNextInt()) {
                    System.out.println("Error: Ingrese un número entero.");
                    sc.next();
                }
                matriz[i][j] = sc.nextInt();
            }
        }
        return matriz;
    }

    //Suma de cada fila
    public int[] sumarFilas(int[][] matriz) {
    int[] sumaFilas = new int[matriz.length];
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            sumaFilas[i] += matriz[i][j];
        }
    }
        return sumaFilas;
    }

    //Suma de cada columna
    public int[] sumarColumnas(int[][] matriz) {
        int[] sumaColumnas = new int[matriz[0].length];
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                sumaColumnas[i] += matriz[j][i];
            }
        }
        return sumaColumnas;
    }

    //Convertir matriz a vector
    public int[] matrizAvector(int[][] matriz) {
        int rows = matriz.length;
        int cols = matriz[0].length;
        int[] vector = new int[rows * cols];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                vector[index++] = matriz[i][j];
            }
        }
        return vector;
    }
}
