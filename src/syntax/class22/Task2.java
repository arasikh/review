package syntax.class22;

public class Task2 {

}

class Programming{

    Programming (){
        System.out.println("I love programming languages");
    }
    Programming (String msg){
        System.out.println("I love "+msg);
    }

    public static void main(String[] args) {
        new Programming();
        new Programming("Java");
    }
}
