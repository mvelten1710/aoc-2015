import org.junit.Test
import kotlin.test.assertEquals

class TestMain {

    @Test
    fun testWhichFloorZero() {
        val expected = 0
        val testValue1 = "(())".chunked(1)
        val testValue2 = "()()".chunked(1)
        assertEquals(expected, whichFloor(convertFloorCode(testValue1)))
        assertEquals(expected, whichFloor(convertFloorCode(testValue2)))
    }

    @Test
    fun testWhichFloorThree() {
        val expected = 3
        val testValue1 = "(((".chunked(1)
        val testValue2 = "(()(()(".chunked(1)
        assertEquals(expected, whichFloor(convertFloorCode(testValue1)))
        assertEquals(expected, whichFloor(convertFloorCode(testValue2)))
    }

    @Test
    fun testWhichFloorMinusOne() {
        val expected = -1
        val testValue1 = "())".chunked(1)
        val testValue2 = "))(".chunked(1)
        assertEquals(expected, whichFloor(convertFloorCode(testValue1)))
        assertEquals(expected, whichFloor(convertFloorCode(testValue2)))
    }
}