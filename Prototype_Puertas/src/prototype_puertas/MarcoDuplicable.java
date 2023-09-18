package prototype_puertas;

// Clase MarcoDuplicable que implementa Duplicable
class MarcoDuplicable implements Duplicable {
    @Override
    public Object duplicar() {
        return new Marco(); // Crea un nuevo marco clonado
    }
}
