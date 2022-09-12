class Circle(_radius: Double) : Shape(_name = "Circle")  {
    val radius = _radius

     fun setDimensions(_radius : Double){
         println("Circle radius length:" + radius)
    }

    override fun getArea() :Double{
       return 3.14*radius*radius
    }
}