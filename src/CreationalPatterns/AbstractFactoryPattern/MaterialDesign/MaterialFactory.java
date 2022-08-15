package CreationalPatterns.AbstractFactoryPattern.MaterialDesign;

import CreationalPatterns.AbstractFactoryPattern.Button;
import CreationalPatterns.AbstractFactoryPattern.Textbox;
import CreationalPatterns.AbstractFactoryPattern.WidgetFactory;

public class MaterialFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public Textbox createTextbox() {
        return new MaterialTextBox();
    }
}
