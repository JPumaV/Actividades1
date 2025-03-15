public class Rectangulo {
    private Coordenada esquina1;
    private Coordenada esquina2;

    public Rectangulo(Coordenada c1, Coordenada c2) {
        this.esquina1 = new Coordenada(Math.min(c1.getX(), c2.getX()), Math.min(c1.getY(), c2.getY()));
        this.esquina2 = new Coordenada(Math.max(c1.getX(), c2.getX()), Math.max(c1.getY(), c2.getY()));
    }

    public void setEsquina1(Coordenada c) {
        this.esquina1 = new Coordenada(c);
    }

    public void setEsquina2(Coordenada c) {
        this.esquina2 = new Coordenada(c);
    }

    public Coordenada getEsquina1() {
        return esquina1;
    }

    public Coordenada getEsquina2() {
        return esquina2;
    }

    public double calcularArea() {
        double base = Math.abs(esquina1.getX() - esquina2.getX());
        double altura = Math.abs(esquina1.getY() - esquina2.getY());
        return base * altura;
    }

    public double calcularAreaSuperposicion(Rectangulo otro) {
        double xSuper = Math.max(0, Math.min(this.esquina2.getX(), otro.esquina2.getX())
                - Math.max(this.esquina1.getX(), otro.esquina1.getX()));
        double ySuper = Math.max(0, Math.min(this.esquina2.getY(), otro.esquina2.getY())
                - Math.max(this.esquina1.getY(), otro.esquina1.getY()));
        return xSuper * ySuper;
    }

    @Override
    public String toString() {
        return "([" + esquina1 + "], [" + esquina2 + "])";
    }
}
