public class registrazioneAudio extends elementoMultimediale implements play {

    private int volume;
    private int durata;

    public registrazioneAudio(String titolo, int volume, int durata) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
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
        for (int i = 0; i < durata; i++) {
            System.out.println(getTitolo() + "!".repeat(volume));
        }

    }
    }

