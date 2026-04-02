interface Z{
    void music();
}
interface X{
    void show();
}
interface Y extends X{

}
class Q implements Z,X,Y{ 
    public void show(){
        System.out.println("interface...");
    }
    public void music(){
        System.out.println("interface...");
    }

}
public class Interfaces{
    public static void main(String[] args) {
        Q obj= new Q();
        obj.show();
        Y objj= new Q();
        objj.show();
    }
}