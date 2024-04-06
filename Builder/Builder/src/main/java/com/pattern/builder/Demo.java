package com.pattern.builder;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        CatBuilder catBuilder = new CatBuilder();
        director.constructSportsCar(catBuilder);

        Car car = catBuilder.getResult();
        System.out.println("Car build:\n"+car.getCarType());

        CatManualBuilder manualBuilder = new CatManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n"+carManual.print());
    }
}
