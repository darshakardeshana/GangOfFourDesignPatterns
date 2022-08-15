package CreationalPatterns.FactoryPattern.SharpViewEngine;

import CreationalPatterns.FactoryPattern.IViewEngine;

import java.util.Map;

public class SharpViewEngine implements IViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "view rendered by sharp";
    }
}
