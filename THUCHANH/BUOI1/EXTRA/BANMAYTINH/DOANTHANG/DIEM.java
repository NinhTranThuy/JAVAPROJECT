import java.util.Scanner;

public class DIEM {
    private float x,y;
    public DIEM(){
        x=0;
        y=0;
    }
    public DIEM(float xx, float yy){
        this.x=xx;
        this.y=yy;
    }

    public float getX(){
        return x;
    }
    public void setX(float x){
        this.x = x;
    }
    public float getY(){
        return y;
    }
    public void setY(float y){
        this.y = y;
    }
    
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap diem x: ");
        x=sc.nextFloat();
        System.out.print("Nhap diem y: ");
        y=sc.nextFloat();
    }
    public void xuat(){
        System.out.printf("\n%7.2f",x);
        System.out.printf("%7.2",y);
    }
}
