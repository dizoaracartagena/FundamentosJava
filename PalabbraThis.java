package palabrathis;

public class PalabbraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Perez");
        System.out.println("persona = " + persona);
        System.out.println("persona nombre: " + persona.nombre);
        System.out.println("persona apellido: " + persona.apellido);
    }
}

class Persona {
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido) {
        //super(); llamada implicita al constructor de la clase Padre (object)
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("nombre: " + this);
        System.out.println("apellido: " + this.apellido);
        new Imprimir().imprimir(this);
    }
}

class Imprimir {
    
    public Imprimir() {
        super(); //constructor de la clase object (padre) para reservar memoria
    }
    
    public void imprimir(Persona persona) {
        System.out.println("Persona desde imprimir: " + persona);
        System.out.println("impresion this: " + this);
    }
}
