package ua.com.anton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static ua.com.anton.Music_.ROCK;

public class MusicPlayer {

    private String name;
    private  int volume;
    private List<Music> genreList;
    @Autowired
    public MusicPlayer(List<Music> list){
        this.genreList = list;
    }

    public void playMusic(){
        Random random = new Random();
        int i = random.nextInt(3);
        int j = random.nextInt(3);
            System.out.println("Playing: "+ this.genreList.get(i).getSongs().get(j));
    }
}
