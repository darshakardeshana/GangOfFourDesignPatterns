package CreationalPatterns.AbstractFactoryPattern;

import CreationalPatterns.AbstractFactoryPattern.AntDesign.AntFactory;
import CreationalPatterns.AbstractFactoryPattern.App.ContactForm;
import CreationalPatterns.AbstractFactoryPattern.MaterialDesign.MaterialFactory;

public class Main {
    public static void main(String[] args) {
        new ContactForm().render(new MaterialFactory());
    }
}
