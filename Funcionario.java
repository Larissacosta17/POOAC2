public class Funcionario extends FuncionarioBase {
    public Funcionario(FuncionarioBase funcionarioBase) {
        super(" ", 0);
    }

    @Override
    public double calcularSalario() {
        double salario = getSalarioBase();
        return salario;
    }
}