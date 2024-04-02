import javax.xml.transform.Result;

public class Main {

    public  static void main(String[] args){

        Car c1 = new Car("Honda", "Accord");

        //c1.mk
        System.out.println(c1.getMake() +" "+ c1.getModel());
        System.out.println("*Static*");

        Car.amount = 1;
        System.out.println(Car.amount);

    }
}

//    var n1 = 123;
//    int Result =  n1 %10;
//    var n2 = Result ++;
//        System.out.println("* " + Result + " *");