import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 *
 * @author David J. Barnes and Michael KÃ¶lling
 * @version 2011.07.31
 */
@SuppressWarnings("MagicConstant")
public class MusicOrganizer {
    // An ArrayList for storing the file names of music files.
    private ArrayList<Track> files;
    // A player for the music files.
    private MusicPlayer player;

    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer() {
        files = new ArrayList<Track>();
        player = new MusicPlayer();
    }

    /**
     * Add a file to the collection.
     *
     * @param filename The file to be added.
     */
    public void addFile(String filename) {
        files.add(new Track(filename));
    }

    /**
     * Return the number of files in the collection.
     *
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles() {
        return files.size();
    }

    /**
     * List a file from the collection.
     *
     * @param index The index of the file to be listed.
     */
    public void listFile(int index) {
        if (index >= 0 && index < files.size()) {
            String filename = files.get(index).getFilename();
            System.out.println(filename);
        }
    }


    //TODO: implement a listAllFiles method (task 2) use a for-each loop or lambda

    public void listAllFiles() {
        for (Track s : files) {
            System.out.println(s.getFilename());
        }

    }

    //TODO: implement a listMatching method (task 3)


    public boolean listMatching(String eingabe) {
        for (Track s : files) {
            if (s.getFilename().contains(eingabe)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Find the index of the first file matching the given
     * search string.
     *
     * @param searchString The string to match.
     * @return The index of the first occurrence, or -1 if
     * no match is found.
     */
    public int findFirst(String searchString) {
        int index = 0;
        // Record that we will be searching until a match is found.
        boolean searching = true;

        while (searching && index < files.size()) {
            String filename = files.get(index).getFilename();
            if (filename.contains(searchString)) {
                // A match. We can stop searching.
                searching = false;
            } else {
                // Move on.
                index++;
            }
        }
        if (searching) {
            // We didnï¿½t find it.
            return -1;
        } else {
            // Return where it was found.
            return index;
        }
    }

    /**
     * Remove a file from the collection.
     *
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index) {
        if (index >= 0 && index < files.size()) {
            files.remove(index);
        }
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     *
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index) {
        String filename = files.get(index).getFilename();
        player.startPlaying(filename);
    }

    /**
     * Stop the player.
     */
    public void stopPlaying() {
        player.stop();
    }

    public void showlist() {
        for (int i = 0; i<files.size(); i++){
            System.out.println(i + files.get(i).getFilename());
        }
    }

    public void stop(){
        player.stop();
    }

}
