// Interfaz de la fábrica de Tragos

public interface PrepararTrago {
    Trago crearTrago(String name);
}

// Implementaciones 

class PrepararFernetCocaCola implements PrepararTrago {
    @Override
    public Trago crearTrago(String name) {
        return new FernetCocaCola(name);
    }
}

class PrepararDaiquiri implements PrepararTrago {
    @Override
    public Trago crearTrago(String name) {
        return new Daiquiri(name);
    }
}