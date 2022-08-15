package CreationalPatterns.AbstractFactoryPattern.AntDesign;

import CreationalPatterns.AbstractFactoryPattern.Textbox;

public class AntTextBox implements Textbox {
    @Override
    public void render() {
        System.out.println("Rendering Ant Textbox");
    }
}
