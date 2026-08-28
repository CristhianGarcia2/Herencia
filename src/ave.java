public class ave extends Mascotas {
    private boolean puedeVolar;

    public ave(String nombre, int edad, String peso, String raza, boolean puedeVolar) {
        super(nombre, edad, peso, raza);
        this.puedeVolar = puedeVolar;
    }

    public void cantar() {
        System.out.println(getNombre() + " está cantando: ¡Pío, pío!");
    }
}