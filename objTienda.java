public class objTienda {
    private String Marca;
    private int Cantidad;
    public objTienda() {
    }
    public objTienda(String marca, int cantidad) {
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
