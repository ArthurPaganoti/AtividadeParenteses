public class CelulaPilha {

    private String nome;
    private CelulaPilha anterior;

    public CelulaPilha(){
    this.nome = nome;
    this.anterior = anterior;
    }

    public String getDado(){
        return this.nome;
    }

    public void setDado(String nome){
        this.nome = nome;
    }

    public CelulaPilha getAnterior(){
        return(this.anterior);
    }

    public void setAnterior(CelulaPilha anterior){
        this.anterior = anterior;
    }
}
