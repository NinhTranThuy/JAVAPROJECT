public class DOANTHANG {
    DIEM A = new DIEM();
    DIEM B = new DIEM();

    public DOANTHANG(){ // này là khởi tạo k tham số này. NHÌN NÀY
        A = 0;
        B = 0;
        //cách dung đuây, có thể dùng contructor k tham số để khởi tạo giá trị BAN ĐẦU / MẶC ĐỊNH cho biến a,b
        // khi mà trong main í, nếu mà mình gọi DOANTHANG d = new DOANTHANG() Í, thì cái DOANTHANG() ở trong câu DOANTHANG d = new DOANTHANG()
        // CHÍNH LÀ CONSTRUCTOR này nàyyyyyy đóa
        // thì auto A = 0, B = 0; đóaaaaaaa lô 
        /* à hiểu  */
    }
    public DOANTHANG(DIEM a, DIEM b){ // đây là khởi tạo có tham số nè. cách sử dụng contructor này là đây
        // trong main nhớ, mình có thể gán giá trị thẳng cho A và B ntn: 
        // DOANTHANG(4.7,1.2)
        // THÌ LÚC đó A và B ở bên dưới này này, sẽ mang giá trị là A = 4.7, B = 1,2 
        // dùng cách ở trên thì có thể k gì nhề, òemmmmm, :))) k cần set maybe :)))đi
        /* ơ thế sao ở đây lại có cả  hà  tham  ssoo */

        this.A = a;
        this.B = b;
    }

    public void nhapDT(){
        A.nhap();
        B.nhap();
    }

    public void xuatDT(){
        System.out.printf("%5.1f",A.getX(),A.getY());
        System.out.printf("%5.1f",B.getX(),B.getY());
        System.out.printf("%5.1f",calculateLength());
    }
    public float calculateLength(){
        return (float)(Math.sqrt(Math.pow((B.getX()-A.getX()), 2)+Math.pow((B.getY()-A.getY()), 2)));
    }
}
