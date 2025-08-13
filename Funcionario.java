public class Funcionario {
    String nome;
    String endereco;
    String cpf;
    String telefone;
    String cargo;
    String dataDeAdmissao;
    String dataDeDemissao;
    String email;
    char sexo;
    String nivelDeEscolaridade;
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
    } public String getDataDeAdmissao() {
        return dataDeAdmissao;
    } public void setDataDeAdmissao(String dataDeAdmissao){
        this.dataDeAdmissao = this.dataDeAdmissao;
    } public String getTelefone(){
        return telefone;
    } public void setTelefone(String telefone) {
        this.telefone = telefone;
    }public String getDataDeDemissao() {
        return dataDeDemissao;
    } public void setDataDeDemissao(String dataDeDemissao){
        this.dataDeDemissao = dataDeDemissao;
    } public String getCargo() {
        return cargo;
    } public void setCargo(String cargo){
        this.cargo = cargo;
    }
}

