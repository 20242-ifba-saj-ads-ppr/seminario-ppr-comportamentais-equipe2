package ConcreteMediator;

import java.util.ArrayList;
import java.util.List;

import Colleague.Aeronave;
import Mediator.TorreControle;

public class TorreDeControleConcreta implements TorreControle {
    private List<Aeronave> aeronaves = new ArrayList<>();

    public void registrarAeronave(Aeronave aeronave) {
        aeronaves.add(aeronave);
    }

    @Override
    public void distribuirMensagem(String mensagem, Aeronave origem) {
        for (Aeronave aeronave : aeronaves) {
            if (aeronave != origem) {
                aeronave.receberMensagem(mensagem);
            }
        }
    }

   
}