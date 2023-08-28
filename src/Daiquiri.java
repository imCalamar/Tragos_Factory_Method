public class Daiquiri extends Trago{

    public Daiquiri(String name){
        super(name);
    }
    public void ingredients(){
        System.out.println(
            "+ Ingredintes del Daiquiri:\r\n" + //
                "- 150 grs de fruta natural: frutillas, durazno o anan\u00E1\r\n" + //
                "- Agua\r\n" + //
                "- 100 ml de vodka o ron\r\n" + //
                "- 30 grs de az\u00FAcar\r\n" + //
                "- Hielo\r\n" + //
                "- Menta");
    }
    public void preparation(){
        System.out.println("+ Receta del Daiquiri:\r\n" + //
                "La receta mas habitual es la que incluye frutilla pero hay quienes preparan daiquiri de durazno o anana. \r\n" + //
                "El procedimiento es el mismo para cualquiera de las elecciones: colocamos la fruta y el azucar en la licuadora,  \r\n" + //
                "agregamos el agua, el hielo y el ron o vodka y licuamos. \r\n" + //
                "Servir y decorar con hojitas de menta.");
    }
}
