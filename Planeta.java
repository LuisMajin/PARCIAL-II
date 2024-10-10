public class Planeta {
    private String nombre;
    private int cantidadSatélites;
    private double masa;
    private double volumen;
    private double diámetro;
    private double distanciaAlSol;
    private boolean esObservable;

    public Planeta(String nombre, int cantidadSatélites, double masa, double volumen,
                   double diámetro, double distanciaAlSol, boolean esObservable) {
        this.nombre = nombre;
        this.cantidadSatélites = cantidadSatélites;
        this.masa = masa;
        this.volumen = volumen;
        this.diámetro = diámetro;
        this.distanciaAlSol = distanciaAlSol;
        this.esObservable = esObservable;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getCantidadSatélites() {
        return cantidadSatélites;
    }

    public double getMasa() {
        return masa;
    }

    public double getVolumen() {
        return volumen;
    }

    public double getDiámetro() {
        return diámetro;
    }

    public double getDistanciaAlSol() {
        return distanciaAlSol;
    }

    public boolean isEsObservable() {
        return esObservable;
    }
}
