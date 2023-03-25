package LearnJAVA.OOP_JAVA.NhapxuatThongtinxe;

public class Vehicle {
    private int maXe;
    private int dungTich;
    private double triGia;
    private String chuXe;
    private String moTa;
    
    
    public Vehicle() {
    }
    public Vehicle(int maXe, int dungTich, int triGia, String chuXe, String moTa) {
        this.maXe = maXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
        this.chuXe = chuXe;
        this.moTa = moTa;
    }
    public int getMaXe() {
        return maXe;
    }
    public void setMaXe(int maXe) {
        this.maXe = maXe;
    }
    public int getDungTich() {
        return dungTich;
    }
    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }
    public double getTriGia() {
        return triGia;
    }
    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }
    public String getChuXe() {
        return chuXe;
    }
    public void setChuXe(String chuXe) {
        this.chuXe = chuXe;
    }
    public String getMoTa() {
        return moTa;
    }
    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    double thue;
    public double tinhThue(){
        if(dungTich < 100){
            thue = triGia*(1/100);
        }else if(dungTich >= 100 && dungTich < 200){
            thue = triGia*(3/100);
        }else{
            thue = triGia*(5%100);
        }
        return thue;
    }
    @Override
    public String toString() {
        return maXe + "-"+chuXe + "-"+dungTich + "-"+triGia + "-"+moTa;
    }
 
    void inThue(){
        System.out.printf("%5d %-20s %5d %10.2f %10s %8.5f \n ",maXe,dungTich,triGia,chuXe,moTa,tinhThue());
    }
    
}
