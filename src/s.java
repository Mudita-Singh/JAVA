//
//
//
//class Exam{
//    public static void main (String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a  , b , c");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c =sc.nextInt();
//        if ( a>b) {
//            if (a > c) {
//                System.out.println(" a is greatest ");
//            } else {
//                System.out.println("c is greatest");
//            }
//        }
//        else{
//            if(b>c){
//                    System.out.println(" b is greatest");
//            }
//            else{
//                    System.out.println(" c is greatest");
//            }
//
//            }
//        }
//
//
//}
//

//
//class Exam {
//    public static void main( String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter num btw 1-7");
//        int num = sc.nextInt();
//        switch(num){
//            case 1 :
//                System.out.println("mon");
//                break;
//            case 2:
//                System.out.println("tues");
//                break;
//            case 3 :
//                System.out.println("thrus");
//                break;
//
//        }
//
//
//    }
//}
////
//
//class Exam {
//    public static void main(String[] args){
//       Scanner sc = new Scanner(System.in);
//       int num = sc.nextInt();
//        int sum = 0;
//        while(num != 0 ){
//            sum = sum + num%10;
//            num = num/10;
//        }
//        System.out.println(sum);
//
//    }
//        int a = 0;
//        int b= 1;
//        int sum = 0;
//        System.out.println(a);
//        System.out.println(b);
//        for(int i = 0 ; i <num-2; i++){
//            sum= a+b;
//            System.out.println(sum);
//            a=b;
//            b=sum;
    //    }
//
        // }
//}

//
//class Exam{
//    public static  void main(String[] args ){
//        int factors=0;
//        int count=0;
//        for( int i = 2; i<=1000;i++ ){
//            for( int j=1 ; j<=i; j++){
//                if(i%j==0){
//                    factors++;
//                }
//
//            }
//
//            if(factors==2){
//                System.out.println(i);
//                count++;
//            }
//            factors = 0;
//
//        }
//        System.out.println(count);
//
//    }
//}
//
//class Exam{
//    public static void main( String[] args){
//        //int[] arr = {2 , 3 ,2};
//        int[] arr= new int[3];
//        arr[0]=2;
//        arr[1]= 3;
//        arr[2]= 2;
//        int count = 0;
//        int target = 2;
//        for(int i = 0 ; i<arr.length ; i++){
//            if(arr[i]== target){
//                count++;
//            }
//        }
//        System.out.println(count);
//
//
//    }
//}
//
//class Exam{
//    public static void main(String[] args){
//        int[] arr = { 1 , 3 , 2 , 4 , 5 , 8 , 1};
//        int a =0;
//        int b = 0;
//
//        for(int i=0 ; i< arr.length ; i++){
//            if( arr[i] > a){
//
//                a = arr[i];
//
//            }
//
//        }
//        for(int i = 0 ; i < arr.length; i++){
//            if (arr[i]> b && arr[i]<a) {
//                b = arr[i];
//
//            }
//        }
//        System.out.println(b);
//
//
//    }
//}

//class Exam{
//    public static void main( String[] args){
//        for( int i = 1; i<= 5 ; i++){
//            if(i % 2!=0) {
//                for (int j = 1; j<= (2* i-1); j++) {
//                    System.out.print("?");
//                }
//            }
//            else {
//                for( int j = 1 ; j<=(2*i-1); j++){
//
//                    System.out.print("#");
//
//                }
//                }
//            System.out.println("");
//
//            }
//        }
//    }

//
//class Exam{
//    String name;
//    int age;
//    Exam(){}
//    Exam(String name , int age){
//        this.name = name;
//        this.age = age;
//    }
//    void display(){
//        System.out.println(name + age);
//    }
//    public static void main(String[] args){
//        Exam e1 = new Exam();
//        Exam e2 = new Exam("aman" , 10);
//        e1.display();
//        e2.display();
//
//
//    }
//}

//class Exam{
//    private double balance;
//    Exam(double balance){
//        this.balance = balance;
//    }
//
//
//    public void deposit(double amount){
//        balance = balance + amount;
//        System.out.println(balance);
//
//    }
//    protected void withdraw(double amount){
//        balance = balance - amount;
//        System.out.println(balance);
//    }
//    void display(){
//        System.out.println(balance);
//    }
//
//public static void main(String[] args){
//        Exam account = new Exam(100.0);
//        account.deposit(500.0);
//
//}
//
//}
//
//class Exam {
//    int add(int a , int b){
//        return a+b;
//    }
//    int add(int a , int b , int c){
//        return a+b+c;
//    }
//    double add(int a , double b){
//        return a+b;
//    }
//    public static void main(String[] args){
//        Exam a = new Exam();
//        System.out.println(a.add( 1 , 2 ,3));
//        a.add(1 , 3);
//        a.add(1, 1.2);
//
//    }
//}
//
//class Examprep{
//    static String uni= "upes";
//    String name ;
//    static void display(){
//        System.out.println(uni);
//    }
//    public static void main(String[] args) {
//        Exam s1 = new Exam("Mudita");
//        Exam s2 = new Exam("Riya");
//        Exam s3 = new Exam("Aarav");
//
//        s1.display();
//        s2.display();
//        s3.display();
//
//    }
//
//}
//
//class Exam {
//    private int a;
//
//    Exam(int a) {
//        this.a = a;
//    }
//
//    void display() {
//        System.out.println(a);
//    }
//}
//
//class Examss extends Exam{
//    public static void main(String[] args){
//        Exam abc = new Exam(1);
//        abc.display();
//    }
//
//}

//
//classs Exam {
//    private abc;
//    Exam display(){}
//
//}
//class Tes extends Exam{
//    Exam a = new Exam();
//
//}