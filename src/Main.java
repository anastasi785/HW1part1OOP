public class Main {
    public static void main(String[] args) {
        Car lada=new Car();
        lada.brand="Lada";
        lada.model="Granta";
        lada.productionCountry="Россия";
        lada.color="желтый";
        lada.engineVolume=1.7;
        lada.productionYear=2015;
        lada.information();

        Car audi=new Car();
        audi.brand="Audi";
        audi.model="50 L TDL quatro";
        audi.productionCountry="Германия";
        audi.color="черный";
        audi.engineVolume=3.0;
        audi.productionYear=2020;
        audi.information();

        Car bmw=new Car();
        bmw.brand="BMW";
        bmw.model="Z8";
        bmw.productionCountry="Германия";
        bmw.color="черный";
        bmw.engineVolume=3.0;
        bmw.productionYear=2021;
        bmw.information();

        Car kia=new Car();
        kia.brand="Kia";
        kia.model="Sportage";
        kia.productionCountry="Южная Корея";
        kia.color="красный";
        kia.engineVolume=2.4;
        kia.productionYear=2018;
        kia.information();

        Car hunday=new Car();
        hunday.brand="Hunday";
        hunday.model="Avante";
        hunday.productionCountry="Южная Корея";
        hunday.color="оранжевый";
        hunday.engineVolume=1.6;
        hunday.productionYear=2016;
        hunday.information();
    }
}