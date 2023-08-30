package ch.plebsapps.objectorientierung;

public class TV {
    private boolean isOn;
    private int channel;

    public TV(){
    }

    public TV(TV tv){
        this.setOn(tv.isOn);
        this.setChannel(tv.getChannel());
    }

    public boolean isOn() {
        return isOn;
    }

    public TV setOn(boolean on) {
        isOn = on;
        return this;
    }

    public int getChannel() {
        return channel;
    }

    public TV setChannel(int channel) {
        this.channel = channel;
        return this;
    }
}
