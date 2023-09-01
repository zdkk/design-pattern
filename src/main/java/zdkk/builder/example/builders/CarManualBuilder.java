package zdkk.builder.example.builders;

import zdkk.builder.example.cars.CarType;
import zdkk.builder.example.cars.Manual;
import zdkk.builder.example.components.Engine;
import zdkk.builder.example.components.GPSNavigator;
import zdkk.builder.example.components.Transmission;
import zdkk.builder.example.components.TripComputer;

/**
 * @author zdkk
 * @create 2023-09-01 17:36
 */
// 汽车手册生成器
public class CarManualBuilder implements Builder {
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult() {
        return new Manual(carType, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
