/**
 * funciones
 */
public class funciones {

    public static void main(String[] args) {
        int a = 10, b = 25, c = 5,sum; 
        
        sum = a + b +c;
        System.out.println("La suma de a+b+c es:" +sum);

        coche miCoche = new coche();
        miCoche.agregarPuertas();
        miCoche.agregarPuertas();
        miCoche.agregarPuertas();


        System.out.println("Numero de puertas que tiene mi coche:" + miCoche.puertas);
    }        
    }

    /**
     * coche
     */
    class coche {
        public int puertas = 0; 

        public void agregarPuertas() {
            this.puertas ++;
        }
    
        
    }