public class SmartTv {
    boolean on = false;
    int channel = 1;
    int volume = 25;

    public void turnOn(){
        on = true;
    }

    public void turnOff(){
        on = false;
    }

    public void volumeUp(){
        if (volume < 100) {
            volume ++;
        }
    }

    public void volumeDown(){
        if (volume > 0) {
            volume --;
        }
    }

    public void changeChannel(int newChannel){
        channel = newChannel;
    }

}
