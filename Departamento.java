import java.util.ArrayList;

public class Departamento {
    private String nome;

    public Departamento(String nome) {
        this.nome = nome;
    }

    ArrayList<FuncionarioBase> ListadeFuncionários = new ArrayList<>();

    public void adicionarFuncionario(FuncionarioBase funcionario) {
        ListadeFuncionários.add(funcionario);
    }

    public void removerFuncionario(FuncionarioBase funcionario) {
        ListadeFuncionários.remove(funcionario);
    }

}