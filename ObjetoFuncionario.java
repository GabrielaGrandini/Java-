import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class ObjetoFuncionario {
    public  static void main (String[] args){
        Scanner ler = new Scanner (System.in);
        Funcionario funcionario = new Funcionario ();

        System.out.println("---- FICHA ----");
        System.out.println("Nome: ");
        funcionario.setNome(ler.nextLine());
        System.out.println("Endereço: ");
        funcionario.setEndereco(ler.nextLine());
        System.out.println("CPF: ");
        funcionario.setCpf(ler.nextLine());
        System.out.println("Telefone: ");
        funcionario.setTelefone(ler.nextLine());
        System.out.println("Cargo: ");
        funcionario.setCargo(ler.nextLine());
        System.out.println("Data de admissão: ");
        funcionario.setDataDeAdmissao(ler.nextLine());
        SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
        Date data1 = null;
        System.out.println("Data de demissão: ");
        funcionario.setDataDeDemissao(ler.nextLine());
        SimpleDateFormat formato2 = new SimpleDateFormat("dd/MM/yyyy");
        Date data2 = null;
        System.out.println("Email: ");
        funcionario.setEmail(ler.nextLine());
        System.out.println("Sexo: ");
        funcionario.setSexo(ler.next().charAt(0));
        ler.nextLine();
        System.out.println("Nível de escolaridade: ");
        funcionario.setNivelDeEscolaridade(ler.nextLine());


        System.out.println("---- FICHA FINAL ----");
        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getEndereco());
        System.out.println(funcionario.getCpf());
        System.out.println(funcionario.getTelefone());
        System.out.println(funcionario.getCargo());
        System.out.println(funcionario.getDataDeAdmissao());
        System.out.println(funcionario.getDataDeDemissao());
        System.out.println(funcionario.getEmail());
        System.out.println(funcionario.getSexo());
        System.out.println(funcionario.getNivelDeEscolaridade());


    }
}
