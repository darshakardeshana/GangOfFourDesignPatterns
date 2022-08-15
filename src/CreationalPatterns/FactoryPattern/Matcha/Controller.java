package CreationalPatterns.FactoryPattern.Matcha;

import CreationalPatterns.FactoryPattern.IViewEngine;

import java.util.Map;

public class Controller {
    public void render(String viewName, Map<String, Object> context){
        var engine = createViewEngine();
        var html = engine.render(viewName, context);
        System.out.println(html);
    }

    protected IViewEngine createViewEngine(){
        return new MatchaViewEngine();
    }
}
