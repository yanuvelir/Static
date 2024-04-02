import javax.xml.transform.Result;

public class Main {

    public  static void main(String[] args){

//        //c1.mk
//        System.out.println(c1.getMake() +" "+ c1.getModel());
//        System.out.println("*Static*");
//
//        Car.amount = 1;
        System.out.println(Car.amount);
        Car c1 = new Car("Honda", "Accord");
        Car c2 = new Car("Opel", "Corsa");
        Car c3 = new Car("Ford", "Bronco");
        addMoreCars();
        System.out.println(Car.amount);
    }

    public static void addMoreCars(){
        Car c4 = new Car("Mazda", "CX-5");
        Car c5 = new Car("Fiat", "500");
    }
}

//    var n1 = 123;
//    int Result =  n1 %10;
//    var n2 = Result ++;
//        System.out.println("* " + Result + " *");