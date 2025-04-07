package ConcreteHandler;

import Handler.Atendente;

public class Vendedor extends Atendente {
    @Override
    public void tratarReclamacao(String reclamacao) {
        if (podeTratar(reclamacao)) {
            System.out.println("Vendedor: Tratando a reclamação: \"" + reclamacao + "\"");
        } else {
            System.out.println("Vendedor: Não posso tratar essa reclamação. Encaminhando para o Gerente.");
            // Passa a responsabilidade para o próximo na cadeia.
            if (proximoAtendente != null) {
                proximoAtendente.tratarReclamacao(reclamacao);
            } else {
                System.out.println("Vendedor: Não há mais responsáveis para tratar a reclamação.");
            }
        }
    }
    
    // O Vendedor trata reclamações que não são de entrega.
    private boolean podeTratar(String reclamacao) {
        return !reclamacao.toLowerCase().contains("não chegou");
    }
}