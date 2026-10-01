import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        
        ArrayList<Atendimento> atendimentos = new ArrayList<>();
        Atendimento pessoa1 = new Atendimento(2, "Toto", "Cachorro", "Pedro", "20/02/2023", "09:00", "Agendado", "Nenhuma");
        atendimentos.add(pessoa1);
        for (int i = 0; i < atendimentos.size(); i++) {
            System.out.println(atendimentos.get(i));
        }
    }
}
