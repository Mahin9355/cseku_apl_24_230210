#include <iostream>
using namespace std;

int BinSearch(int arr[], int n, int key) {
    int start = 0, end = n - 1;
    while (start <= end) {
        int mid = start + (end - start) / 2;
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] < key) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    return -1;
}

int main() {
    int arr[10];
    
    cout << "Enter 10 integers (sorted): " << endl;
    for (int i = 0; i < 10; i++) {
        cin >> arr[i];
    }
    
    cout << "Enter key to search: ";
    int key;
    cin >> key;
    
    // Perform binary search
    int result = BinSearch(arr, 10, key);
    
    if (result != -1) {
        cout << "Index number is: " << result << endl;
    } else {
        cout << "Key not found in the array." << endl;
    }

    return 0;
}
