import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Methods {

    public static int trivialSearch(List<Main.Key> list, Main.Key key) {
        int i = 0;
        for (Main.Key x : list) {
            if (x.equals(key)) {
                return i;
            }
            i++;
        }

        return -1;
    }

    public static int binarySearch(List<Main.Key> list, Main.Key key) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            Main.Key midVal = list.get(mid);

            if (midVal.equals(key)) {
                return mid;
            } else if (midVal.lessThan(key)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -(low + 1);
    }
}
