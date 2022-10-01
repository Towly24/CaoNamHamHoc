package session6;

public class Main {
    public static void main(String[] args){
        try {
            int x = 10;
            int y = 0;
            if(y == 0){
                throw new NullPointerException();
            }
            System.out.println(x + ":" + y + ":");
            int z = x/y;
            System.out.println(z);
        }
        catch (ArithmeticException ae){
            // ngoai le toan hoc
            System.out.println("Tính toán ngu vkl, học sinh mẫu giáo à");
        }
        catch (NullPointerException n){
            System.out.println("NULL...");
        }
        catch (Exception e){
            System.out.println(" Loi roi ngu vkl vay");
        }
        finally {
            // luc nao cung chay qua day

        }
    }
}
