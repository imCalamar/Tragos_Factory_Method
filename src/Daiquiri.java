public class Daiquiri extends Trago{
    public Daiquiri(String name, int price){
        super(name,price);
    }
    public void ingredients(){
        System.out.println(
            "+ Ingredintes del Daiquiri:\r\n" + //
            "- 150 grs de fruta natural: frutillas, durazno o anana\r\n" + //
            "- Agua\r\n" + //
            "- 100 ml de vodka o ron\r\n" + //
            "- 30 grs de azucar\r\n" + //
            "- Hielo\r\n" + //
            "- Menta");
    }
    public void preparation(){
        System.out.println(
            "+ Receta del Daiquiri:\r\n" + //
            "colocar la fruta y el azucar en la licuadora,  \r\n" + //
            "agrega el agua, el hielo y el ron o vodka y licuamos. \r\n" + //
            "Servir y decorar con hojitas de menta.");
    }
}