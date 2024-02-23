public class shapeFactory {
     public shape creatShape(String type){

        if ((type.equalsIgnoreCase("circle"))) {
            return new Circle();
        }else if(type.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }

        return null;
     }

     
}
