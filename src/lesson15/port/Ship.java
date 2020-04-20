package lesson15.port;

import java.util.ArrayList;
import java.util.List;

public class Ship implements Chargeble {
    private int maxValueOfBoxes;
    private List<Box> stock;

    public Ship(int maxValueOfBoxes) {
        this.maxValueOfBoxes = maxValueOfBoxes;
        stock=new ArrayList<>(maxValueOfBoxes);
    }

//Разгрузка в порт
    @Override
    public boolean disChargeBoxes(int numOfBoxes, Port port) {
        List<Box> portStock = port.getStock();
        List<Box> downloader = new ArrayList<>(numOfBoxes);
        if(portStock.size()+numOfBoxes<port.getMaxValueOfBoxes()&&stock.size()>numOfBoxes){
            for (int i = 0; i < numOfBoxes ; i++) {
                downloader.add(stock.get(i));
            }
            portStock.addAll(downloader);
            stock.removeAll(downloader);
            port.setStock(portStock);
        }
        return true;
    }

    // Загрузка в порт
    @Override
    public boolean chargeBoxes(int numOfBoxes, Port port) {
        List<Box> portStock = port.getStock();
        List<Box> downloader = new ArrayList<>(numOfBoxes);
        if(stock.size()+numOfBoxes<maxValueOfBoxes && portStock.size()>numOfBoxes){
            for (int i = 0; i < numOfBoxes ; i++) {
                downloader.add(portStock.get(i));
            }
            stock.addAll(downloader);
            portStock.removeAll(downloader);
            port.setStock(portStock);
        }
        return true;
    }

}
