/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author ittak
 */
class ScoreDisplay implements Observer {
    @Override
    public void update(String score) {
        System.out.println("live result: " + score);
    }
}
