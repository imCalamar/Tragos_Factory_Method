// PrepararTrago declara la interfaz
public interface PrepararTrago {
    Trago crearTrago(String name,int price);
}

// Implementaciones de la Interfaz PrepararTrago, 
//son preparaciones de tragos cocretas

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

class PrepararMojito implements PrepararTrago {
    @Override
    public Trago crearTrago(String name,int price) {
        return new Mojito(name,price);
    } 
}

class PrepararGaribaldi implements PrepararTrago {
    @Override
    public Trago crearTrago(String name,int price) {
        return new Garibaldi(name,price);
    } 
}