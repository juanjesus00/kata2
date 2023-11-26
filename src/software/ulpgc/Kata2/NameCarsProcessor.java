package software.ulpgc.Kata2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NameCarsProcessor implements CarProcesor{

    @Override
    public Map<String, Integer> process(List<Cars> cars) {
        Map<String, Integer> result = new HashMap<>();
        for(Cars car : cars){
            String name = car.getName();
            result.put(name, result.getOrDefault(name, 0) + 1);
        }
        return result;
    }
}
