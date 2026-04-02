import tools.Bp;

class A{
    // public void show(){
    //     System.out.println("in A");
    // }
    public int add(int a,int b){
        return a+b;
    }
}
class B extends Dynamic{
    //it has no methods so calls from parent
    //now we do overriding to print B with same show()
    // public void show(){
    //     System.out.println("in B");
    // }
    //this gets printed and it overides method of A class
    public int add(int x,int y){
        return x+y+1;
    }
    //overrided add method from parent class

}
public class Overriding{
    public static void main(String[] args) {
        Bp obj= new Bp();
        int ans=obj.add(5,5);
        System.out.println(ans);

    }

}