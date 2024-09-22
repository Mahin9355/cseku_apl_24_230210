#include <iostream>
using namespace std;

// Function to perform Selection Sort
void selectionSort(int arr[], int size) {
    // Traverse through all elements of the array
    for (int i = 0; i < size - 1; i++) {
        int minIndex = i;  // Assume the current element is the minimum

        // Find the minimum element in the unsorted portion
        for (int j = i + 1; j < size; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;  // Update minIndex
            }
        }

        // Swap the found minimum element with the first unsorted element
        if (minIndex != i) {
            swap(arr[i], arr[minIndex]);
        }
    }
}

int main() {
    int arr[5] = {2, 3, 5, 1, 4};  // Initialize the array

    //function call to sort the array
    selectionSort(arr, 5);

    // Print the sorted array
    cout << "Sorted array: ";
    for (int i = 0; i < 5; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;

    return 0;
}
