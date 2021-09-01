package integrador;

public class Integrador {

    public static void main(String[] args) {
        
        Practica practica = new Practica();
        
        System.out.println( (int) Math.log10(1000)+1);
       // practica.numeroCapicua(Integer.MAX_VALUE);
       
        
        //Generar las variables necesarias para probar
        //ArrayList<String> medias = new ArrayList(Arrays.asList(new String[]{"A", "B", "C", "D","A", "C", "D", "A"}));

        //System.out.println(practica.mediasAmigas(medias));
        //System.out.println(practica.numeroCapicua(null));
                                          // pos / caramelos / presos
        System.out.println(practica.prisioneroDulce(7,4,8));
    }
}
