package creational.prototype;

import java.util.List;

public class CityScape {
    public static void main(String[] args) {
        BuildingType house = new BuildingType("House");
        Building h1 = new Building(21, house);
        Building h2 = h1.clone(); //new Building(21, house);
        Building h3 = h1.clone();//new Building(21, house);
        Building h4 = h1.clone();//new Building(21, house);
        Building h5 = h1.clone();//new Building(21, house);
        house.setType("Single family");

        BuildingType skyscraper = new BuildingType("skyscraper");
        Building ss1 = new Building(86, skyscraper);
        Building ss2 = ss1.clone();//new Building(86, skyscraper);
        Building ss3 = ss1.clone();//new Building(86, skyscraper);
        Building ss4 = ss1.clone();//new Building(86, skyscraper);
        Building ss5 = ss1.clone();//new Building(86, skyscraper);

        List<Graphic> order = List.of(h1,h2,h3,h4,h5,ss1,ss2,ss3,ss4,ss5);

        createCityScape(order);

    }

    private static void createCityScape(List<Graphic> order) {
        System.out.println("constructing city:");
        order.forEach(System.out:: println);
    }
}
