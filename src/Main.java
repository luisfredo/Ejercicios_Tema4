public class Main {
    public static void main(String[] args) {
        int numeroIf = 1;
        int numeroWhile = 0;
        String estacion = "invierno";

        if(numeroIf > 0) {
            System.out.println("Es positivo");
        } else if(numeroIf < 0){
            System.out.println("Es negativo");
        }else{
            System.out.println("Es cero");
        }

        while (numeroWhile<3) {
            System.out.println(numeroWhile);
            numeroWhile= numeroWhile + 1;

        }

        do{
            System.out.println(numeroWhile);
            numeroWhile= numeroWhile + 1;

        } while (numeroWhile<3);

        for(int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor+1){
            System.out.println(numeroFor);
        }

        switch(estacion){
            case "verano":
                System.out.println("Es verano");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("No es una estación");

        }


    }
}