class Point3D {
    var x: Int = 0
    var y: Int = 0
    var z: Int = 0
}

fun createPoint(x: Int, y: Int, z: Int): Point3D {
    return Point3D().apply {
        this.x = x
        this.y = y
        this.z = z
    }
}