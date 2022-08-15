package CreationalPatterns.AbstractFactoryPattern.App;

import CreationalPatterns.AbstractFactoryPattern.WidgetFactory;

public class ContactForm {
    public void render(WidgetFactory widgetFactory) {
        widgetFactory.createButton().render();
        widgetFactory.createTextbox().render();
    }
}
