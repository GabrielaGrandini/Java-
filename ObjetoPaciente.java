import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class ObjetoPaciente {
    public  static void main (String[] args){
        Scanner ler = new Scanner (System.in);
        Paciente paciente = new Paciente ();

        System.out.println("---- FICHA ----");
        System.out.println("Nome: ");
        paciente.setNome(ler.nextLine());
        System.out.println("Endereço: ");
        paciente.setEndereco(ler.nextLine());
        System.out.println("CPF: ");
        paciente.setCpf(ler.nextLine());
        System.out.println("Sexo: ");
        paciente.setSexo(ler.next().charAt(0));
        ler.nextLine();
        System.out.println("Nível de escolaridade: ");
        paciente.setNivelDeEscolaridade(ler.nextLine());
        System.out.println("Email: ");
        paciente.setEmail(ler.nextLine());
        System.out.println("Data de nascimento: ");
        paciente.setDataDeNascimento(ler.nextLine());
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = null;
        System.out.println("Telefone: ");
        paciente.setTelefone(ler.nextLine());

        System.out.println("---- FICHA FINAL ----");
        System.out.println(paciente.getNome());
        System.out.println(paciente.getEndereco());
        System.out.println(paciente.getCpf());
        System.out.println(paciente.getSexo());
        System.out.println(paciente.getNivelDeEscolaridade());
        System.out.println(paciente.getEmail());
        System.out.println(paciente.getDataDeNascimento());
        System.out.println(paciente.getTelefone());

    }
}
