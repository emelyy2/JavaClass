package OOP.Encapsulation;

public class Car {

    private String model;
    private String make;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {

        if(model.equals("X7")){
            this.model = model;
        }else{
            this.model = "Invalid Model";
        }
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if(model.equals("BMW")) {
            this.make = make;
        }else{
            this.model = "Invalid make";
        }

    }

}
