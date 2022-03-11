package dziedziczenie;

import Kolekcje.Car;
import abstrakcja.AbstraktRodzic;
import abstrakcja.Abstraktosoba;

import java.util.ArrayList;
import java.util.List;

public class Run {

    public static void main(String[] args) {
//        Osoba osoba = new Osoba();
////        Osoba osoba1 = new Osoba(23);
//
//        Dziecko brajanek = new Dziecko("uczeń");
//        Dziecko jessica = new Dziecko("uczeń");
//
//        Rodzic grazyna = new Rodzic("deweloper");
//        Osoba janusz = new Rodzic("deweloper");
//
//        Osoba osoby[] = new Osoba[2];
//        osoby[0] = grazyna;
//        osoby[1] = brajanek;
//
//        for (Osoba osoba1 : osoby) {
//            System.out.println(osoba1.myActivity("deweloper"));
//        }
//
////        Abstraktosoba abstractosoba = new Abstraktosoba();
//        Abstraktosoba abstractosoba2 = new AbstraktRodzic();


//        Car bmw = new Car();

        List<Car> cars = new ArrayList<>();

        cars.add(new Car(2000, "Red", "Mazda"));
        cars.add(new Car(2001, "Red", "Toyota"));
        cars.add(new Car(2002, "Black", "Renault"));
        cars.add(new Car(2002, "Blue", "Toyota"));
        cars.add(new Car(2002, "Red", "Toyota"));
        cars.add(new Car(2003, "Black", "Renault"));
        cars.add(new Car(2004, "Red", "Toyota"));
        cars.add(new Car(2005, "Red", "Mazda"));
        cars.add(new Car(2005, "Red", "Toyota"));
        cars.add(new Car(2005, "Blue", "Toyota"));
        cars.add(new Car(2012, "Black", "Renault"));
        cars.add(new Car(2013, "Red", "Toyota"));
        cars.add(new Car(2013, "Red", "Mazda"));
        cars.add(new Car(2013, "Black", "Toyota"));
        cars.add(new Car(2014, "Red", "BMW"));
        cars.add(new Car(2015, "Blue", "Mazda"));
        cars.add(new Car(2015, "Red", "Toyota"));
        cars.add(new Car(2016, "Black", "Toyota"));
        cars.add(new Car(2017, "Red", "Toyota"));
        cars.add(new Car(2017, "Blue", "BMW"));
        cars.add(new Car(2018, "Red", "BMW"));
        cars.add(new Car(2019, "Red", "BMW"));
        cars.add(new Car(2020, "Blue", "Mazda"));


        System.out.println(cars.size());
        //pokaż jaka jest liczba toyot starszych niz 2015 o kolorze "red"
//arrow antypattern

        int count = 0;

        for (Car car : cars) {
            if (car.getProducent().equals("Toyota")){
                if (car.getColor().equals("Red")){
                    if (car.getYear()<2015){
                        count++;
                    }
                }
            }

        }

        System.out.println(count);

    }


}
