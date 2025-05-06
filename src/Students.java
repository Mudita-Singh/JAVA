class Students {
    String name;
    int age;

    Students() {
        name = "mansi";
        age = 0;
    }

    Students(String name, int age) {
        this.name = name;
        this.age = age;
    }


    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args)
    {
        Students student1 = new Students();
        Students student2 = new Students("mudita", 20);


        student1.display();
        student2.display();
    }
}
