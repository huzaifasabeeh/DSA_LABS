package DSA_LABS_TASK;
// Quick Sort Implementation for Bank Accounts
import java.util.Random;
public class Lab5_HomeTask1 {
    public static void main(String[] args) {
        int n = 10; // Number of accounts
        int[] balances = new int[n];
        int[] accountNumbers = new int[n];

        // Initialize account numbers and balances
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            accountNumbers[i] = 1000 + i; // Example account numbers
            balances[i] = random.nextInt(100001); // Random balances from 0 to 100,000
        }

        // Print initial accounts
        System.out.println("Initial Accounts:");
        printAccounts(accountNumbers, balances);

        // Sort using Quick Sort
        quickSort(accountNumbers, balances, 0, n - 1);

        // Print sorted accounts
        System.out.println("\nAccounts Sorted by Balance (Descending):");
        printAccounts(accountNumbers, balances);
    }

    public static void quickSort(int[] accountNumbers, int[] balances, int low, int high) {
        if (low < high) {
            int pi = partition(accountNumbers, balances, low, high);

            // Recursively sort partitions
            quickSort(accountNumbers, balances, low, pi - 1);
            quickSort(accountNumbers, balances, pi + 1, high);
        }
    }

    public static int partition(int[] accountNumbers, int[] balances, int low, int high) {
        int pivot = balances[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (balances[j] > pivot) { // Descending order
                i++;
                swap(balances, i, j);
                swap(accountNumbers, i, j);
            }
        }
        swap(balances, i + 1, high);
        swap(accountNumbers, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printAccounts(int[] accountNumbers, int[] balances) {
        for (int i = 0; i < accountNumbers.length; i++) {
            System.out.println("Account No. " + accountNumbers[i] + " - Balance: " + balances[i]);
        }
    }
}
