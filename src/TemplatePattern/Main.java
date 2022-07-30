package TemplatePattern;

//In real world application these main class will be outside this package
public class Main {
    public static void main(String[] args) {
        var task = new CreateUserTask();
        task.execute();
    }
}
