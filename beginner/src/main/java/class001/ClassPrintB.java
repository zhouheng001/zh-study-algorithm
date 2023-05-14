package class001;

/**
 * 描述:
 *  打印int的32位字节
 * @author zhouheng
 * @create 2023-05-13 22:04
 */
public class ClassPrintB {

    public static void main(String[] args) {
//        System.out.println(Integer.MAX_VALUE);
        int a = -4;
        for (int i = 31; i >=0 ; i--) {
            System.out.print((a & (1 << i))== 0?"0":"1");
        }
        System.out.println();
        int b = 1563456456;
//        System.out.println(~b);

        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println(Integer.MIN_VALUE);
    }

}
