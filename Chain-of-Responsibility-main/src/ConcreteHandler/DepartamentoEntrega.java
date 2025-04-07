package ConcreteHandler;

import Handler.Atendente;

public class DepartamentoEntrega extends Atendente {
    @Override
    public void tratarReclamacao(String reclamacao) {
        if (podeTratar(reclamacao)) {
            System.out.println("Departamento de Entregas: Tratando a reclamação: \"" + reclamacao + "\"");
        } else {
            System.out.println("Departamento de Entregas: Não posso tratar essa reclamação. Encaminhando para o Departamento de Logística.");
            if (proximoAtendente != null) {
                proximoAtendente.tratarReclamacao(reclamacao);
            } else {
                System.out.println("Departamento de Entregas: Não há mais responsáveis para tratar a reclamação.");
            }
        }
    }
    
    private boolean podeTratar(String reclamacao) {
        return reclamacao.toLowerCase().contains("não chegou");
    }
}