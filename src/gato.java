public class gato extends Mascotas {
    private String colorPelaje;

    public gato(String nombre, int edad, String peso, String raza, String colorPelaje) {
        super(nombre, edad, peso, raza);
        this.colorPelaje = colorPelaje;
    }
}