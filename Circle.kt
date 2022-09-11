class Circle(_name: String, _radius: Double) : Shape(_name)  {
    val radius = _radius

     fun setDimensions(_radius : Double){
         println("Circle radius length:" + radius)
    }

    override fun getArea() :Double{
       return 3.14*radius*radius
    }
}