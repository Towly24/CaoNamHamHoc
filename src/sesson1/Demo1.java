package sesson1;

public class Demo1 {
    public static void main(String[] args){
        System.out.println("Hello World!");
        int x = 10;
        System.out.println("x = "+x);
        String str = "Hello world";
        if(x>5){
            System.out.println(str);
        }else{
            System.out.println("not found");
        }
        for(int i=0;i<10;i++){
            System.out.println("i= "+i);
        }
        Car c = new Car();
        Car c2 = new Car();
        c.brand = "Toyota";
        System.out.println(c.brand + c2.brand);
        Car.color = "red";
        c.showInto();
        c2.showInto();
        System.out.println(Car.color);
        Bike b = new Bike();
        b.run();
        System.out.println(Car.color);

        Triangle t = new Triangle();
        t.setCanh1(4);
        t.setCanh2(5);
        t.setCanh3(6);

        System.out.println("Chu vi: " + t.chuVi());
        System.out.println("Chu vi: " + t.dienTich());
    }
}
