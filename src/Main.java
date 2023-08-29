import java.util.concurrent.ForkJoinPool;
import java.util.LinkedList;
import Utiles.TecladoIn;

public class Main {
    public static void main(String[] args) {
        PrepararTrago fabricaTrago;
        Trago trago;
        LinkedList<Integer> cuenta = new LinkedList<Integer>();
        int[] arregloCuenta;
        int cantidadTragos=0;
        int opcionElegida = -1;        
        ForkJoinPool pool = new ForkJoinPool();
        int precioFinal;

        //Menu de opciones
        while (opcionElegida != 0){
            System.out.println("\n|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("\nBARRA: Elegir Trago:");
            System.out.println("\n1: Fernet");
            System.out.println("\n2: Daiquiri");
            System.out.println("\n0: Salir");
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            opcionElegida = TecladoIn.readLineInt();
            switch(opcionElegida){
                case 1:{
                    fabricaTrago = new PrepararFernetCocaCola();
                    trago = fabricaTrago.crearTrago("Fernet con coca",600);
                    trago.iniciarTrago();
                    trago.ingredients();
                    trago.preparation();
                    cuenta.add(600);
                    cantidadTragos++;
                }break;
                case 2:{
                    fabricaTrago = new PrepararDaiquiri();
                    trago = fabricaTrago.crearTrago("Daiquiri",1000);
                    trago.iniciarTrago();
                    trago.ingredients();
                    trago.preparation();
                    cuenta.add(1000);
                    cantidadTragos++;
                }break;
            }

        }

        //"Conversion" de LinkedList<Integer> a int[]
        arregloCuenta = new int[cantidadTragos];
        for(int i=0; i < cantidadTragos; i++){
            arregloCuenta[i] = (int)cuenta.get(i);
        }

        precioFinal = pool.invoke(new sumarCuentaTragos(arregloCuenta,0,cantidadTragos));
        System.out.println("Suma de los targos: " + precioFinal);
        

    }


}