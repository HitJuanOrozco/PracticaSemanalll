public class ObjTienda {
    private String Marca;
    private int Cantidad;
    public ObjTienda() {
    }
    public ObjTienda(String marca, int cantidad) {
        Marca = marca;
        Cantidad = cantidad;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public int getCantidad() {
        return Cantidad;
    }
    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }
    
}
