package Test20211104;

/**
 * 归并
 */
public class Test20211104 {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 2, 3, 6, 8, 9};
        int[] arr2 = new int[] { 1, 4, 5, 7, 10 };
        int[] newArr = Sort(arr1, arr2);
        for(int i = 0; i < newArr.length; i++){
            System.out.println(newArr[i]);
        }
    }
    public static int[] Sort(int[] arr1,int[] arr2)
    {
        int[] newArr = new int[arr1.length + arr2.length];
        int i = 0;//其中一个数组的便利下标
        int j = 0;//另外一个数组指针下标
        int k = 0;//重组数组的下标
        /**
         * 循环对比两个数组中元素的大小
         */
        while (i < arr1.length && j < arr2.length)
        {
            if (arr1[i] < arr2[j]){
                newArr[k] = arr1[i];
                i++;
                k++;
            }else{
                newArr[k] = arr2[j];
                j++;
                k++;
            }
        }
        //两数组 比较并重组称新数组后还剩下最后一个数的时候直接赋值
        while (i < arr1.length) {
            newArr[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            newArr[k++] = arr2[j++];
        }
        return newArr;
    }
}
