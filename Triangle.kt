import kotlin.math.sqrt

abstract class Triangle(_name: String, _side1 : Double, _side2 :Double, _side3 : Double) : Shape(_name)  {
    val side1 = _side1
    val side2 = _side2
    val side3 = _side3
    fun setDimensions(_side1 : Double, _side2 :Double,_side3 : Double){
        println("Triangle side lengths: " + side1 + ", " + side2 + ", " + side3)
    }

    override fun getArea(): Double {
        val s = (side1+side2+side3)/2
        return sqrt(s*(s-side1)*(s-side2)*(s-side3))
    }
}