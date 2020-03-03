/*
 * All rights Reserved, Designed By baowei
 *
 * 注意：本内容仅限于内部传阅，禁止外泄以及用于其他的商业目的
 */
package src.off;

/**
 * @author yan.zhang
 * @date 2019/9/1 14:59
 */
public class Solution05 {
    /**
     * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
     * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
     * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
     * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
     */
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 8, 1, 2, 3};
        int min = minNumberInRotateArray(array);
        System.out.println(min);
    }

    public static int minNumberInRotateArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int low = 0;
        int high = array.length - 1;

        while (low < high) {
            if (array[low] < array[high]) {
                return array[low];
            }
            int mid = (low + high) / 2;
            if (array[mid] > array[low]) {
                //mid 处于递增数组
                low = mid + 1;
            } else if (array[mid] < array[high]) {
                high = mid;
            } else {
                low++;
            }
        }
        return array[low];
    }
}
