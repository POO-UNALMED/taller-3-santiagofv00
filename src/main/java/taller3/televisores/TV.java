package taller3.televisores;

public class TV {
    public Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;
    private static int numtv;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        numtv ++;
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
        if(canal <=120 && canal>=1)
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
        if (volumen<=7 && volumen >=0)
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

    public boolean getEstado() {
        return estado;
    }

    public static int getNumTV() {
        return numtv;
    }



    public void canalUp(){
        if (this.estado) {
            if (this.canal <= 119)
                this.canal++;
        }
    }
    public void canalDown(){
        if (this.estado) {
            if (this.canal >= 2)
                this.canal--;
        }
    }

    public void volumenUp(){
        if (this.estado){
            if (this.volumen <= 6)
                this.volumen ++;
        }
    }
    public void volumenDown(){
        if (this.estado){
            if (this.volumen >= 1)
                this.volumen --;
        }
    }
    public static void setNumTV(int numtv) {
        TV.numtv = numtv;
    }

}


