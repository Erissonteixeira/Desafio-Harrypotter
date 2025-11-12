package model;

public class BruxoSonserina extends Bruxo implements Magia{
    public BruxoSonserina(String nome, String casa){
        super(nome, casa);
    }
    @Override
    public void lancarFeitico(){
        System.out.println("Serpensortia! - O Bruxo da Sonserina lançou seu feitiço!");
    }
}
