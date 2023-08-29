// Interfaz de la fábric de Tragos

public interface PrepararTrago {
    Trago crearTrago(String name,int price);

}

// Implementaciones 

class PrepararFernetCocaCola implements PrepararTrago {
    @Override
    public Trago crearTrago(String name,int price) {
        return new FernetCocaCola(name,price);
    }
}

class PrepararDaiquiri implements PrepararTrago {
    @Override
    public Trago crearTrago(String name,int price) {
        return new Daiquiri(name,price);
    }
}