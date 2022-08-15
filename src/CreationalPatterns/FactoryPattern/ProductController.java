package CreationalPatterns.FactoryPattern;

import CreationalPatterns.FactoryPattern.Matcha.Controller;
import CreationalPatterns.FactoryPattern.SharpViewEngine.SharpController;

import java.util.HashMap;
import java.util.Map;

public class ProductController extends SharpController {
    public void listProducts(){
        Map<String, Object> context = new HashMap<>();
        render("Products.html", context);
    }
}
