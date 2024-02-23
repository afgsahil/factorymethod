public class main {

    public static void main(String[] args) {
        shapeFactory shapeFactory= new shapeFactory();
        shape circle = shapeFactory.creatShape("circle");
        circle.Draw();;

        // second shape creation here

        shape rectangle = shapeFactory.creatShape("rectangle");
        rectangle.Draw();


    }
}