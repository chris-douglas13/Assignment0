class Square(_name: String,_length : Double, _height :Double) : Shape(_name) {
    val length = _length
    val height = _height
    fun setDimensions(_length : Double, _height :Double){
        println("Square height: " + _height + "   length: "+ _length)
    }

    override fun getArea(): Double {
        return length*height
    }
}