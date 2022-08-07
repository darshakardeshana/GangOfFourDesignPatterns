package StructuralPatterns.FlyWeightPattern;

import java.util.ArrayList;
import java.util.List;

public class PointService {
    private final PointIconFactory iconFactory;

    public PointService(PointIconFactory iconFactory) {
        this.iconFactory = iconFactory;
    }

    public List<Point> getPoints() {
        List<Point> points = new ArrayList<>();
        points.add(new Point(1, 2, iconFactory.getPointIcon(PointType.CAFE)));
        points.add(new Point(1, 2, iconFactory.getPointIcon(PointType.HOSPITAL)));
        points.add(new Point(1, 2, iconFactory.getPointIcon(PointType.RESTAURANT)));

        return points;
    }
}
