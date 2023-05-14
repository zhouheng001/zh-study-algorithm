package class001;

/**
 * 描述:
 * 阶乘
 * @author zhouheng
 * @create 2023-05-13 23:14
 */
public class JieCheng {

    public static void main(String[] args) {
        int jiecheng = jiecheng(3);
        System.out.println(jiecheng);
    }

    public static int jiecheng(int num){
        int sum =0;
        int acr =1;
        for (int i = 1; i <= num ; i++) {
          acr = acr*i;
          sum = sum +acr;
        }

        return sum;
    }
}
