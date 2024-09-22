#include<iostream>
using namespace std;

void selectionsort(int arr[], int n) {
    for(int i=0; i<n-1; i++) {

        int min_index = i;
        for(int j=i+1; j<n; j++) {
            if(arr[j] < arr[min_index]) {
                min_index = j;
            }
        }

        if(min_index != i) {
            swap(arr[i], arr[min_index]);
        }
    }
}

int main() {
    int arr[5] = {2, 3, 5, 1, 4};
    selectionsort(arr, 5);
    for(int i=0; i<5; i++) {
        cout << arr[i] << " ";
    }
}