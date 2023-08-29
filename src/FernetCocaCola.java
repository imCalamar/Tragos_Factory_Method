
// Clases concretas de Tragos
/*
 * En este ejemplo, las clases Fernet y Daiquiri heredan de la clase abstracta Trago y 
 * proporcionan implementaciones concretas de los métodos ingredients() y preparation().
 * Las clases PrepararFernetCocaCola y PrepararDaiquiri implementan la interfaz PrepararTrago y 
 * proporcionan métodos para crear instancias de los respectivos tipos de tragos.
 */
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
        System.out.println("+ Receta del Fernet Cola:\r\n" + //
                "Las medidas pueden variar segun el gusto de cada uno. Puede ser mas o menos fuerte dependiendo de la cantidad de Fernet que usemos.\r\n" + //
                " Segun la marca mas tradicional las proporciones ideales son 30% de fernet, 70% de coca y tres hielos. \r\n" + //
                " Entonces en un vaso con tres hielos, servimos la medida de fernet y luego de a poco la Coca-Cola \r\n" + //
                " (no hacerlo de golpe porque se genera mucha espuma).");
    }
}


