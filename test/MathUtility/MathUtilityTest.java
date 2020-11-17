/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathUtility;

import fu.util.MathUtil;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jack Nguyen
 */
public class MathUtilityTest {
    
    public MathUtilityTest() {
        // mình sẽ test các tình huống xài hàm getFactorial() ở đây
        //tình huống if tham số đưa vào :dương âm, trong khoảng 0..20 ngoài
        //tình huống xài hàm, test hàm gọi là test case
        //thường ta có tình huống thành công và thất bại
        //thành công: đưa vào value hợp lệ 0..20
        //thất bại : đưa vào âm,>20 bị ăn đòn
        // hàm phải bất các tình huống này, và giờ ta test thử coi hàm xử lý đúng ko
        
}
    @Test
        public void getFactorial_RunsWell_IfValidArgument(){
           assertEquals(120,MathUtil.getFactorial(5));
           assertEquals(24,MathUtil.getFactorial(4));
           assertEquals(6,MathUtil.getFactorial(3));
           assertEquals(10,MathUtil.getFactorial(1));
           //tui muốn check có đúng là 5!=120 hay ko nếu có là xanh nếu không là đỏ 
        }
}

//mặc đinh code test độc lập với vode chính
//đọc lập với quá trình CLEAN&BUILD, tức là dù code xanh hay đỏ
//miễn là ko bị error cú pháp
//bạn luôn đóng gói build ra được file .jar .war (chấp xanh đỏ)

//hợp logic thì màu xanh, tức là hàm chuẩn thì mới ra được .jar .war
//vậy ta cần có 1 cách gài xanh đỏ vào quy trình build .jar .war
//cách khác:nên code test đang màu đỏ thì DISABLE cái nút bấm CLEAN&BUILD