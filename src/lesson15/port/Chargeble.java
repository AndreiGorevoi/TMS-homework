package lesson15.port;

import java.util.List;

public interface Chargeble {

    boolean disChargeBoxes(int numOfBoxes, Port port);
    boolean chargeBoxes(int numOfBoxes,Port port);
}
