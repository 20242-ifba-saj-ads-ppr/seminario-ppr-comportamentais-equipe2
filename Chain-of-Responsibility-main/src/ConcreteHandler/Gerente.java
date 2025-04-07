package ConcreteHandler;

import Handler.Atendente;

public class Gerente extends Atendente {
    @Override
    public void tratarReclamacao(String reclamacao) {
        if (podeTratar(reclamacao)) {
            System.out.println("Gerente: Tratando a reclamação: \"" + reclamacao + "\"");
        } else {
            System.out.println("Gerente: Não posso tratar essa reclamação. Encaminhando para o Departamento de Entregas.");
            if (proximoAtendente != null) {
                proximoAtendente.tratarReclamacao(reclamacao);
            } else {
                System.out.println("Gerente: Não há mais responsáveis para tratar a reclamação.");
            }
        }
    }
    
    private boolean podeTratar(String reclamacao) {
        return !reclamacao.toLowerCase().contains("não chegou");
    }
}