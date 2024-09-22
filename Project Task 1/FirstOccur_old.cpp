#include <iostream>
using namespace std;

int FirstOccur(int arr[], int key, int index, int n) {
    if (index == n) { 
        return -1;
    }
    if (arr[index] == key) { 
        return index;
    }
    return FirstOccur(arr, key, index + 1, n);
}

int main() {
    int n;
    cout << "Enter the number of elements: ";
    cin >> n;
    
    int arr[n];
    cout << "Enter " << n << " integers:" << endl;
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }
    
    int key;
    cout << "Enter the key to find: ";
    cin >> key;
    
    int result = FirstOccur(arr, key, 0, n);
    
    if (result != -1) {
        cout << "First occurrence of key " << key << " is at index: " << result << endl;
    } else {
        cout << "Key " << key << " not found in the array." << endl;
    }

    return 0;
}
