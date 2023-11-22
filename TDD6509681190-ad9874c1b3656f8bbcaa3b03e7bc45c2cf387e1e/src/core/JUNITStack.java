package core;
import junit.framework.TestCase;

public class JUNITStack extends TestCase {

    public void testCreateNewEmptyStack() {
        Stack s1 = new Stack();
        int size = s1.getSize();
        
        assertEquals(0, size);
        assertTrue(s1.isEmpty());
    }

    public void testPushElmToTop()throws Exception {
        Stack s1 = new Stack();
        
        s1.push(42); // ใส่ค่า 42 เข้าไปใน stack
        
        int size = s1.getSize();
        
        assertEquals(1, size); // เนื่องจากมีการ push 1 element เข้าไป
        assertFalse(s1.isEmpty()); // stack ต้องไม่ว่างเปล่า
        
        int topElement = s1.peek();
        assertEquals(42, topElement); // ค่าที่ใส่เข้าไปต้องอยู่บนสุดของ stack
    }

    public void testEmptyInitialStack() {
        Stack s1 = new Stack();
        
        int size = s1.getSize();
        
        assertEquals(0, size);
        assertTrue(s1.isEmpty());
    }

    public void testPushDifferentElmTypeToStack()throws Exception {
    	Stack s1 = new Stack();
        
        s1.push(42); // เพิ่มสมาชิกประเภท Integer เข้าไปใน stack
        
        // ทดสอบ push สมาชิกประเภท boolean เข้าไปใน stack
        try {
            s1.push(true);
            fail("Expected an exception");
        } catch (Exception e) {
            assertEquals("All elements in the stack must be of the same type.", e.getMessage());
        }
        
        // ตรวจสอบว่า stack ยังคงมีสมาชิกประเภท Integer เดิมอยู่เพียงค่าเดียว
        int size = s1.getSize();
        assertEquals(1, size);
        int topElement = s1.peek();
        assertEquals(42, topElement);
    }
    public void testLastInFirstOut()throws Exception {
    	Stack s1 = new Stack();
        
        s1.push(1);
        s1.push(2);
        s1.push(3);

        // เริ่มต้น stack คือ [1, 2, 3]
        
        // pop ค่าออกจาก stack จะได้ค่า 3, 2, 1 ตามลำดับ LIFO
        int poppedValue1 = s1.pop();
        assertEquals(3, poppedValue1);

        int poppedValue2 = s1.pop();
        assertEquals(2, poppedValue2);

        int poppedValue3 = s1.pop();
        assertEquals(1, poppedValue3);

        // ตรวจสอบว่า stack ว่างเปล่าหลังจาก pop ทั้งหมด
        assertTrue(s1.isEmpty());
    }
    
    
}
