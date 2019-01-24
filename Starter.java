public class Starter {



    public static void main(String[] args) {

        MusicOrganizer organizer = new MusicOrganizer();
        InputReader inputReader = new InputReader();
        organizer.addFile("Levels.mp3");
        organizer.addFile("SweetbutPsycho.mp3");
        organizer.addFile("The Nights.mp3");
        System.out.println("0: Liste an Songs");
        inputReader.scanner(organizer);
        System.out.println("Welchen Song willst du abspielen?");
        inputReader.songauswahl(organizer);
    }

}
