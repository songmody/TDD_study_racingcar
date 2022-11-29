package racingcar.model;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class SplitCar {
    private static final String SPLIT_REGEX = ",";
    private static final Pattern SPLIT_PATTERN = Pattern.compile(SPLIT_REGEX);
    private static final List<Car> carList = new ArrayList<>();

    public static List<Car> splitAndCreate(String participateCars) {
        for (String carName : splitCars(participateCars)) {
            carList.add(new Car(carName));
        }
        return carList;
    }

    private static String[] splitCars(String participateCars) {
        return SPLIT_PATTERN.split(participateCars);
    }
}
