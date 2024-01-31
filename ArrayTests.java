import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testOddReverse() {
    int[] input1 = { 9,5,8,2,23 };
    assertArrayEquals(new int[]{ 23, 2, 8, 5, 9 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testEvenReverse() {
    int[] input1 = { 9,5,8,2 };
    assertArrayEquals(new int[]{ 2, 8, 5, 9 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testEvenReverseInPlace() {
    int[] input1 = { 9,5,8,5 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 5,8,5,9 }, input1);
  }

}
