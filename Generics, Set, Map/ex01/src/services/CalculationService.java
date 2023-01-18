package services;

import java.util.List;

public class CalculationService {

    public static <Type extends Comparable<Type>> Type max(List<Type> list) {
        Type max = list.get(0);
        
        for (Type element : list) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}
