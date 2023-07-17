package alex.klimchuk.adapter;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
public class App {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "song.mp3");
        audioPlayer.play("vlc", "song.vlc");
        audioPlayer.play("mp4", "song.mp4");
        audioPlayer.play("avi", "song.avi");
    }
}
