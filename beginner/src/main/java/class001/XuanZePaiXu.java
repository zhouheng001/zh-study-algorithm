package class001;

/**
 * 描述:
 * 选择排序
 * @author zhouheng
 * @create 2023-05-13 23:31
 */
public class XuanZePaiXu {

    public static void main(String[] args) {
     int [] nums = {3,2,3,5,2,76,23,23,12,34,1900};
//     selectSort(nums);
        bobbleSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }


    public static void insertSort(int [] nums){
        if(nums==null || nums.length<2){
            return;
        }

        int end = nums.length;
        for (int i = 1; i < end; i++) {
            for (int j = 0; j < i; j++) {
                
            }
        }
    }

    public static void bobbleSort(int[] nums){
        if(nums==null || nums.length<2){
            return;
        }
        int end = nums.length;
        for (int i = end-1; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                if(nums[j-1]>nums[j]){
                    swap(nums,j-1,j);
                }
            }
        }

    }

    public static void selectSort(int [] nums){
        if(nums==null || nums.length<2){
            return;
        }
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int minIndex =i;
            for (int j = i+1; j < length; j++) {
                minIndex = nums[j] < nums[minIndex]?j:minIndex;
            }
            swap(nums,minIndex,i);
        }
    }

    public static void swap(int [] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
