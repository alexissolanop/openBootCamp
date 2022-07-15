public class sentenciaDeControl {
    

public static void main(String[] args) {
    // Ejercicio If 
        int numeroIf = 0;

        if (numeroIf<0){
            System.out.println("numeroIf: " + numeroIf + " = negativo");
        }
        else if(numeroIf>0){
            System.out.println("numeroIf: " + numeroIf + " = positivo");
        } else {
            System.out.println(" numeroIf = 0");
        }


        //Ejercicio while
        int numeroWhile = 1;

        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println("numeroWhile es igual a: " + numeroWhile);
        }

         //Ejercicio do while
        int numeroDoWhile = 3;
        
        do{
            numeroDoWhile++;
            System.out.println("numeroDoWhile es igual a: " + numeroDoWhile);
        }while(numeroDoWhile < 3);

        //for
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("numeroFor es igual a: " + numeroFor);
        }

        //Ejercicio switch
        String estacion = "verano";
         switch(estacion) {
             case "verano":
                 System.out.println("Estación: Verano");
                 break;
             case "invierno":
                 System.out.println("Estación: Invierno");
                 break;
             case "primavera":
                 System.out.println("Estación: Primavera");
                 break;
             case "otoño":
                 System.out.println("Estación: Otoño");
                 break;
             default:
                 System.out.println("No existe tal estación");
        }


}



}
