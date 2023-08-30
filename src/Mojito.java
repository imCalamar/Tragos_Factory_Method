public class Mojito extends Trago{
    public Mojito(String name, int price){
        super(name,price);
    }
    public void ingredients(){
        System.out.println("+ Ingredintes del Mojito:\r\n" + //
                "- 3 limas\r\n" + //
                "- 100 ml de agua con gas\r\n" + //
                "- 50 ml ron\r\n" + //
                "- 3 ramitas de menta\r\n" + //
                "- 40 grs de azucar\r\n" + //
                "- Hielo");

    }
    public void preparation(){
        System.out.println("+ Receta del Mojito:\r\n" + //
                "Preparar este trago clasico de la coctelera cubana es muy sencillo:\r\n" + //
                "cortamos las limas en cuartos, las colocamos en un vaso largo, \\r\\n" + //
                "junto con el azucar y las ramas de menta. Lo machacamos para que suelte el jugo y agregamos el ron, \\r\\n" + //
                "el hielo y el agua con gas. Finalmente decoramos con menta.");
    }
}
