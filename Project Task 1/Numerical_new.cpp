#include <iostream>
#include <cmath>
using namespace std;

// Define the function
float function(float x) {
    return (pow(x, 2) - x - 2);  // f(x) = x^2 - x - 2
}

int main() {
    // Declare variables for the initial guesses
    float x1, x2, x0;  
    cout << "Enter the initial guesses x1 and x2: " << endl;
    cin >> x1 >> x2;  // Input the two initial guesses
    
    // Input the number of iterations
    int maxIterations;
    cout << "Enter the number of iterations: ";
    cin >> maxIterations;  

    int i = 1;  // Initialize iteration counter

    // Secant Method loop
    while (i <= maxIterations) {
        // Calculate the new approximation
        x0 = x1 - ((function(x1) * (x2 - x1))/
                (function(x2) - function(x1)));
        
        // Check if the approximation is the root
        if (function(x0) == 0) {
            break;  // If the root is found
        }

        // Update the guesses
        else if (function(x0) * function(x1) < 0) {
            x2 = x0;  // Replace x2, root lies between x1 and x0
        } else {
            x1 = x0;  // Replace x1, root lies between x0 and x2
        }

        // Output the current iteration
        cout << "Iteration " << i << " = " << x0 << endl;

        i++;
    }

    // Output the final approximation
    cout << "The approximate root is: " << x0 << endl;

    return 0;
}
