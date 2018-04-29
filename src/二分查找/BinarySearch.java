package 二分查找;

public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.search(new int[] { 1, 2, 10, 15, 100 }, 15));
        System.out.println(bs.search(new int[] { 1, 2, 10, 15, 100 }, -2));
        System.out.println(bs.search(new int[] { 1, 2, 10, 15, 100 }, 101));
        System.out.println(bs.search(new int[] { 1, 2, 10, 15, 100 }, 13));
        System.out.println("====================");
        System.out.println(bs.search(new int[] {}, 13));
        System.out.println(bs.search(new int[] { 12 }, 13));
        System.out.println(bs.search(new int[] { 13 }, 13));
        System.out.println("====================");
        System.out.println(bs.search(new int[] { 12, 13 }, 13));
        System.out.println(bs.search(new int[] { 12, 13 }, 12));
    }

    /**
     *
     * @param arr
     * @param searchValue
     * @return
     */
    public int search(int[] arr, int searchValue) {
        int a = 0;
        int b = arr.length - 1;
        int mid = 0;

        while (true) {
            mid = a + (b - a) / 2;

            if (mid > b) {
                return -1;
            }

            if (arr[mid] == searchValue) {
                return mid;
            } else if (searchValue < arr[mid]) {
                b = mid - 1;
            } else {
                a = mid + 1;
            }
        }
    }
}
