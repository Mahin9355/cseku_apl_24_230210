#include <iostream>
using namespace std;

// Function to perform bubble sort
void bubbleSort(int arr[], int size) {
    // Outer loop for each elements through the array
    for (int i = 0; i < size - 1; i++) {
        bool swapped = false;  // for tracking the swap

        // Inner loop to compare adjacent elements
        for (int j = 0; j < size - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                // Swap the elements
                swap(arr[j], arr[j + 1]);
                swapped = true;  // track the swap
            }
        }

        // If no swaps were made
        if (!swapped) {
            break;  // Exit, the array is sorted
        }
    }
}

int main() {
    int arr[5] = {2, 4, 5, 3, 1};  // Initialize the array
    
    // Call bubbleSort to sort
    bubbleSort(arr, 5);
    
    // Print the sorted array
    cout << "Sorted array: ";
    for (int i = 0; i < 5; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
    
    return 0;
}
