
abstract class Trago {
    protected String name;
    protected int price;

    public Trago(String name, int price){
        this.name=name;
        this.price=price;
    }

    public void iniciarTrago(){
        System.out.println(
            "- Barman prepara la bandeja \r\n" + //
            "- Coloca una copa vacia");
    }
    public abstract void ingredients();// metodo abstracto
    public abstract void preparation();
}