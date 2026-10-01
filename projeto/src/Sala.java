public class Sala {
    private int numero;
    private String bloco;
    private int capMaxima;
    private String tipoSala;

    public Sala(int numero, String bloco, int capMaxima, String tipoSala){
        this.numero = numero;
        this.bloco = bloco;
        this.capMaxima = capMaxima;
        this.tipoSala = tipoSala;
    }



    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return numero;
    }

    public void setBloco(String bloco){
        this.bloco = bloco;
    }
    public String getBloco(){
        return bloco;
    }

    public void setcapMaxima(int capMaxima){
        this.capMaxima = capMaxima;
    }
    public int getcapMaxima(){
        return capMaxima;
    }

    public void setTipoSala(String tipoSala){
        this.tipoSala = tipoSala;
    }
    public String getTipoSala(){
        return tipoSala;
    }

}
