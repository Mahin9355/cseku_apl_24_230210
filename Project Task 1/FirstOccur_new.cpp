#include <iostream>
using namespace std;

// find the first occurrence of a key in an array
int findFirstOccurrence(int arr[], int key, int currentIndex, int size) {
    // Base case
    if (currentIndex == size) { 
        return -1;
    }

    // If the key is found
    if (arr[currentIndex] == key) { 
        return currentIndex;
    }

    // Recursive call to check the next element
    return findFirstOccurrence(arr, key, currentIndex + 1, size);
}

int main() {
    int arraySize;
    // input the size of the array
    cout << "Enter the number of elements: ";
    cin >> arraySize;
    
    // Declare an array
    int arr[arraySize];
    
    // Input the elements of the array
    cout << "Enter " << arraySize << " integers:" << endl;
    for (int i = 0; i < arraySize; i++) {
        cin >> arr[i];
    }
    
    // Input the key to search for
    int key;
    cout << "Enter the key to find: ";
    cin >> key;
    
    //function call to find the first occurrence of the key
    int result = findFirstOccurrence(arr, key, 0, arraySize);
    
    // Output the result
    if (result != -1) {
        cout << "First occurrence of key " << key << " is at index: " << result << endl;
    } else {
        cout << "Key " << key << " not found in the array." << endl;
    }

    return 0;
}
