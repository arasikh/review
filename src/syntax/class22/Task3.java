package syntax.class22;

public class Task3 {

    static void sayHello(){
        System.out.println("hello batch13");
    }
    static void sayHello(String msg){
        System.out.println("msg");
    }
    static void sayHello(String msg, int times){
        for(int i=0; i<times;i++)
        System.out.println("msg");
    }

    public static void main(String[] args) {
        sayHello("Zameer stop wasting time with IG",5);
    }
}
