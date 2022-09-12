fun main(){
    val circle : Shape = Circle(3.0)
    val triangle : Shape = Triangle(4.0,3.0,2.0)
    val square : Shape = Square(5.0, 5.0)
    val equilTriangle : Shape = EquilateralTriangle(4.0)

    circle.getArea()
    triangle.getArea()
    square.getArea()
    equilTriangle.getArea()
}