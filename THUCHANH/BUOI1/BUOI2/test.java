public class test {
    public static void main(String[] args) {
        taikhoan tkA = new taikhoan ();
        taikhoan tkB = new taikhoan ();
        test t = new test();

        tkA = t.enterInfo();
        tkB = t.enterInfo();

        System.out.println("THONG TIN TAI KHOAN A: "+ tkA.toString());
        System.out.println("THONG TIN TAI KHOAN B:"+ tkB.toString());

    }
}
