public class Estudante {
    public String nome;
    public int matricula;
    

    public Estudante(String nome, int matricula){
        
        this.matricula = matricula;
        this.nome = nome;
 
    }  

    public String getNome(){
        return nome;
    }

    public int getMatricula(){
        return matricula;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

}  
