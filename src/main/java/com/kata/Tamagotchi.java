package com.kata;
public class Tamagotchi {
    private int mood = 4;
    private int hunger = 4;
    private int energy = 4;
    private int fullness = 4;

    public void play() {
        if (energy !=0){
            energy -= 1;
            hunger += 1;
            mood += 1;
        }else{
           System.out.println("your tamagotchi is too sleepy, let your tamagotchi sleep"); 
        }
    }
    
    public void feed() {
        if (hunger>1){
            hunger -= 2;
            energy += 1;
            fullness +=1;
        }else{
            System.out.println("your tamagotchi is not hungry"); 
        }
    }
    
    public void sleep() {
        if (hunger!=0){
            energy += 2;
            hunger += 1;
        }else{
            System.out.println("your tamagotchi is too hungry to sleep"); 
        }
    }
    public void poop() {
        fullness -=3;
        if (fullness <0){
            fullness =0;
        }
    }
    public void timePasses() {
        if (energy>0){
            energy -= 1;
        }
        if (mood>0){
            mood -= 1;
        }
        if (hunger>0){  
            hunger += 1;
        }
    }
    public void checkStats() {
        System.out.println("Current stats:");
        System.out.println("Mood: " + getMoodStat());
        System.out.println("Hunger: " + hunger);
        System.out.println("Energy: " + getEnergyStat());
        System.out.println("Fullness: " + fullness);
    }
    
    public String getMoodStat() {
        if (mood > 8) {
            return ":-)";
        } else if (mood < 2) {
            return "ఠ_ఠ";
        } else {
            return ":-|";
        }
    }
     public String getEnergyStat() {
        if (energy < 3) {
            return "(-_-)";
        } else if (energy == 0) {
            return "(-_-) zZZ";
        } else {
            return ":-|";
        }
    }
    public int getHungerStat() {
        return hunger;
    }
    public int getFullnessStat() {
        return fullness;
    }
    public void setStats(int newMood, int newHunger, int newEnergy, int newFullness){
        mood=newMood;
        hunger= newHunger;
        energy=newEnergy;
        fullness=newFullness;
    }
    


}
