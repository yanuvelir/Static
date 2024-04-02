public class Car {

    private String make;
    private String model;

    static int amount = 0;

    public Car(String mk, String md){
        this.make = mk;
        this.model = md;
        amount++;
        System.out.println("item " + mk + " " + md +" is created");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
