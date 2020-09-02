package taller3.televisores;

public class TV {
    private Marca marca = null;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control = null;
    private static int numtv;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public void turnOff(){
        this.estado=false;
    }

    public void turnOn(){
        this.estado=true;
    }

    public boolean isEstado() {
        return estado;
    }

    public static int getNumtv() {
        return numtv;
    }

    public void canalUp(){
        if (this.canal <= 119)
            this.canal ++;
    }
    public void canalDown(){
        if (this.canal >= 2)
            this.canal --;
    }

    public void volumenUp(){

    }
    public void volumenDown(){

    }

}


