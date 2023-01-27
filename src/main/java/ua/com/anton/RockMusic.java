package ua.com.anton;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class RockMusic implements Music{
    private List<String> songs = new ArrayList<String>();
    {
        songs.add("Highway to hell");
        songs.add("Skillet");
        songs.add("Smells like teen spirit");
    }
    public List<String> getSongs() {
        return songs;
    }
    public String getSong(){
        return "Highway to hell";
    }
}
