package Model;

public class MensagemChat {
    
    private String id_mensagem;
    private String cpf_paciente;
    private String quem_enviou;
    private String data_entrega;
    private String mensagem;

    public String getId_mensagem() {
        return id_mensagem;
    }

    public void setId_mensagem(String id_mensagem) {
        this.id_mensagem = id_mensagem;
    }

    public String getCpf_paciente() {
        return cpf_paciente;
    }

    public void setCpf_paciente(String cpf_paciente) {
        this.cpf_paciente = cpf_paciente;
    }

    public String getQuem_enviou() {
        return quem_enviou;
    }

    public void setQuem_enviou(String quem_enviou) {
        this.quem_enviou = quem_enviou;
    }

    public String getData_entrega() {
        return data_entrega;
    }

    public void setData_entrega(String data_entrega) {
        this.data_entrega = data_entrega;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    
    
    
    
}
