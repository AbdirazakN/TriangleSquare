public class Triangle {
    float a;
    float b;
    float c;
    public void area(){
        float perimeter = (a+b+c)/2;
        float square = (float) Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));;
        System.out.println("Полупериметр треугольника "+perimeter);
        System.out.println("Площадь треугольника "+square);
    }
}
