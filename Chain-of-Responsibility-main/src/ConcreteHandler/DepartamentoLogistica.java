package ConcreteHandler;

import Handler.Atendente;

public class DepartamentoLogistica extends Atendente {
    @Override
    public void tratarReclamacao(String reclamacao) {
        if (podeTratar(reclamacao)) {
            System.out.println("Departamento de Logística: Tratando a reclamação: \"" + reclamacao + "\"");
        } else {
            System.out.println("Departamento de Logística: Não posso tratar essa reclamação. Encaminhando para o Departamento de Suporte.");
            if (proximoAtendente != null) {
                proximoAtendente.tratarReclamacao(reclamacao);
            } else {
                System.out.println("Departamento de Logística: Não há mais responsáveis para tratar a reclamação.");
            }
        }
    }
    
    // Aqui, o Departamento de Logística pode tratar outro tipo de reclamação, se necessário.
    private boolean podeTratar(String reclamacao) {
        // Exemplo: trata reclamações de atraso na entrega.
        return reclamacao.toLowerCase().contains("atraso");
    }
}
