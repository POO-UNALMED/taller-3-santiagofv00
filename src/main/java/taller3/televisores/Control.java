package taller3.televisores;

public class Control {
    private TV tv = null;


    public void setTv(TV tv) {
        this.tv = tv;
    }
    public void enlazar(TV tv){
        setTv(tv);
        this.tv.control=this;
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
