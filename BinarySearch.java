import java.util.Arrays;

public class BinarySearch {

    public int search(final int[] list, final int item) {
        Arrays.sort(list);
        int low = 0;
        int high = list.length - 1;
        while (low <= high) {
            final int mid = (low + high) / 2;
            final int guess = list[mid];
            if (guess == item) {
                return mid;
            }
            if (guess > item) {
                high = mid - 1;

            } else {
                low = mid + 1;
            }
        }
        return -1;

    }

    public int searchString(final String[] list, final String item) {
        Arrays.sort(list);
        int low = 0;
        int high = list.length - 1;
        while (low <= high) {
            final int mid = (low + high) / 2;
            final String guess = list[mid];
            if (guess.equalsIgnoreCase(item)) {
                return mid;
            }
            if (guess.compareTo(item) > 0) {
                high = mid - 1;

            } else {
                low = mid + 1;
            }
        }
        return -1;

    }

    public static void main(final String[] args) {
        final int[] list = new int[] { 1, 3, 5, 7, 9, 11, 13 };

        final String[] names = new String[] { "Tai", "Vi", "Thien", "Tien", "Long", "Dung", "An" };

        final BinarySearch binarySearch = new BinarySearch();

        System.out.println("the value position is " + binarySearch.search(list, 11));

        System.out.println("the value position is " + binarySearch.searchString(names, "Tai"));
    }
}