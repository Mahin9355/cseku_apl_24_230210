#include <iostream>
using namespace std;

// Function to perform binary search
int binarySearch(int arr[], int size, int key) {
    // Define the search boundaries
    int left = 0;
    int right = size - 1;
    
    // Continue searching
    while (left <= right) {
        // Calculate the middle index
        int middle = left + (right - left) / 2;

        // Check if the middle element is the key
        if (arr[middle] == key) {
            return middle;  // Return the index if key is found
        }

        // if the key is greater than middle element
        else if (arr[middle] < key) {
            left = middle + 1;
        }

        // if the key is smaller than middle elemet
        else {
            right = middle - 1;
        }
    }
    
    return -1;  // if the key is not found
}

int main() {
    int arr[10];  // Declare of the array

    cout << "Enter elements(sorted): " << endl;
    for (int i = 0; i < 10; i++) {
        cin >> arr[i];
    }
    
    // input the element to search
    cout << "Enter the key to search: ";
    int key;
    cin >> key;

    // Binary search on the array
    int result = binarySearch(arr, 10, key);
    
    // Output the result of the binary search
    if (result != -1) {
        cout << "The key " << key << " is found at index: " << result << endl;
    } else {
        cout << "The key " << key << " is not found in the array." << endl;
    }

    return 0;
}
