package assignment3;

public class Main {
    public static void main(String[] args){
        Customer c = new Customer();
        DomesticCustomer d = new DomesticCustomer("CHN", "Cao", "Nam", "24/09/2002", DomesticCustomer.Type.DOMESTIC, 2002,300, 1500 );
        ForeignCustomer f = new ForeignCustomer("NLD", "Linh", "Dan", "08/09/1999", 1999,300, "US" );
        System.out.println(d.total());
        System.out.println(f.total());


    }
}
