import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        elementoMultimediale[] elementi = new elementoMultimediale[5];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < elementi.length; i++) {
            System.out.println(" Che cosa vuoi creare? 1.Audio 2.Video 3.Immagine");
            int scelta = scan.nextInt();
            switch (scelta) {
                case 1:
                    System.out.println(" Inserisci il titolo ");
                    String titoloAudio = scan.next();
                    System.out.println(" Inserisci la durata ");
                    int durataAudio = scan.nextInt();
                    System.out.println(" Inserisci il volume ");
                    int volumeAudio = scan.nextInt();
                    registrazioneAudio audio = new registrazioneAudio(titoloAudio, volumeAudio, durataAudio);
                    elementi[i] = audio;
                    break;
                case 2:
                    System.out.println(" Inserisci il titolo ");
                    String titoloVideo = scan.next();
                    System.out.println(" Inserisci il volume ");
                    int volumeVideo = scan.nextInt();
                    System.out.println(" Inserisci la durata ");
                    int durataVideo = scan.nextInt();
                    System.out.println(" Inserisci la luminosità ");
                    int luminositaVideo = scan.nextInt();

                    riproduzioneVideo video = new riproduzioneVideo(titoloVideo, durataVideo, volumeVideo, luminositaVideo);
                    elementi[i] = video;
                    break;
                case 3:
                    System.out.println(" Inserisci il titolo ");
                    String titoloImmagine = scan.next();
                    System.out.println(" Inserisci la luminosità ");
                    int luminositaImmagine = scan.nextInt();
                    mostraImmagine immagine = new mostraImmagine(titoloImmagine, luminositaImmagine);
                    elementi[i] = immagine;

                    break;
                default:
                    System.out.println("Numero non valido");
                    break;
            }

        }
        while (true) {
            System.out.println(" Inserisci un numero da 1 a 5 o 0 per uscire");
            int scelta = scan.nextInt();
            if (scelta == 0) {
                System.out.println(" Sono uscito");
                break;

            } else {
                if (elementi[scelta-1] instanceof mostraImmagine) {
                    ((mostraImmagine) elementi[scelta-1]).show();
                } else if (elementi[scelta-1] instanceof riproduzioneVideo) {
                    ((riproduzioneVideo) elementi[scelta-1]).play();
                } else {
                    ((registrazioneAudio) elementi[scelta-1]).play();
                }
            }

        }
    }
}

