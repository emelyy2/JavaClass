package OOP.Abstraction;

public class TractorClass implements TractorEngine, TractorTire, TractorGlassCompany {

    void buildModelT23(){
        System.out.println("Building Model T23");
    }

    void getMainFrame(){
        System.out.println("Main Frame is set");
    }

    @Override
    public void engineSize(int size) {
        System.out.println("Getting Engine Size of: " + size);
    }

    @Override
    public void makeTractorTire() {
        System.out.println("Tractor Size");
    }

    @Override
    public int tireSize() {
        return 45;
    }

    @Override
    public int glassSize() {
        return 189;
    }

    @Override
    public String glassModel() {
        return "Model for T23";
    }

    public static void main(String[] args) {
        TractorClass t = new TractorClass();
        t.buildModelT23();
        t.getMainFrame();
        t.engineSize(40);
        t.makeTractorTire();
        t.tireSize();
        t.glassModel();
    }
}
