// 아래 예제에서 toString 쉽게 쓰기 위해 data class 사용
data class Point(val x: Int, val y: Int) {
    // 'operator' > must have a single value parameter
    operator fun plus(newPoint: Point) :Point = Point(x + newPoint.x, y + newPoint.y)
}

val p1 = Point(1,1)
val p2 = Point(2, 2)
var p3 = Point(3, 3)

val plusPoint = p1+p2
p3 += p2 // 복합 대입 연산은 자동으로 생성된다.
println("plusPoint = $plusPoint")
println("p3 = ${p3}")

val listOfPoint = listOf(p1, p2)
// listOfPoint+= p3 불가능 -> listOf 에는 add 함수가 없음
// listOfPoint + p3 -> 새로운 불변 list 를 생성해서 값을 저장하기 때문에 가능
//val list = arrayListOf(1,2)
//list+=3 -> 주소가 변하는것은 아니기때문에 가능

//todo listof, arraylistof, listOfInt 불변, 가변 비교