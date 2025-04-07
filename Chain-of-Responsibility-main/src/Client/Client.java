package Client;

import ConcreteHandler.DepartamentoEntrega;
import ConcreteHandler.DepartamentoLogistica;
import ConcreteHandler.DepartamentoSuporte;
import ConcreteHandler.Gerente;
import ConcreteHandler.Vendedor;
import Handler.Atendente;

public class Client {
    public static void main(String[] args) {
        // Criação dos handlers.
        Atendente vendedor = new Vendedor();
        Atendente gerente = new Gerente();
        Atendente depEntrega = new DepartamentoEntrega();
        Atendente depLogistica = new DepartamentoLogistica();
        Atendente depSuporte = new DepartamentoSuporte();
        
        // Configuração da cadeia:
        // Vendedor -> Gerente -> Departamento de Entregas -> Departamento de Logística -> Departamento de Suporte
        vendedor.setProximoAtendente(gerente);
        gerente.setProximoAtendente(depEntrega);
        depEntrega.setProximoAtendente(depLogistica);
        depLogistica.setProximoAtendente(depSuporte);
        
        // Exemplo 1: Reclamação sobre produto que não chegou.
        String reclamacao1 = "Minha compra não chegou.";
        System.out.println("Cliente: Reclamação: \"" + reclamacao1 + "\"");
        vendedor.tratarReclamacao(reclamacao1);
        
        System.out.println("\n-----------------------------\n");
        
        // Exemplo 2: Reclamação sobre atraso na entrega.
        String reclamacao2 = "Minha compra sofreu atraso na entrega.";
        System.out.println("Cliente: Reclamação: \"" + reclamacao2 + "\"");
        vendedor.tratarReclamacao(reclamacao2);
        
        System.out.println("\n-----------------------------\n");
        
        // Exemplo 3: Reclamação que pode ser tratada pelo Vendedor ou Gerente (não é de entrega).
        String reclamacao3 = "Quero uma explicação sobre o preço cobrado.";
        System.out.println("Cliente: Reclamação: \"" + reclamacao3 + "\"");
        vendedor.tratarReclamacao(reclamacao3);
    }
}