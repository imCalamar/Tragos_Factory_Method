
// Clase concreta

class FernetCocaCola extends Trago {   
    public FernetCocaCola(String name, int price) {
        super(name, price);
    }
    public void ingredients(){
        System.out.println(
            "+ Ingredintes del Fernet Cola:\r\n" + //
            "- Fernet\r\n" + //
            "- Coca-Cola\r\n" + //
            "- Hielo");
    }
    public void preparation(){
        System.out.println(
            "+ Receta del Fernet Cola:\r\n" + //
            "Las medidas pueden variar segun el gusto de cada uno, las proporciones ideales son 30% de fernet, 70% de coca y tres hielos. \r\n" + //
            " Entonces en un vaso con tres hielos, servir la medida de fernet y luego de a poco la Coca-Cola \r\n" + //
            " (no hacerlo de golpe porque se genera mucha espuma).");
    }
}


