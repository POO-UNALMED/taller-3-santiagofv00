package taller3.televisores;

public class Control {
    private TV tv = null;


    public void setTV(TV tv) {
        this.tv = tv;
    }
    public void enlazar(TV tv){
        setTV(tv);
        this.tv.setControl(this);
    }
    public void setCanal(int canal){
        this.tv.setCanal(canal);
    }
    public void turnOn(){
        this.tv.turnOn();
    }
    public void turnOff(){
        this.tv.turnOff();
    }
    public void canalUp(){
        this.tv.canalUp();
    }
    public void canalDown(){
        this.tv.canalDown();
    }
    public void volumenUp(){
        this.tv.volumenUp();
    }
    public void volumenDown(){
        this.tv.volumenDown();
    }
    public TV getTv() {
        return tv;
    }


}

