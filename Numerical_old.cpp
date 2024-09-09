#include<iostream>
#include<math.h>
using namespace std;

float f(float x) {
    return (pow(x, 2) - x - 2);
}

int main() {
    float x1, x2, x0;
    cout << "Enter x1 and X2: " << endl;
    cin >> x1 >> x2;
    int n;
    cout << "Enter number of iteration: ";
    cin >> n;
    int i=1;
    while(i<=n) {
        x0 = x1-((f(x1)*(x2-x1))/(f(x2)-f(x1)));
        if(f(x0) == 0) {
            break;
        } else if(f(x0)*f(x1) < 0) {
            x2 = x0;
        } else {
            x1 = x0;
        }
        cout<< "Iteration"<< i <<"="<<x0<<endl;
        i++;
    }

    cout << "answer: " << x0 << endl;
}