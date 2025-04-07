package Mediator;

import Colleague.Aeronave;

public interface TorreControle {
    void distribuirMensagem(String mensagem, Aeronave origem);
}