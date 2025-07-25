package Ques_41_to_50;

//Interface Implementation

interface Playable {
    void play();
    void pause();
}

class MusicPlayer implements Playable {
    public void play() {
        System.out.println("Music playing...");
    }
    
    public void pause() {
        System.out.println("Music paused");
    }
}

public class ques41 {
    public static void main(String[] args) {
        Playable player = new MusicPlayer();
        player.play();
        player.pause();
    }
}
