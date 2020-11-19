/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu.util;

/**
 *
 * @author Jack Nguyen
 */
public class MathUtil {
  //class này chứa các hàm tiện ích dùng chung cho mọi người 
    //do đó  phải nên là static 
    
    public static final double PI=3.1415;
    
//    hàm tính  n giai thừa n>=0 &&n<=20
//    0! =1 ,1!=1
//    public static long getFactorial(int n){
//        if(n < 0 || n > 20)
//            throw new IllegalArgumentException("n must be >=0 & <=20 ");
//        if(n == 0 ||n == 1)
//            return 1; // if đã return thì đừng NGU mà ghi else
//        long result=1;
//        for(int i = 2;i <= n; i++){
//            result *= i;
//        }
//        return result;
//        
//    }
    
    public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("n must be >=0 & <=20 ");
        if(n == 0 ||n == 1)
            return 1; // if đã return thì đừng NGU mà ghi else
       
        return n *getFactorial(n-1); // đệ quy
        
        // chơi lớn ko thèm check local
    }
    
    
    
    public static void main(String[] args) {
       //2 test hàm = mắt
        System.out.println("5! = "+MathUtil.getFactorial(5));
        //expected :5!=120    actual=120
        // tao hy vọng mày trả vê 120 khi tao gọi mày giải hàm giai thừa ấy
        System.out.println("0! = "+MathUtil.getFactorial(0));
        //expected:0!=1  actual:
        
        //expected: ném ra ngoại lệ IllegalArgumentException nếu nếu giai thừa -5
        System.out.println("-5!= "+MathUtil.getFactorial(-5));
        
        System.out.println("CI for today");
    }
    
    // code viết ra thif Developer phải test trước
        //có vài hình thức test code khác nhau
        //1,TDD, Test Driven Development
        //viết dàn khung các hàm getFactorial(int n)
    //sau đó dựng hàm test
    //chạy thử coi xanh đỏ ,đó nghĩa là lỗi, xanh nghĩa là ổn
    //cứ xanh đỏ như thê trong quá trình viết code
    //vả sửa code, người ta gọi là lập trình hướng theo thỏa mãn
    //viẹc test,TDD
    //2 sout(hàm kèm data) để coi kết quả ra sao ,có đúng như mình kỳ vọng
    //nó phải trả về như thế hay không -->xem kết quả test bằng mắt
    //3 JoptionPane của bên java desktop dể popup kết qua lên màn hình
    // vẫn xem bằng mắt
    //4 viết 1 trong web gọi hàm xử lý..., hao sức quá
    
    //ta chơi bước 1 và 2
    
}
