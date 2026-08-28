
public class perro extends Mascotas {
    private String tamano;

    public perro(String nombre, int edad, String peso, String raza, String tamano) {
        super(nombre, edad, peso, raza);
        this.tamano = tamano;
    }

    public void ladrar() {
        System.out.println(getNombre() + " está ladrando: ¡Guau, guau!");
    }
}