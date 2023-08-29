public class Main {
    public static void main(String[] args) {

        int[] cuenta=new int[20];

        PrepararTrago fernet = new PrepararFernetCocaCola();
        Trago f = fernet.crearTrago("Fernet con CocaCola",600);
        f.iniciarTrago();
        f.ingredients();
        f.preparation();

        System.out.println();
        
        PrepararTrago daiquiri = new PrepararDaiquiri();
        Trago d = daiquiri.crearTrago("Daiquiri",1000);
        d.iniciarTrago();
        d.ingredients();
        d.preparation();

    }


}