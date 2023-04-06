import java.util.LinkedList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left_index = find_left_bound(arr, x);
        System.out.println(left_index);
        int left = left_index-1;
        int right = left_index;
        LinkedList<Integer> list = new LinkedList<>();
        while(k>0){
            if(left<0){
//                左侧没有元素可以添加
                list.addLast(arr[right]);
                right++;
            }else if(right>= arr.length){
//                右侧没有元素可以添加了
                list.addFirst(arr[left]);
                left--;
            }else if(arr[right]-x<x-arr[left]){
//                右侧更靠近x的数
                list.addLast(arr[right]);
                right++;
            }else if(arr[right]-x>=x-arr[left]){
//                左侧更靠近x的数
                list.addFirst(arr[left]);
                left--;
            }
            k--;
        }
        return list;
    }
//    求出数组中target出现的左侧边界
    public int find_left_bound(int[] arr, int target){
        int left = 0;
        int right = arr.length;
        while(left<right){
            int mid = left+(right-left)/2;
            if(arr[mid]==target){
                right = mid;
            }else if(arr[mid]<target){
                left = mid+1;
            }else {
                right = mid;
            }
        }
        return left;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
