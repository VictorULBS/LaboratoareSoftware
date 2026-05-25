package ro.ulbs.proiectaresoftware.lab11;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {
    List<Observer> observers;
    private String channelName;

    public YouTubeChannel(String channelName) {
        this.channelName = channelName;
        observers = new ArrayList<>();
    }

    public void uploadVideo(String title) {
        System.out.println("{"+ channelName + "} uploaded a new video: " + title);
        notifyObservers(title);
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        observers.forEach(observer -> observer.update(message));
    }
}