package ConcreteHandler;

import Handler.Atendente;

public class DepartamentoSuporte extends Atendente {
    @Override
    public void tratarReclamacao(String reclamacao) {
        if (podeTratar(reclamacao)) {
            System.out.println("Departamento de Suporte: Tratando a reclamação: \"" + reclamacao + "\"");
        } else {
            System.out.println("Departamento de Suporte: Reclamação não reconhecida ou não pode ser tratada.");
        }
    }
    
    
    private boolean podeTratar(String reclamacao) {
        return true;
    }
    
}