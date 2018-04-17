package com.techelevator;

public class Television {
private boolean isOn = false;
private int currentChannel = 3;
private int currentVolume = 2;

    public boolean isOn() {
        return isOn;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
    public void turnOff(){
        this.isOn = false;
    }
    public void turnOn(){
        this.isOn = true;
        this.currentChannel = 3;
        this.currentVolume = 2;
    }
    public void changeChannel(int newChannel){
       if(isOn && newChannel >= 3 && newChannel <= 18 )
        this.currentChannel = newChannel;
    }
    public void channelUp(){
        if(isOn && (currentChannel + 1) > 18){
            this.currentChannel = 3;
        }else if(isOn) {
            this.currentChannel++;
        }
    }
    public void channelDown(){
        if(isOn && (currentChannel - 1) < 3) {
            this.currentChannel = 18;
        }else if(isOn){
            this.currentChannel--;
        }
    }
    public void raiseVolume(){
        if(isOn && currentVolume <= 10)
        this.currentVolume++;
    }
    public void lowerVolume(){
        if(isOn && (currentVolume - 1) >= 0)
            this.currentVolume--;
    }
}
