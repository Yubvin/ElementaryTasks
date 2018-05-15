package com.testgroupid.elementarytasks.trianglesorter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TriangleSorter {

    private List<Triangle> triangles;

    public TriangleSorter(){
        this.triangles = new ArrayList<>();
    }

    public TriangleSorter(List<Triangle> triangles){
        this.triangles = new ArrayList<>(triangles);
    }

    public void add(Triangle triangle){
        triangles.add(triangle);
    }

    public TriangleSorter sortTriangles(){
        triangles.sort(Comparator.comparing(Triangle::getArea).reversed());
        return this;
    }

    public void showTriangleList(){
        System.out.println("============= Triangle list: =============");
        for(int i = 1; i <= triangles.size(); i++){
            System.out.println(i + "." + triangles.get(i-1));
        }

    }
}
