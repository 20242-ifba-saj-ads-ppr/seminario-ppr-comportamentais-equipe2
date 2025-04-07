package ConcreteColleague;

import Colleague.Aeronave;
import ConcreteMediator.TorreDeControleConcreta;
import Mediator.TorreControle;

public class Aviao implements Aeronave {
    private TorreControle torre;
    private String nome;

    public Aviao(String nome, TorreControle torre) {
        this.nome = nome;
        this.torre = torre;
        ((TorreDeControleConcreta) torre).registrarAeronave(this);
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println(nome + " recebeu: " + mensagem);
    }

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println(nome + " enviando: " + mensagem);
        torre.distribuirMensagem(mensagem, this);
    }
}