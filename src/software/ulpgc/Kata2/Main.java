package software.ulpgc.Kata2;

import java.io.File;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CarLoader loader = new TsvFileCarsLoader(new File("CAR DETAILS FROM CAR DEKHO.csv"));
        List<Cars> cars = loader.load();
        Map<String, Integer> barchart = new NameCarsProcessor().process(cars);
        for(String key : barchart.keySet()){
            System.out.println(key + " = " + barchart.get(key));
        }
    }
}
