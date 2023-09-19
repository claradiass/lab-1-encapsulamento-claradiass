public class CarroAluguel {
    private float valorPorKm;
    private int distancia;
    private boolean disponivel;
    private boolean sinistro;
    private float debito;






    public CarroAluguel(float valorPorKm){
        this.valorPorKm = valorPorKm;
        this.distancia = 0;
        this.disponivel = true;
        this.sinistro = false;
        this.debito = 0;
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
        return disponivel;
    }


   


    public void alugar() throws CarroIndisponivelException{
        if(disponivel){
            disponivel = false;
            distancia = 0;
        } else {
            throw new CarroIndisponivelException("O carro está indisponível.");
        }


    }


    public void devolver() throws CarroDisponivelException, CarroNaoPagoException {
        if (disponivel) {
            throw new CarroDisponivelException("O carro está disponível.");
        }
    
        if (distancia > 0 && debito == 0) {
            throw new CarroNaoPagoException("O carro não foi pago.");
        }
    
        disponivel = true;
        sinistro = false;
        distancia = 0;
    }


    public boolean hasSinistro(){
        return sinistro;
    }


    public void setSinistro(boolean sinistro) {
        this.sinistro = sinistro;
    }


    public float getDebito(){
        float debitoAtual = valorPorKm * distancia;


        if (sinistro) {
            float percentual = debitoAtual * 0.6f;
            debitoAtual += percentual;
            this.sinistro = false;
        }


        return debitoAtual;
    }


    public void pagar() throws CarroDisponivelException{
        if(!disponivel){
            debito = 0;
            distancia = 0;
        } else {
            throw new CarroDisponivelException("O carro está disponível.");
        }
    }


}
