package Controller;

public class ConfiguraCPF {

    public String montaCpf(String cpf) {
        String cpfMontado = "";
        if (cpf.length() == 11) {
            cpfMontado = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11);
        } else {
            cpfMontado = cpf;
        }
        return cpfMontado;
    }

    public String desmontaCpf(String cpf) {
        String cpfDesmontado = "";
        if (cpf.contains("-")) {
            cpf = cpf.replace("-", "");
            cpfDesmontado = cpf.replace(".", "");
            return cpfDesmontado;
        }
        return cpf;
    }
}
