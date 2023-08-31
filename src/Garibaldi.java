public class Garibaldi extends Trago {

    public Garibaldi(String name, int price){
        super(name,price);
    }
    public void ingredients(){
        System.out.println(
            "+ Ingredintes del Garibaldi:\r\n" + //
                "- 1 rodaja de naranja\r\n" + //
                "- 180 ml de jugo de naranja natural\r\n" + //
                "- 60 ml Campari");
  
    }
    public void preparation(){
        System.out.println("+ Receta del Garibaldi:\r\n" + //
                "Simplemente hay que combinar el bitter con el jugo de naranja y decorar con la rodaja en el borde del vaso.");
    }
}
