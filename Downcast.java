class Ui{
    public void show1(){
        System.out.println("in A");
    }

}
class Ti extends Ui{
    public void show2(){
        System.out.println("in T");
    }
}
public class Downcast {
    public static void main(String[] args) {
        Ui obj= new Ti();
        obj.show1();
        Ti obj1= (Ti) obj;
        obj1.show2();

    }
}
