package televisores;

public class Marca{
    String nombre;

    public Marca(){}
    
    public Marca(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}