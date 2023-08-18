package ClassesAndObjects;

public class Market {
   public String name;
   public String location;
   public int year;
   public double AveragePurchasing;

   public Market(){
   }

    public Market(String name, String location){
    }

    public Market(int year){
    }

    public Market(double AveragePurchasing){
    }

    public static void main(String[] args) {
        Market market = new Market();
        Market market1 = new Market("LatinMarket", "223 Baltimore");
        Market market2 = new Market(1998);
        Market market3 = new Market(30.5);
    }

}
