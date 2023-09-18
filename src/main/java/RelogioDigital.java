public class RelogioDigital {
    int hora;
    int minuto;

    public RelogioDigital(){
        this.hora = 23;
        this.minuto = 59;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void tick(){
        minuto++;

        if (minuto == 60) {
            minuto = 0; 
            hora++; 

            if (hora == 24) {
                hora = 0; 
            }
        }
                
        
    }

    public static void main(String[] args){
        RelogioDigital relogio = new RelogioDigital();
        
        System.out.println("Hora inicial: " + relogio.getHora() + ":" + relogio.getMinuto());
        
        
        relogio.tick();
        
        System.out.println("Hora após o tick: " + relogio.getHora() + ":" + relogio.getMinuto());

        
    }
}
