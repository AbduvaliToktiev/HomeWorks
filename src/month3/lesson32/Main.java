package month3.lesson32;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Stock> stocks = new ArrayList<>();
        Stock stock1 = new Stock();
        Stock stock2 = new Stock();
        stocks.add(stock1);
        stocks.add(stock2);
        vigruzka(stocks, new ArrayList<Product>());
        Stock stock3 = new Stock();
        stocks.add(stock3);
        vigruzka(stocks, new ArrayList<Product>());
    }

    public static void vigruzka(ArrayList<Stock> stocks, ArrayList<Product> products) {


        for (Stock stock : stocks) {
            ArrayList<Product> productsInStock = new ArrayList<>();
            ArrayList<Product> productsInUse = new ArrayList<>();
            for (Product p : products) {
                if (stock.getVolume() > p.getVolumeBox() && !productsInUse.contains(p)) {
                    productsInStock.add(p);
                    productsInUse.add(p);
                } else {
                    break;
                }
            }
            stock.setProducts(productsInStock);
            productsInStock = new ArrayList<>();
            productsInUse = new ArrayList<>();
        }
    }
}
