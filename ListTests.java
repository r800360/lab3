import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
    
    @Test
    public void testfilterList() {
        class EvenLengthChecker implements StringChecker {
            public boolean checkString(String s) {
                return (s.length() % 2 == 0);
            }
        }

        EvenLengthChecker myChecker = new EvenLengthChecker();
        
        List<String> produceList = new ArrayList<String>();

        produceList.add("apple");
        produceList.add("artichoke");
        produceList.add("banana");
        produceList.add("guava");
        produceList.add("lemon");
        produceList.add("peach");
        produceList.add("pear");
        produceList.add("watermelon");

        List<String> resultantListExpected = ListExamples.filter(produceList, myChecker);

        List<String> resultantList = new ArrayList<String>();
        resultantList.add("banana");
        resultantList.add("pear");
        resultantList.add("watermelon");

        for (int i = 0; i < 3; i++) {
            assertEquals(resultantListExpected.get(i), resultantList.get(i));
        }
    }

    @Test
    public void testMergeSortedLists() {
        List<String> firstList = new ArrayList<String>();
        List<String> secondList = new ArrayList<String>();
        
        firstList.add("artichoke");
        firstList.add("guava");
        firstList.add("lemon");
        firstList.add("watermelon");
        secondList.add("apple");
        secondList.add("banana");
        secondList.add("peach");
        secondList.add("pear");
        List<String> resultantListExpected = ListExamples.merge(secondList, firstList);
        List<String> resultantList = new ArrayList<String>();
        resultantList.add("apple");
        resultantList.add("artichoke");
        resultantList.add("banana");
        resultantList.add("guava");
        resultantList.add("lemon");
        resultantList.add("peach");
        resultantList.add("pear");
        resultantList.add("watermelon");

        for (int i = 0; i < 8; i++) {
            assertEquals(resultantListExpected.get(i), resultantList.get(i));
        }

    }
}
