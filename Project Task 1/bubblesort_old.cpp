#include<iostream>
using namespace std;

void bubblesort(int arr[], int n)  {
    for(int i=0; i<n-1; i++) {
        bool swaptest = false;
        for(int j=0; j<n-i-1; j++) {
            if(arr[j] > arr[j+1]) {
                swap(arr[j], arr[j+1]);
                swaptest = true;
            }
        }

        if(!swaptest) {
            return;
        }
    }
}
int main() {
    int arr[5] = {2, 4, 5, 3, 1};
    bubblesort(arr, 5);
    for(int i=0; i<5; i++) {
        cout << arr[i] << " ";
    }
}