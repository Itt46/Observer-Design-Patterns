/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ittak
 */
class ScoreBoard implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String score;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String score) {
        for (Observer observer : observers) {
            observer.update(score);
        }
    }

    public void setScore(String score) {
        this.score = score;
        notifyObservers(score);
    }
}
