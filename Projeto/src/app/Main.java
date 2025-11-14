package app;

import dto.BruxoRequestDto;
import dto.BruxoResponseDto;
import model.Bruxo;
import model.BruxoGrifinoria;
import model.BruxoSonserina;

public class Main{
    public static void main(String[] args){
        BruxoRequestDto primeiroBruxo = new BruxoRequestDto("Harry potter", "Grifinória");
        BruxoRequestDto segundoBruxo = new BruxoRequestDto("Draco Malfoy", "Sonserina");

        Bruxo bruxo1 = new BruxoGrifinoria(primeiroBruxo.getNome(), primeiroBruxo.getCasa());
        Bruxo bruxo2 = new BruxoSonserina(segundoBruxo.getNome(), segundoBruxo.getCasa());

        bruxo1.mostrarInformacoes();
        ((BruxoGrifinoria) bruxo1).lancarFeitico();
        System.out.println("_____________________________");

        bruxo2.mostrarInformacoes();
        ((BruxoSonserina) bruxo2).lancarFeitico();

        BruxoResponseDto respostaPrimeiroBruxo = new BruxoResponseDto(
                primeiroBruxo.getNome(),
                primeiroBruxo.getCasa(),
                "Feitiço: Expelliarmus"
        );

        BruxoResponseDto respostaSegundoBruxo = new BruxoResponseDto(
                segundoBruxo.getNome(),
                segundoBruxo.getCasa(),
                "Feitiço: Serpensortia"
        );
        System.out.println("\n=== Bruxos Criados ===");
        System.out.println(

                        respostaPrimeiroBruxo.getNome() + " | " +
                        respostaPrimeiroBruxo.getCasa() + " | " +
                        respostaPrimeiroBruxo.getTipoMagia()
        );

        System.out.println(

                        respostaSegundoBruxo.getNome() + " | " +
                        respostaSegundoBruxo.getCasa() + " | " +
                        respostaSegundoBruxo.getTipoMagia()

        );
        }
    }
