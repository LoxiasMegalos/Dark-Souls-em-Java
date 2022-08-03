package main.inimigos;

public class ZumbiLerdo extends Inimigo{
    
    public ZumbiLerdo(String nome, double vida, String tipoArma){
        super(nome, vida, tipoArma);
    }

    @Override
    public String atacando(){
        return "Zumbi Lerdo " + this.getNome() + " atacando!";
    }
}
