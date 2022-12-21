public class Abc {
    public void display(){
        System.out.println("Method of Parent class");
    }
}
class Efg extends Abc{
    @Override
    public void display() {
        System.out.println("Method of Child class");
    }
    public void newMethod(){
        System.out.println("New method of child class");
    }
}
class TestMethodOverriding{
    public static void main(String[] args) {
        Abc abc=new Abc();
        abc.display();

        Abc abc1=new Efg();
        abc1.display();

        Efg efg=new Efg();
        efg.newMethod();
    }
}
