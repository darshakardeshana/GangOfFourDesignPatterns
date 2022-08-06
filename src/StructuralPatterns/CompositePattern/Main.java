package StructuralPatterns.CompositePattern;

public class Main {
    public static void main(String[] args) {
        var square = new Shape();
        var circle = new Shape();

        var group1 = new Group();
        group1.addComponent(circle);
        group1.addComponent(square);

        var group2 = new Group();
        group2.addComponent(circle);
        group2.addComponent(square);

        var group = new Group();
        group.addComponent(group1);
        group.addComponent(group2);

        group.render();

    }
}
