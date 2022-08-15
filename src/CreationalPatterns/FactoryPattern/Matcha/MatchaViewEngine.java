package CreationalPatterns.FactoryPattern.Matcha;

import CreationalPatterns.FactoryPattern.IViewEngine;

import java.util.Map;

public class MatchaViewEngine implements IViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context){
        return "View render by Matcha";
    }
}
