package Lesson8.DopAbstract;

public class AirTransport extends Transport {
    private int wingsSpan; // м

    public void setWingsSpan(int wingsSpan) {
        this.wingsSpan = wingsSpan;
    }

    public void setSpaceForTakeoff(int spaceForTakeoff) {
        this.spaceForTakeoff = spaceForTakeoff;
    }

    public int getWingsSpan() {
        return wingsSpan;
    }

    public int getSpaceForTakeoff() {
        return spaceForTakeoff;
    }

    private int spaceForTakeoff;
}
