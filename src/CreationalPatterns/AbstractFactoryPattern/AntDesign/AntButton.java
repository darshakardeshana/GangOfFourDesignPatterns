package CreationalPatterns.AbstractFactoryPattern.AntDesign;

import CreationalPatterns.AbstractFactoryPattern.Button;

public class AntButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Ant Button");
    }
}
