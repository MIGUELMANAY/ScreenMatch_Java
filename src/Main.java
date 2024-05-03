import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos Inmersiion Java");
       // System.out.println("Pelicula Matrix");

        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String Nombre ="Matrix";
        String sinopsis = """
                La mejor pelicula del fin del milenio
                """;
        double mediaEvaluacionUsuario = 0;
        System.out.println("Película: " + Nombre);
        System.out.println("Fecha de Lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Valoración= " + evaluacion);
        System.out.println(incluidoEnElPlanBasico);
        System.out.println("Sinopsis: " + sinopsis);

        double mediaEvaluacion = (4.5 + 4.5 + 3)/3;
        System.out.println("Media de Evaluación: " + mediaEvaluacion);

        if(fechaDeLanzamiento > 2023){
            System.out.println(" Pelicula Popular en el momento");
        } else {
            System.out.println(" Película Retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese su valoración para Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println("La media de la pelicula " + "Media calculada por el Usuario = " + mediaEvaluacionUsuario/3);
    }
}