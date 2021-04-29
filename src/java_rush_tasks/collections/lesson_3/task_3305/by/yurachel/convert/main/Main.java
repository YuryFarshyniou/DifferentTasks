package java_rush_tasks.collections.lesson_3.task_3305.by.yurachel.convert.main;

import com.fasterxml.jackson.databind.ObjectMapper;
import java_rush_tasks.collections.lesson_3.task_3305.by.yurachel.convert.entity.*;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ParkingLot parkingLot = new ParkingLot("Super ParkingLot", "Kyiv");
        RacingBike racingBike = new RacingBike("Simba", "Peter", 2);
        MotorBike motorbike = new MotorBike("Manny");
        Car car = new Car();
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(racingBike);
        vehicles.add(motorbike);
        vehicles.add(car);
        parkingLot.setVehicles(vehicles);
        convertToJson(parkingLot);
    }

    public static void convertToJson(ParkingLot parkingLot) throws IOException {
        StringWriter writer = new StringWriter();
        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter().writeValue(writer, parkingLot);
        System.out.println(writer.toString());
    }
}
