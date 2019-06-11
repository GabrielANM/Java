package Exercicio4;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Funcionario gabriel = new Funcionario( "Gabriel", 1250.50, "11/06/2019");
        Funcionario laura = new Funcionario( "Laura", 5000.00, "12/06/2019");
        Funcionario paulo = new Funcionario( "Paulo", 3600.50, "15/07/2018");

        Funcionario marcia = new Funcionario( "Marcia", 2400.30, "22/09/2017");
        Funcionario marta = new Funcionario( "Marta", 1500.40, "21/05/2019");
        Funcionario fabricio = new Funcionario( "Fabricio", 1300.50, "03/09/2015");

        List<Funcionario> listaDeFuncionarios1 = new ArrayList<>();
        listaDeFuncionarios1.add(gabriel);
        listaDeFuncionarios1.add(laura);
        listaDeFuncionarios1.add(paulo);

        List<Funcionario> listaDeFuncionarios2 = new ArrayList<>();
        listaDeFuncionarios2.add(marcia);
        listaDeFuncionarios2.add(marta);
        listaDeFuncionarios2.add(fabricio);

        Departamento departamento = new Departamento( "Marketing", listaDeFuncionarios1);
        Departamento departamento1 = new Departamento("Financeiro", listaDeFuncionarios2);

        List<Departamento> listaDeDepartamentos = new ArrayList<>();
        listaDeDepartamentos.add(departamento);
        listaDeDepartamentos.add(departamento1);

        Empresa empresa = new Empresa( "Bar do Zé", "0775576576-31", listaDeDepartamentos);

        /*departamento.setFuncionarios(fun.add(laura));
        System.out.println(fun.get(1).getNome()); */


    }
}
