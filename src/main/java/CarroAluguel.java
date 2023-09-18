public class CarroAluguel {
    float valorPorKm;
    int distancia;
    boolean alugado;


    public CarroAluguel(float valorPorKm){
        this.valorPorKm = valorPorKm;
    }

    public float getValorPorKm() {
        return valorPorKm;
    }

    public void setValorPorKm(float valorPorKm) {
        this.valorPorKm = valorPorKm;
    }

    

    public void setDistanciaPercorrida(int distancia) {
        this.distancia= distancia;
    }

    public float getDistanciaPercorrida() {
        return distancia;
    }

    public boolean isDisponivel(){
        return true;
    }

    

    public void alugar(){
        if(!alugado){
            alugado = true;
            System.out.println("Carro alugado com sucesso");
        } else {
            
        }

    }

}



    
