import java.util.Scanner;


public class InputReader {


    public void scanner(MusicOrganizer musicOrganizer){
        String eingabe;
        Scanner scanner = new Scanner(System.in);
        eingabe = scanner.nextLine();


        if (eingabe.equals("0")){
            musicOrganizer.showlist();
        }

        else if(eingabe.equals("1")) {
            System.out.println("Welches Lied möchtest du hören?");
            eingabe = scanner.nextLine();
            musicOrganizer.startPlaying(Integer.parseInt(eingabe));
        }

    }

    public void songauswahl(MusicOrganizer musicOrganizer){

        String eingabelied;
        Scanner scanner = new Scanner(System.in);
        eingabelied = scanner.nextLine();
        musicOrganizer.startPlaying(Integer.parseInt(eingabelied));
        eingabelied = scanner.nextLine();
        if(eingabelied.equals("stop")){
            musicOrganizer.stop();
        }


    }


}
