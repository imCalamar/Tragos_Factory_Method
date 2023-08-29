public class Main {
    public static void main(String[] args) {

        PrepararTrago fernet = new PrepararFernetCocaCola();
        Trago f = fernet.crearTrago("Fernet con CocaCola");
        f.ingredients();
        f.preparation();

        System.out.println();
        //probando
        
        PrepararTrago daiquiri = new PrepararDaiquiri();
        Trago d = daiquiri.crearTrago("Daiquiri");
        d.ingredients();
        d.preparation();
    }
}