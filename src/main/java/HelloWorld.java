public class HelloWorld {
    public String sayHello() {
        return "Hello, Jenkins!";
    }

    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        System.out.println(hello.sayHello());
    }
}

