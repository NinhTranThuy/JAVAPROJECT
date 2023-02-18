 public class CONGNHAN {
    public static float lcd;
    private float hsl;
    private String hoten;

    public CONGNHAN(){
        
    }
    public void setHsl(float h){
        hsl = h;
    }

    public float getHsl(){
       return hsl;
    }

    public void setHoten(String ht){
        hoten = ht;
    }

    public String getHoten(){
        return hoten;
    } 

    public float tinhLuong(){
        return lcd * hsl;
    }    
}
