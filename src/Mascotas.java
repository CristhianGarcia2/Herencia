public class Mascotas {
    private String nombre;
    private int edad;
    private String peso;
    private String raza;

    public Mascotas(String nombre, int edad, String peso, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.raza = raza;

    }
    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getPeso() { return peso; }
    public void setPeso(String peso) { this.peso = peso; }

    public String getRaza() { return raza; }
    public void setRaza(String raza) { this.raza = raza; }
}