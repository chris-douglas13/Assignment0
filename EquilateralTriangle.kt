import kotlin.math.sqrt

class EquilateralTriangle(_side : Double) : Shape(_name = "Equilateral Triangle"){
    val side = _side
    fun setDimensions(_side : Double){
        println("Equilateral Triangle side length:" + _side)
    }

    override fun getArea(): Double {
        return sqrt(3.0)*side*side/4.0
    }
}