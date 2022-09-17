package sesson1;

public class Triangle {
    int canh1;
    int canh2;
    int canh3;

    public Triangle(){
        System.out.println("chay thu cai cc na`y");
    }

    public int getCanh1(){
        return canh1;
    }
    public void setCanh1(int canh1){
        this.canh1 = canh1;
    }

    public int getCanh2() {
        return canh2;
    }

    public void setCanh2(int canh2) {
        this.canh2 = canh2;
    }

    public int getCanh3() {
        return canh3;
    }

    public void setCanh3(int canh3) {
        this.canh3 = canh3;
    }

    public boolean ktTamGiac(){
        return canh1+canh2 > canh3 && canh1+canh3 >canh2 && canh2 +canh3 >canh1 ;
    }
    public int chuVi(){
        if(!ktTamGiac()) return 0;
        return canh1+canh2+canh3;
    }
    public double dienTich(){
        if(!ktTamGiac()) return 0;
        double cv2 = chuVi()/2.00;
        return  Math.sqrt(cv2*(cv2-canh1)*(cv2-canh2)*(cv2-canh3));
    }
}
