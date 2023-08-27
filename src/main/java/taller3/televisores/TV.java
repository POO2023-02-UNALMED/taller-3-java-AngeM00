package televisores;

public class TV {
    private marca marca;
    private int canal = 1;
    private int precio = 500;
    private int volumen = 1;
    private boolean estado;
    private control control;

    private static int numTV = 0;

    public TV(marca marc, boolean est){
        this.marca = marc;
        this.estado = est;
        TV.numTV += 1;
    }

    public marca getMarca(){
        return this.marca;
    }

    public void setMarca(marca marc){
        this.marca = marc;
    }

    public int getCanal(){
        return this.canal;
    }

    public void setCanal(int canal){
        if(estado == true && (canal >= 1 && canal <= 120)){
            this.canal = canal;
        }   
    }

    public int getPrecio(){
        return this.precio;
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }

    public int getVolumen(){
        return this.volumen;
    }

    public void setVolumen(int volumen){
        if (estado == true && (volumen >= 0 && volumen <= 7)){
            this.volumen = volumen;
        }      
    }

    public control getControl(){
        return this.control;
    }

    public void setControl(control control){
        this.control = control;
    }

    public static int getNumTV(){
        return TV.numTV;
    }

    public static void setNumTV(int num){
        TV.numTV = num;
    }

    public boolean getEstado(){
        return this.estado;
    }

    public void turnOn(){
        this.estado = true;
    }

    public void turnOff(){
        this.estado = false;
    }

    //Cambio de canal y volumen
    public void canalUp(){
        if(estado && this.canal < 120){
            this.canal += 1;
        }
    }

    public void canalDown(){
        if(estado && this.canal > 1){
            this.canal -= 1;
        }
    }

    public void volumenUp(){
        if(estado && this.volumen < 7){
            this.volumen += 1;
        }
    }

    public void volumenDown(){
        if(estado && this.volumen > 0){
            this.volumen -= 1;
        }
    }

}
