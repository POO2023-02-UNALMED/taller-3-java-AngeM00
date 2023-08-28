package taller3.televisores;

public class Control{
    private TV tv;

    public void enlazar(TV televisor){
        tv = televisor;
        televisor.setControl(this);
    }

    public void setTv(TV televisor){
        tv = televisor;
    }

    public TV getTv(){
        return tv;
    }

    public void turnOn(){
        tv.turnOn();
    }

    public void turnOff(){
        tv.turnOff();
    }

    public void canalUp(){
        tv.canalUp();
    }

    public void canalDown(){
        tv.canalDown();
    }

    public void volumenUp(){
        tv.volumenUp();
    }

    public void volumenDown(){
        tv.volumenDown();
    }

    public void setCanal(int canal){
        tv.setCanal(canal);
    }

    public void setVolumen(int vol){
        tv.setVolumen(vol);
    }
}