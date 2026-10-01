import java.util.ArrayList;

public class Atendimento {
    private int codigo;
    private String nomeAnimal;
    private String especie;
    private String nomeTutor;
    private String data;
    private String horario;
    private String statusAtendimento;
    private String observacoes;

    private ArrayList atendimentos = new ArrayList<>();

    public Atendimento(int codigo, String nomeAnimal, String especie, String nomeTutor, String data, String horario, String statusAtendimento,
        String observacoes){
        this.codigo = codigo;
        this.nomeAnimal = nomeAnimal;
        this.especie = especie;
        this.nomeTutor = nomeTutor;
        this.data = data;
        this.horario = horario;
        this.statusAtendimento = statusAtendimento;
        this.observacoes = observacoes;
    }

    public void cadastrarAtendimento(){
        atendimentos.add(atendimentos);
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return codigo;
    }

    public void setNomeAnimal(String nomeAnimal){
        this.nomeAnimal = nomeAnimal;
    }
    public String getNomeAnimal(){
        return nomeAnimal;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }
    public String getEspecie(){
        return especie;
    }

    public void setNomeTutor(String nomeTutor){
        this.nomeTutor = nomeTutor;
    }
    public String getNomeTutor(){
        return nomeTutor;
    }

    public void setData(String data){
        this.data = data;
    }
    public String getData(){
        return data;
    }

    public void setHorario(String horario){
        this.horario = horario;
    }
    public String getHorario(){
        return horario;
    }
    public void setStatusAtendimento(String statusAtendimento){
        this.statusAtendimento = statusAtendimento;
    }
    public String getStatusAtendimento(){
        return statusAtendimento;
    }
    public void setObservacoes(String observacoes){
        this.observacoes = observacoes;
    }
    public String getObservacoes(){
        return observacoes;
    }
}
