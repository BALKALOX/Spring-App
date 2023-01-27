package ua.com.anton;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RapMusic implements Music{
    private List<String> songs = new ArrayList<String>();
    {
        songs.add("Loose yourself");
        songs.add("IN DA CLUB");
        songs.add("STEFANIA");
    }
    public String getSong() {
        return "Loose yourself";
    }
    public List<String> getSongs(){
        return songs;
    }
}
