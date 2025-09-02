public class SwapWithoutTemp {
    
    // 1. HOÁN ĐỔI BẰNG PHÉP CỘNG TRỪ
    public static void swapUsingAddSubtract(int[] a, int i, int j) {
        if (i != j && a[i] != a[j]) { // Tránh trường hợp đặc biệt
            a[i] = a[i] + a[j];  // a[i] = tổng
            a[j] = a[i] - a[j];  // a[j] = tổng - a[j] = a[i] cũ
            a[i] = a[i] - a[j];  // a[i] = tổng - a[i] cũ = a[j] cũ
        }
    }
    
    // 2. HOÁN ĐỔI BẰNG PHÉP XOR (Exclusive OR)
    public static void swapUsingXOR(int[] a, int i, int j) {
        if (i != j) { // Quan trọng: tránh XOR với chính nó
            a[i] = a[i] ^ a[j];
            a[j] = a[i] ^ a[j];
            a[i] = a[i] ^ a[j];
        }
    }
    
    // 3. BUBBLE SORT sử dụng hoán đổi cộng trừ
    public static void bubbleSortAddSubtract(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    // Hoán đổi không dùng temp
                    a[j] = a[j] + a[j + 1];
                    a[j + 1] = a[j] - a[j + 1];
                    a[j] = a[j] - a[j + 1];
                }
            }
        }
    }
    
    // 4. BUBBLE SORT sử dụng hoán đổi XOR
    public static void bubbleSortXOR(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    // Hoán đổi bằng XOR
                    a[j] = a[j] ^ a[j + 1];
                    a[j + 1] = a[j] ^ a[j + 1];
                    a[j] = a[j] ^ a[j + 1];
                }
            }
        }
    }
    
    // 5. SELECTION SORT với hoán đổi cộng trừ
    public static void selectionSortAddSubtract(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            // Hoán đổi nếu cần
            if (minIndex != i && a[i] != a[minIndex]) {
                a[i] = a[i] + a[minIndex];
                a[minIndex] = a[i] - a[minIndex];
                a[i] = a[i] - a[minIndex];
            }
        }
    }
    
    // 6. SELECTION SORT với hoán đổi XOR
    public static void selectionSortXOR(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            // Hoán đổi bằng XOR
            if (minIndex != i) {
                a[i] = a[i] ^ a[minIndex];
                a[minIndex] = a[i] ^ a[minIndex];
                a[i] = a[i] ^ a[minIndex];
            }
        }
    }
    
    // Hàm in mảng
    public static void printArray(int[] a) {
        for (int value : a) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
    // Demo và test
    public static void main(String[] args) {
        System.out.println("=== DEMO HOÁN ĐỔI KHÔNG DÙNG TEMP ===\n");
        
        // Test hoán đổi đơn giản
        int[] test = {5, 3};
        System.out.println("Mảng ban đầu: [5, 3]");
        
        // Test cộng trừ
        int[] test1 = test.clone();
        swapUsingAddSubtract(test1, 0, 1);
        System.out.print("Sau hoán đổi cộng trừ: ");
        printArray(test1);
        
        // Test XOR
        int[] test2 = test.clone();
        swapUsingXOR(test2, 0, 1);
        System.out.print("Sau hoán đổi XOR: ");
        printArray(test2);
        
        System.out.println("\n=== DEMO SẮP XẾP KHÔNG DÙNG TEMP ===");
        
        int[] original = {64, 34, 25, 12, 22, 11, 90};
        System.out.print("Mảng gốc: ");
        printArray(original);
        
        // Bubble Sort với cộng trừ
        int[] arr1 = original.clone();
        bubbleSortAddSubtract(arr1);
        System.out.print("Bubble Sort (cộng trừ): ");
        printArray(arr1);
        
        // Bubble Sort với XOR
        int[] arr2 = original.clone();
        bubbleSortXOR(arr2);
        System.out.print("Bubble Sort (XOR): ");
        printArray(arr2);
        
        // Selection Sort với cộng trừ
        int[] arr3 = original.clone();
        selectionSortAddSubtract(arr3);
        System.out.print("Selection Sort (cộng trừ): ");
        printArray(arr3);
        
        // Selection Sort với XOR
        int[] arr4 = original.clone();
        selectionSortXOR(arr4);
        System.out.print("Selection Sort (XOR): ");
        printArray(arr4);
        
        System.out.println("\n=== GIẢI THÍCH CÁCH HOẠT ĐỘNG ===");
        demonstrateSwapLogic();
    }
    
    public static void demonstrateSwapLogic() {
        System.out.println("Ví dụ hoán đổi a=5, b=3:");
        
        System.out.println("\n1. PHƯƠNG PHÁP CỘNG TRỪ:");
        int a = 5, b = 3;
        System.out.println("Ban đầu: a=" + a + ", b=" + b);
        a = a + b;  // a = 8
        System.out.println("Sau a = a + b: a=" + a + ", b=" + b);
        b = a - b;  // b = 8 - 3 = 5
        System.out.println("Sau b = a - b: a=" + a + ", b=" + b);
        a = a - b;  // a = 8 - 5 = 3
        System.out.println("Sau a = a - b: a=" + a + ", b=" + b);
        
        System.out.println("\n2. PHƯƠNG PHÁP XOR:");
        int x = 5, y = 3; // 5 = 101, 3 = 011 trong nhị phân
        System.out.println("Ban đầu: x=" + x + " (101), y=" + y + " (011)");
        x = x ^ y;  // x = 101 ^ 011 = 110 = 6
        System.out.println("Sau x = x ^ y: x=" + x + " (110), y=" + y + " (011)");
        y = x ^ y;  // y = 110 ^ 011 = 101 = 5
        System.out.println("Sau y = x ^ y: x=" + x + " (110), y=" + y + " (101)");
        x = x ^ y;  // x = 110 ^ 101 = 011 = 3
        System.out.println("Sau x = x ^ y: x=" + x + " (011), y=" + y + " (101)");
    }
}