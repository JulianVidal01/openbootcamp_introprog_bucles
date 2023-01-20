import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {

        //IF

        System.out.println("IF");

        int numeroif;
        Scanner lectura = new Scanner(System.in);
        System.out.println("introduce un numero");
        numeroif = lectura.nextInt();

        if( numeroif > 0)
        {
            System.out.println("numeroIf es positivo \n");
        } else if (numeroif < 0) {
            System.out.println("numeroIf es negativo \n");
        }else if(numeroif == 0){
            System.out.println("numeroIf es igual a cero \n");
        }else {
            System.out.println("??");
        }

        //WHILE

        System.out.println("\n WHILE");

        int numeroWhile;
        Scanner numwh = new Scanner(System.in);
        System.out.println("introduce un numero");
        numeroWhile = numwh.nextInt();

        while (numeroWhile<3){
            System.out.println("NumeroWhile: " + numeroWhile);
            numeroWhile = numeroWhile+1;
        }

        //DO WHILE

        System.out.println("\n DO WHILE");

        do{
            System.out.println("NumeroDoWhile: " + numeroWhile);
            numeroWhile++;
        }while(numeroWhile<3);

        //FOR

        System.out.println(" \n FOR");

        for(int numeroFor = 0; numeroFor<=3; numeroFor++)
        {
            System.out.println("NumeroFor: "+ numeroFor);
        }

        //SWITCH

        System.out.println(" \n SWITCH");

        var estacion = "VERANO";
        Scanner est = new Scanner(System.in);
        System.out.println("introduce una estación del año en mayusculas");
        estacion = est.next();

        switch (estacion){
            case "VERANO":
                System.out.println("Es Verano");
                break;
            case "OTONIO":
                System.out.println("Es otoño");
                break;
            case "INVIERNO":
                System.out.println("Es Invierno");
                break;
            case "PRIMAVERA":
                System.out.println("Es Primavera");
                break;
            default:
                System.out.println("No es una estacion");
        }
    }
}