
// Clase abstracta 
abstract class Trago {
    protected String name;
    protected int price;
    public Trago(String name, int price){
        this.name=name;
        this.price=price;
    }
    public void iniciarTrago(){// metodo concreto de Trago  es un "doStuff()"
        System.out.println(
            "- EL Barman recibe el pedido de un trago \r\n" + //
            "- El Barman prepara una bandeja \r\n" + //
            "- y coloca un vaso nuevo \n");
    }
    public abstract void ingredients();// metodo abstracto
    public abstract void preparation();// metodo abstracto
}