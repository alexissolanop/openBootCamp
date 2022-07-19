public class main {
    
    public static void main(String[] args) {
        persona Alex = new persona();
        Alex.setNombre("Alex");
        Alex.setEdad(39);
        Alex.setTelefono(555555555);
    
        System.out.println("Hola mi nombre es " + Alex.getNombre());
        System.out.println("Tengo " + Alex.getEdad() + " años");
        System.out.println("Mi teléfono es " + Alex.getTelefono());

    }



}
