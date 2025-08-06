import java.util.Arrays;

class e1 {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println("Majority Element : " + majority_Element(arr));

    }

    static int majority_Element(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);
        int count = 1;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
                if (count > n / 2)
                    return arr[i];
                continue;

            }
            count = 1;

        }

        return arr[0];

    }

}
