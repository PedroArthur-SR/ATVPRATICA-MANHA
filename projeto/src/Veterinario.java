public class Veterinario {
    private String nome;
    private String cpf;
    private String especialidade;
    private String telefone;






    public Veterinario(String nome, String cpf, String especialidade, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.especialidade = especialidade;
        this.telefone = telefone;
    }

    public void setNome (String nome){
        this.nome = nome;
    }
    public String getnome(){
        return nome;
    }

    public void setCpf (String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return cpf;
    }

    public void setEspecialidade (String especialidade){
        this.especialidade = especialidade;
    }
    public String getEspecialidade(){
        return especialidade;
    }

    public void setTelefone (String telefone){
        this.nome = telefone;
    }
    public String getTelefone(){
        return telefone;
    }
}
