package abstaraction;

public interface Bicyle {
    float rateOfInterest();
}
    class SBI implements Bicyle{
        public float rateOfInterest(){return 9.15f;}
    }
    class PNB implements Bicyle{
        public float rateOfInterest(){return 9.7f;}
    }
    class TestInterface2{
        public static void main(String[] args){
            Bicyle b=new SBI();
            System.out.println("ROI: "+b.rateOfInterest());
        }}
