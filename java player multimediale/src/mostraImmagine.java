public class mostraImmagine extends elementoMultimediale implements show{
    private int luminosita;




    public mostraImmagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }
    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }
    public void abbassaluminosita(){
        if(this.luminosita>0){
            this.luminosita--;
        }
    }

    public void alzaluminosita(){
        if(this.luminosita<100){
            this.luminosita++;
        }
    }


    @Override
    public void show() {
        System.out.println(getTitolo() + "*".repeat(luminosita));
    }
}

