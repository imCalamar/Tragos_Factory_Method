import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {

        int[] cuenta=new int[20];
        int cont=0;

        PrepararTrago fernet = new PrepararFernetCocaCola();
        Trago f = fernet.crearTrago("Fernet con CocaCola",600);
        f.iniciarTrago();
        f.ingredients();
        f.preparation();
        cuenta[cont]=f.price;
        cont++;
        
        PrepararTrago fernet2 = new PrepararFernetCocaCola();
        Trago f2 = fernet2.crearTrago("Fernet con CocaCola",600);
        f2.iniciarTrago();
        f2.ingredients();
        f2.preparation();
        cuenta[cont]=f2.price;
        cont++;
        
        PrepararTrago fernet3 = new PrepararFernetCocaCola();
        Trago f3 = fernet3.crearTrago("Fernet con CocaCola",600);
        f3.iniciarTrago();
        f3.ingredients();
        f3.preparation();
        cuenta[cont]=f3.price;
        cont++;

        PrepararTrago fernet4 = new PrepararFernetCocaCola();
        Trago f4 = fernet4.crearTrago("Fernet con CocaCola",600);
        f4.iniciarTrago();
        f4.ingredients();
        f4.preparation();
        cuenta[cont]=f4.price;
        cont++;

        PrepararTrago daiquiri = new PrepararDaiquiri();
        Trago d = daiquiri.crearTrago("Daiquiri",1000);
        d.iniciarTrago();
        d.ingredients();
        d.preparation();
        cuenta[cont]=d.price;
        cont++;

        try (ForkJoinPool pool = new ForkJoinPool()) {
            int result = pool.invoke(new sumarCuentaTragos(cuenta,0,cont));
            System.out.println("Suma de los targos: " + result);
        }

    }


}