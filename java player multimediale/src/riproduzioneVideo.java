public class riproduzioneVideo extends elementoMultimediale implements play{
    private int volume;
    private int durata;
    private int luminosita;


    public riproduzioneVideo(String titolo, int volume, int durata, int luminosita) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
        this.luminosita = luminosita;
    }

    public int getLuminosita() {
        return luminosita;
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


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public void abbassaVolume(){
        if(this.volume>0){
            this.volume--;
        }
    }

    public void alzaVolume(){
        if(this.volume<100){
            this.volume++;
        }
    }

    @Override
    public void play() {
        for (int i = 0; i < getDurata(); i++) {
            System.out.println(getTitolo() + "!".repeat(getVolume()) + "*".repeat(luminosita));
        }
    }
}
