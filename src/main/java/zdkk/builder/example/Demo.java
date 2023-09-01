package zdkk.builder.example;

import zdkk.builder.example.builders.CarBuilder;
import zdkk.builder.example.builders.CarManualBuilder;
import zdkk.builder.example.cars.Car;
import zdkk.builder.example.cars.Manual;
import zdkk.builder.example.director.Director;

/**
 * @author zdkk
 * @create 2023-09-01 17:11
 */
public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        // Director从客户端获取具体的构建器对象(应用程序代码)。这是因为应用程序更了解使用哪个构建器来获得特定的产品。
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
