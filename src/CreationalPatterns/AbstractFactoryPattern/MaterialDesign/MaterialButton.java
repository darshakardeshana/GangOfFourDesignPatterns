package CreationalPatterns.AbstractFactoryPattern.MaterialDesign;

import CreationalPatterns.AbstractFactoryPattern.Button;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Material Button");
    }
}
