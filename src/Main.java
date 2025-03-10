public class Main{
    public static void main(String[] args) {
        
        MusicBox mbox = new MusicBox("S34TG65", 'Y', "Raindrops", "Misty", 
        "The path less traveled", "Country", "BZEE Music", "Rhythm Divine");

        System.out.println("Now playing the song");
        mbox.playSong(mbox.getSongID(), mbox.getPremiumSong(), 2);
        System.out.println("Song ended");
        System.out.println(" ");
        
        // --- TODO

        /* Repeat the above code to create another object  
         * Pass different parameters to the MusicBox constructor, but initialise premiumSong to N and when calling the
         * playSong method, pass ads parameter as just 1
         * 
         * 
        */
        MusicBox mbox2 = new MusicBox("A12BC34", 'N', "Sunshine", "Bright", 
        "Journey to the West", "Pop", "Sunshine Records", "Morning Glory");

        System.out.println("Now playing the song");
        mbox2.playSong(mbox2.getSongID(), mbox2.getPremiumSong(), 1);
        System.out.println("Song ended");
        System.out.println(" ");

    }
}