import java.io.File

fun main(args: Array<String>) {

    val input = File("input.txt").readText().chunked(1)

    val result1 = whichFloor(convertFloorCode(input))
    println("Result of Puzzle 1: $result1")

    val result2 = indexFirstTimeBasement(0, convertFloorCode(input), 0)
    println("Result of Puzzel 2: $result2")

}

fun convertFloorCode(floorCode: List<String>): List<Int> = floorCode.map { if (it == "(") 1 else -1 }.toList()

fun whichFloor(floorCode: List<Int>): Int = floorCode.sum()

fun indexFirstTimeBasement(index: Int, floorDirections: List<Int>, acc: Int): Int {
    if(acc == -1) return index
    val newList = floorDirections.drop(1)
    val currentFloorLevel = acc + floorDirections[0]
    return indexFirstTimeBasement(index+1, newList, currentFloorLevel)
}