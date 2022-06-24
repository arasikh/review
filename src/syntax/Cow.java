package syntax;

public class Cow {
    String breed;
    String color;
    int age;
    double weight;

    Cow(String breed,String color,int age, double weight){
        this.breed=breed;
        this.color=color;
        this.age=age;
        this.weight=weight;
    }
    String getCowInfo(){
        return "Breed"+breed+" color "+color+" age "+age+" weight "+weight;
    }
}
