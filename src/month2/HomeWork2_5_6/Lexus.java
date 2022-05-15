package month2.HomeWork2_5_6;

public class Lexus {
    public static void main(String[] args) {
        Brand brand = new Brand();
        brand.setName("Lexus");
        brand.setAge(1983);
        brand.setCreator("Eiji Toyoda");
        brand.setFirstCar("Ls400");
        brand.setBrand(brand);

        FactoryCar factoryCar = new FactoryCar();
        factoryCar.setName("Lexus");
        factoryCar.setAge(1989);
        factoryCar.setCreator("Eiji Toyoda");
        factoryCar.setFirstCar("Ls400");
        factoryCar.setAmount(718715);
        factoryCar.setCountry(90);
        factoryCar.setModel1("Lx");
        factoryCar.setModel2("Gx");
        factoryCar.setModel3("Rx");
        factoryCar.setFactoryCar(factoryCar);

        LexusCar lexusCar = new LexusCar();
        lexusCar.setName("Lexus");
        lexusCar.setAge(1983);
        lexusCar.setCreator("Eiji Toyoda");
        lexusCar.setFirstCar("Ls400");
        lexusCar.setAmount(718715);
        lexusCar.setCountry(90);
        lexusCar.setModel1("Lx");
        lexusCar.setModel2("Gx");
        lexusCar.setModel3("Rx");
        lexusCar.setLxAge(1998);
        lexusCar.setGxAge(2002);
        lexusCar.setRxAge(1998);
        lexusCar.setLexusCar(lexusCar);



    }
}
