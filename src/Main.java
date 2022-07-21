public class Main {
    public static void main(String[] args) {
        //If
        int numeroIf = 1;
        if(numeroIf > 0) {
            System.out.println("Es positivo");
        } else if(numeroIf < 0){
            System.out.println("Es negativo");
        }else{
            System.out.println("Es cero");
        }

        //While
        int numeroWhile = 0;
        while (numeroWhile<3) {
            numeroWhile= numeroWhile + 1;
            System.out.println(numeroWhile);
        }

        //Do While
        int numeroDoWhile = 3;
        do{
            numeroDoWhile= numeroDoWhile + 1;
            System.out.println(numeroDoWhile);

        } while (numeroDoWhile<3);

        //For
        for(int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor+1){
            System.out.println(numeroFor);
        }
        //Switch
        String estacion = "invierno";
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