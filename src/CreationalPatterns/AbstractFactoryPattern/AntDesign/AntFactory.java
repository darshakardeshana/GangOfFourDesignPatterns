package CreationalPatterns.AbstractFactoryPattern.AntDesign;

import CreationalPatterns.AbstractFactoryPattern.Button;
import CreationalPatterns.AbstractFactoryPattern.MaterialDesign.MaterialButton;
import CreationalPatterns.AbstractFactoryPattern.Textbox;
import CreationalPatterns.AbstractFactoryPattern.WidgetFactory;

public class AntFactory implements WidgetFactory  {
    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public Textbox createTextbox() {
        return new AntTextBox();
    }
}
