#include <iostream>
#include <string>

using namespace std;

int main() {

    string list;
    int CountA;
    int CountB;
    int CountC;
    int CountD;
    int total=0;

    cout << "Please enter list of items => ";
    cin >> list;

    for (int i=0; i<list.size(); ++i) {
        if (list[i] == 'A' || list[i] == 'a') {
            CountA++;
        } else if (list[i] == 'B' || list[i] == 'b') {
            CountB++;
        } else if (list[i] == 'C' || list[i] == 'c') {
            CountC++;
        } else if (list[i] == 'D' || list[i] == 'd') {
            CountD++;
        }
    }

    total += (( CountA%3 ) * 50 ) + (( CountA/3 ) * 130 );
    total += (( CountB%2 ) * 30) + ((CountB/2) * 37);
    total += CountC * 20 + CountD * 10;

    if (CountA%3 == 2){
        cout << "Missing 1 item A to get additional discount." << endl;
    }
    if (CountB%2 == 1){
        cout << "Missing 1 item B to get additional discount." << endl;
    }

    cout << "Total price: " << total;

}
