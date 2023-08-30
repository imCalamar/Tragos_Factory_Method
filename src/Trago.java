

abstract class Trago {
    protected String name;
    protected int price;

    public Trago(String name, int price){
        this.name=name;
        this.price=price;
    }

    public void iniciarTrago(){// metodo concreto de Trago
        System.out.println(
            "- Barman recibe el pedido del trago \r\n" + //
            "- Barman prepara una bandeja \r\n" + //
            "- Coloca una copa vacia");
    }
    public abstract void ingredients();// metodo abstracto
    public abstract void preparation();// metodo abstracto

    
}