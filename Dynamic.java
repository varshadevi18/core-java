class Ai{

    void show(){
        System.out.println("in A");
    }
}
class Bi extends Ai{

}
class Ci extends Ai{

    void show(){
        System.out.println("in C");
    }
}
public class Dynamic{
    public static void main(String[ ] args){
        Ai obj = new Bi();
        obj.show();
        obj= new Ci();
        obj.show();
    }
}