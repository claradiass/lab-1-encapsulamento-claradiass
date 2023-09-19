public class Circulo {
    private float raio;
    
    public Circulo(float raio){
        this.raio = raio;
    }
    
    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float getCircunferencia(){
        return (float) (2 * 3.14159f * raio);
    }

    public float getArea(){
        return (float) (3.14159 * raio * raio);
    }
}
