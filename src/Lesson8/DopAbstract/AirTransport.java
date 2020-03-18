package Lesson8.DopAbstract;

public class AirTransport extends Transport {
    protected int wingsSpan; // м
    protected int spaceForTakeoff;

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

    @Override
    public String toString() {
        return super.toString()+"AirTransport{" +
                "wingsSpan=" + wingsSpan +
                ", spaceForTakeoff=" + spaceForTakeoff +
                '}';
    }
}
