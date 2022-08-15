package CreationalPatterns.FactoryPattern.SharpViewEngine;

import CreationalPatterns.FactoryPattern.IViewEngine;
import CreationalPatterns.FactoryPattern.Matcha.Controller;

public class SharpController extends Controller {
    @Override
    protected IViewEngine createViewEngine(){
        return new SharpViewEngine();
    }
}
