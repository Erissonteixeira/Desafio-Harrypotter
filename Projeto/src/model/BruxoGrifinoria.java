package model;

public class BruxoGrifinoria extends Bruxo implements Magia{
    public BruxoGrifinoria(String nome, String casa){
        super(nome, casa);
    }
    @Override
    public void lancarFeitico(){
        System.out.println("Expelliarmus! -O bruxo da Grifinoria lançou seu feitiço!");
    }
}
