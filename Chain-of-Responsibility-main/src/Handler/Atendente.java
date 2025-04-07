package Handler;

public abstract class Atendente {
    protected Atendente proximoAtendente;

    // Define o próximo handler na cadeia.
    public void setProximoAtendente(Atendente proximoAtendente) {
        this.proximoAtendente = proximoAtendente;
    }

    // Método abstrato para tratar a reclamação.
    public abstract void tratarReclamacao(String reclamacao);
}