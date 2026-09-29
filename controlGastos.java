import java.util.Scanner;

public class controlGastos {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double precio;
        String descripcion;

        System.out.println("Cual es el valor del gasto?");
        precio = sc.nextDouble();
        sc.nextLine();

        System.out.println("Cual es la descripcion deste gasto?");
        descripcion = sc.nextLine();

        System.out.println("Gasto Registrado: "+precio+" $ - "+descripcion);

        sc.close();
    }
}