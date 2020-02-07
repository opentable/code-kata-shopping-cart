# CODE-KATA-Shopping-Cart
Program is written in order to count total for all items bought in the supermarket including any discounts that are applicable.

## Input
Firstly, user input string of items that were bought. I have made it possible to input with lowercase.
```C++
cout << "Please enter list of items => ";
cin >> list;
```
# Counting items
The next step is to count how many items of each type are in the list
```C++
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
```

# Determine discounts & Counting total
Applying discount for every 3 A items, and every 2 B items. Counting total
```C++
total += (( CountA%3 ) * 50 ) + (( CountA/3 ) * 130 );
total += (( CountB%2 ) * 30) + ((CountB/2) * 37);
total += CountC * 20 + CountD * 10;
```

# Suggestions
I have added an additional feature. It shows up a message if 1 item is missing in order to get a discount, so customer would be informed. This may increase sales.
```C++
if (CountA%3 == 2){
   cout << "Missing 1 item A to get additional discount." << endl;
}
if (CountB%2 == 1){
   cout << "Missing 1 item B to get additional discount." << endl;
}
```

# Total
The final step is to output the total amount that should be paid to the terminal
```C++
cout << "Total price: " << total;
```
