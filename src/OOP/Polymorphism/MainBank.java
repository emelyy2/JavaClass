package OOP.Polymorphism;

public class MainBank {

    public static void main(String[] args) {

        FederalReserveBank bank = new FederalReserveBank();
        int rate = bank.interestRate();
        System.out.println("FederalReserveBank's Rate is: " + rate);

        bank = new ChaseBank();
        rate = bank.interestRate();
        System.out.println("Chase's Rate is: " + rate);

        bank = new BankOfAmerica();
        rate = bank.interestRate();
        System.out.println("Bank of America's Rate is: " + rate);

        bank = new WellsFargo();
        rate = bank.interestRate();
        System.out.println("Wells Fargo's Rate is: " + rate);

        bank = new CapitalOne();
        rate = bank.interestRate();
        System.out.println("Capital One's Rate is: " + rate);

    }
}
