package StructuralPatterns.FlyWeightPattern;

public class Main {
    public static void main(String[] args) {
        var pointService = new PointService(new PointIconFactory());
        var points = pointService.getPoints();

        for(var point : points){
            point.draw();
        }
    }
}
