import java.util.Scanner;
import java.util.*;

public class GIAOVIEN extends NHANSU{
    private String monDay;
    private float hsl;
    public String getMonDay() {
		return monDay;
	}
	public void setMonDay(String monDay) {
		this.monDay = monDay;
	}
	public float getHsl() {
		return hsl;
	}
	public void setHsl(float hsl) {
		this.hsl = hsl;
	}

    public void nhapGV(){
        Scanner sc = new Scanner(System.in);
        super.nhapNS();
        System.out.print("Nhap MON DAY: ");
        setMonDay(sc.nextLine());
        System.out.printf("Nhap HSL: ");
        setHsl(sc.nextFloat());
    }
    public void xuatGV(){
        super.inNS();
        System.out.printf("%10s", getMonDay());
        System.out.printf("%5.1f", getHsl());
    }
}
