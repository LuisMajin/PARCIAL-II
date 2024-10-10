import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Planeta planeta1 = crearPlaneta(sc, 1);
        Logic logic1 = new Logic(planeta1);


        Planeta planeta2 = crearPlaneta(sc, 2);
        Logic logic2 = new Logic(planeta2);


        System.out.println("\nAtributos del planeta 1:");
        logic1.imprimirAtributos();
        
        System.out.println("\nAtributos del planeta 2:");
        logic2.imprimirAtributos();

        sc.close();
    }


    private static Planeta crearPlaneta(Scanner sc, int numero) {
        System.out.println("Digite el nombre del planeta " + numero + ":");
        String nombre = sc.nextLine();

        System.out.println("Digite la cantidad de satélites de " + nombre + ":");
        int cantidadSatélites = sc.nextInt();

        System.out.println("Digite la masa de " + nombre + " (en kg):");
        double masa = sc.nextDouble();

        System.out.println("Digite el volumen de " + nombre + " (en m³):");
        double volumen = sc.nextDouble();

        System.out.println("Digite el diámetro de " + nombre + " (en km):");
        double diámetro = sc.nextDouble();

        System.out.println("Digite la distancia al Sol de " + nombre + " (en km):");
        double distanciaAlSol = sc.nextDouble();

        System.out.println("Es " + nombre + " observable? (true/false):");
        boolean esObservable = sc.nextBoolean();
        sc.nextLine();

        return new Planeta(nombre, cantidadSatélites, masa, volumen, diámetro, distanciaAlSol, esObservable);
    }
}
