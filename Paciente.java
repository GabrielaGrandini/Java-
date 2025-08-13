
public class Paciente {
    String nome;
    String endereco;
    String cpf;
    char sexo;
    String nivelDeEscolaridade;
    String email;
    String dataDeNascimento;
    String telefone;
    public String getNome(){
        return nome;
    } public void setNome(String nome){
        this.nome = nome;
    } public String getEndereco(){
        return endereco;
    } public void setEndereco(String endereco){
        this.endereco = endereco;
    } public String getCpf(){
        return cpf;
    } public void setCpf(String cpf){
        this.cpf = cpf;
    }   public char getSexo(){
        return sexo;
    } public void setSexo(char sexo){
        this.sexo = sexo;
    } public String getNivelDeEscolaridade(){
        return nivelDeEscolaridade;
    } public void setNivelDeEscolaridade(String nivelDeEscolaridade){
        this.nivelDeEscolaridade = nivelDeEscolaridade;
    } public String getEmail(){
        return email;
    } public void setEmail(String email){
        this.email = email;
    } public String getDataDeNascimento() {
        return dataDeNascimento;
    } public void setDataDeNascimento(String dataDeNascimento){
        this.dataDeNascimento = dataDeNascimento;
    } public String getTelefone(){
        return telefone;
    } public void setTelefone(String telefone){
        this.telefone = telefone;
    }
}
