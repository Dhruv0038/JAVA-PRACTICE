import java.util.*;
//class Pen{
//
//    String color;
//    String type;
//    public void write(){
//
//        System.out.println("writing something");}
//        System.out.println(this.color);
//        System.out.println(this.type);

//    }
//    Pen(String color,String type){
//        this.color=color;
//        this.type=type;
//        System.out.println(this.color);
//        System.out.println(this.type);
//
//
//    }
//}
//        public void printcolor(){
//            System.out.println(this.color);
//        }
//        public void printtype(){
//            System.out.println(this.type);
//        }
//    }
//class Student {
//    Student(){
//        System.out.println("this is a constructor.");
//    }
//    String name;
//    int age;
//    double height;
//    String race;
//    public void print(){
//        System.out.println(this.name);
//        System.out.println(this.age);
//        System.out.println(this.height);
//        System.out.println(this.race);
//}}
//class Student {
//    String name;
//    int age;
//    double height;
//    String race;
//    public void print(){
//        System.out.println(this.name);
//        System.out.println(this.age);
//        System.out.println(this.height);
//        System.out.println(this.race);}
//
//        Student(Student s2){
//            this.name=s2.name;
//            this.age=s2.age;
//        }
//        Student(){}

//}
//class Banking{
//    static String Name;
//    static String accountnumber ;
//    public void print(){
//        System.out.println(this.Name);
//        System.out.println(this.accountnumber);
//    }
//    public void BANKNAME(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("PLEASE PROVIDE THE BANK NAME");
//        String BANKNAME = sc.nextLine(); 
//
//        if (BANKNAME.equalsIgnoreCase("abcbank")){
//            System.out.println("invalid bank name please enter valid bank name");
//
//        }
//        else{
//            System.out.println("welcome to the bank what can we do for you today");
//        }
//
//
//    }
//
//
//
//}


class Banking {
    static String Name;
    static String accountnumber;

    public void print() {
        System.out.println(this.Name);
        System.out.println(this.accountnumber);
    }

    public void BANKNAME() {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE PROVIDE THE BANK NAME");
        String BANKNAME = sc.nextLine();

        if (BANKNAME.equalsIgnoreCase("ABCBANK")) {
            System.out.println("Welcome to ABCBANK! What can we do for you today?");
        } else {
            System.out.println("Invalid bank name. Please enter a valid bank name.");
        }
    }
}





