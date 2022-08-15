package CreationalPatterns.AbstractFactoryPattern.MaterialDesign;

import CreationalPatterns.AbstractFactoryPattern.Textbox;

public class MaterialTextBox implements Textbox {
    @Override
    public void render() {
        System.out.println("Rendering Material Textbox");
    }
}
