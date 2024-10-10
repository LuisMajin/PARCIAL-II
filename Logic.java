public class Logic {
    private Planeta Planeta;

    public Logic(Planeta Planeta) {
        this.Planeta = Planeta;
    }

    public void imprimirAtributos() {
        System.out.println("Nombre: " + Planeta.getNombre());
        System.out.println("Cantidad de satélites: " + Planeta.getCantidadSatélites());
        System.out.println("Masa: " + Planeta.getMasa() + " kg");
        System.out.println("Volumen: " + Planeta.getVolumen() + " m³");
        System.out.println("Diámetro: " + Planeta.getDiámetro() + " km");
        System.out.println("Distancia al Sol: " + Planeta.getDistanciaAlSol() + " km");
        System.out.println("Es observable: " + (Planeta.isEsObservable() ? "Sí" : "No"));
    }
}
