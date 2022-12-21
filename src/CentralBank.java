public class CentralBank {
    int getRateOfInterest(){
        return 0;
    }
}
class BOC extends CentralBank{
    @Override
    int getRateOfInterest() {
        return 20;
    }
}
class NSB extends CentralBank{
    @Override
    int getRateOfInterest() {
        return 23;
    }
}
class HNB extends CentralBank{
    @Override
    int getRateOfInterest() {
        return 24;
    }
}
class test{
    public static void main(String[] args) {
        BOC a=new BOC();
        CentralBank b=new NSB();
        HNB c=new HNB();
        System.out.println("BOC rate: "+a.getRateOfInterest()+"%");
        System.out.println("BOC rate: "+b.getRateOfInterest()+"%");
        System.out.println("BOC rate: "+c.getRateOfInterest()+"%");

    }
}
