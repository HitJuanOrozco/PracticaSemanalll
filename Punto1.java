public class Punto1 {
    public void P1(int d) {
        Metodos m = new Metodos();
        ObjProducto[][] M = new ObjProducto[d][d];
        M = m.llenarMatriz(d);
        m.mostrarMatriz(M);
        System.out.println(m.MostrarposicionElemento(M));
    }
}