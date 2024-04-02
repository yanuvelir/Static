import javax.xml.transform.Result;

public class Main {

    public  static void main(String[] args){

//        //c1.mk
//        System.out.println(c1.getMake() +" "+ c1.getModel());
//        System.out.println("*Static*");
//
//        Car.amount = 1;
        System.out.println(Car.amount);
        String mk =  "Opel", md = "CorsaCorsaCorsa";
        if (Car.ifItPossibleToCreate(mk, md)){
            Car c2 = new Car(mk, md);
        } else {
            System.out.println("When model length name more than 10 chars - is not possible to create record");
        }

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