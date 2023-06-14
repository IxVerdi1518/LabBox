
package Clases;

public class Caja {
    int ancho;
    int alto;
    int profundo;
    public Caja() {
    }
    public Caja(int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo=profundo;
    }
    public void calcularCaja(){
        var volumen = ancho*alto*profundo;
        System.out.println("El volumen de la caja es de: " +volumen ); 
    }
}
