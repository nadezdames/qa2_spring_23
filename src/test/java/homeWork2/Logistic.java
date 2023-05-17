package homeWork2;

import org.junit.jupiter.api.Test;

// Создать транспорт (3 вида) ;
// Создать маршрут (3 вида) ;
// Установить объем бака у каждого транспорта;
// Установить, сколько литров топлива уходит на 100 км;
// Задача: ответить на вопрос, сможет ли ТРАНСПОРТ проехать РАССТОЯНИЕ на ОДНОМ ПОЛНОМ ТОПЛИВНОМ БАКЕ

public class Logistic {

    private String translateBoolean(boolean trueOrFalse) {
        String answer = trueOrFalse ? "Yes" : "No";
        return answer;
    }

    @Test
    public void myTransport() {
        Transport firstTransport = new Transport();
        firstTransport.setTransportType("Airline"); // Тип транспорта
        firstTransport.setTransportColor("Blue"); // Цвет (не обязательно)
        firstTransport.setFuelTankVolume(4000); // Объем бака в литрах
        firstTransport.setFuelConsumptionPerHundredKm(200); // Столько литров топлива уходит на 100 км
        firstTransport.setDistance((firstTransport.getFuelTankVolume() * 100) / firstTransport.getFuelConsumptionPerHundredKm()); // Столько км может проехать на полном баке

//        System.out.println(firstTransport.getDistance()); // Покажет сколько КМ может проехать на полном баке

        Transport secondTransport = new Transport();
        secondTransport.setTransportType("Submarine");
        secondTransport.setTransportColor("Yellow");
        secondTransport.setFuelTankVolume(1900);
        secondTransport.setFuelConsumptionPerHundredKm(90);
        secondTransport.setDistance((secondTransport.getFuelTankVolume() * 100) / secondTransport.getFuelConsumptionPerHundredKm());

        Transport thirdTransport = new Transport();
        thirdTransport.setTransportType("Car");
        thirdTransport.setTransportColor("Pink");
        thirdTransport.setFuelTankVolume(60);
        thirdTransport.setFuelConsumptionPerHundredKm(10);
        thirdTransport.setDistance((thirdTransport.getFuelTankVolume() * 100) / thirdTransport.getFuelConsumptionPerHundredKm());

        Route firstRoute = new Route();
        firstRoute.setStartingPoint("Milano");
        firstRoute.setFinalDestination("Makhachkala");
        firstRoute.setDistance(4166);

        Route secondRoute = new Route();
        secondRoute.setStartingPoint("Stockholm");
        secondRoute.setFinalDestination("Wien");
        secondRoute.setDistance(1728);

        Route thirdRoute = new Route();
        thirdRoute.setStartingPoint("Riga");
        thirdRoute.setFinalDestination("Kekava");
        thirdRoute.setDistance(20.3);

        boolean onePointOneAnswer = firstTransport.getDistance() >= firstRoute.getDistance();
        boolean onePointTwoAnswer = firstTransport.getDistance() >= secondRoute.getDistance();
        boolean onePointThreeAnswer = firstTransport.getDistance() >= thirdRoute.getDistance();

        boolean twoPointOneAnswer = secondTransport.getDistance() >= firstRoute.getDistance();
        boolean twoPointTwoAnswer = secondTransport.getDistance() >= secondRoute.getDistance();
        boolean twoPointThreeAnswer = secondTransport.getDistance() >= thirdRoute.getDistance();

        boolean threePointOneAnswer = thirdTransport.getDistance() >= firstRoute.getDistance();
        boolean threePointTwoAnswer = thirdTransport.getDistance() >= secondRoute.getDistance();
        boolean threePointThreeAnswer = thirdTransport.getDistance() >= thirdRoute.getDistance();

        System.out.println("1.1 Can " + firstTransport.getTransportColor() + " " + firstTransport.getTransportType() + " make a distance from " + firstRoute.getStartingPoint() + " to " + firstRoute.getFinalDestination() + " on ONE fuel tank? ");
        System.out.println("Answer: " + translateBoolean(onePointOneAnswer));
        System.out.println(" ");

        System.out.println("1.2 Can " + firstTransport.getTransportColor() + " " + firstTransport.getTransportType() + " make a distance from " + secondRoute.getStartingPoint() + " to " + secondRoute.getFinalDestination() + " on ONE fuel tank? ");
        System.out.println("Answer: " + onePointTwoAnswer);
        System.out.println(" ");

        System.out.println("1.3 Can " + firstTransport.getTransportColor() + " " + firstTransport.getTransportType() + " make a distance from " + thirdRoute.getStartingPoint() + " to " + thirdRoute.getFinalDestination() + " on ONE fuel tank? ");
        System.out.println("Answer: " + onePointThreeAnswer);

        System.out.println("*********************************************************************");
        System.out.println("2.1 Can " + secondTransport.getTransportColor() + " " + secondTransport.getTransportType() + " make a distance from " + firstRoute.getStartingPoint() + " to " + firstRoute.getFinalDestination() + " on ONE fuel tank? ");
        System.out.println("Answer: " + twoPointOneAnswer);
        System.out.println(" ");

        System.out.println("2.2 Can " + secondTransport.getTransportColor() + " " + secondTransport.getTransportType() + " make a distance from " + secondRoute.getStartingPoint() + " to " + secondRoute.getFinalDestination() + " on ONE fuel tank? ");
        System.out.println("Answer: " + twoPointTwoAnswer);
        System.out.println(" ");

        System.out.println("2.3 Can " + secondTransport.getTransportColor() + " " + secondTransport.getTransportType() + " make a distance from " + thirdRoute.getStartingPoint() + " to " + thirdRoute.getFinalDestination() + " on ONE fuel tank? ");
        System.out.println("Answer: " + twoPointThreeAnswer);

        System.out.println("*********************************************************************");
        System.out.println("3.1 Can " + thirdTransport.getTransportColor() + " " + thirdTransport.getTransportType() + " make a distance from " + firstRoute.getStartingPoint() + " to " + firstRoute.getFinalDestination() + " on ONE fuel tank? ");
        System.out.println("Answer: " + threePointOneAnswer);
        System.out.println(" ");

        System.out.println("3.2 Can " + thirdTransport.getTransportColor() + " " + thirdTransport.getTransportType() + " make a distance from " + secondRoute.getStartingPoint() + " to " + secondRoute.getFinalDestination() + " on ONE fuel tank? ");
        System.out.println("Answer: " + threePointTwoAnswer);
        System.out.println(" ");

        System.out.println("3.3 Can " + thirdTransport.getTransportColor() + " " + thirdTransport.getTransportType() + " make a distance from " + thirdRoute.getStartingPoint() + " to " + thirdRoute.getFinalDestination() + " on ONE fuel tank? ");
        System.out.println("Answer: " + threePointThreeAnswer);


    }


}
