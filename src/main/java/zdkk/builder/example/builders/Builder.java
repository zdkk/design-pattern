package zdkk.builder.example.builders;

import zdkk.builder.example.cars.CarType;
import zdkk.builder.example.components.Engine;
import zdkk.builder.example.components.GPSNavigator;
import zdkk.builder.example.components.Transmission;
import zdkk.builder.example.components.TripComputer;

/**
 * @author zdkk
 * @create 2023-09-01 17:29
 */
// 建造者接口：定义配置一个产品的所有可能方式
public interface Builder {
    void setCarType(CarType carType);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
