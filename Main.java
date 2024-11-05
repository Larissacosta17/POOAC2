public class Main {
    public static void main(String[]args){

    Departamento RecursosHumanos = new Departamento("RH");

        RecursosHumanos.funcionarios.add(new Funcionario("João", 3000));
        RecursosHumanos.funcionarios.add(new Gerente("Maria", 5000, 0.20));
        RecursosHumanos.funcionarios.add(new Diretor("Carlos", 10000, 0.30, 2000));

}
