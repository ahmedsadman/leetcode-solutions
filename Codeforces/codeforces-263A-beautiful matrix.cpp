// Codeforces 263A Beautiful Matrix
#include <iostream>
using namespace std;

int main() {
	int row, column, i, j, x;
	int steps = 0;

	for (i = 0; i < 5; i++) {
		for (j = 0; j < 5; j++) {
			cin >> x;
			if (x == 1) {
				row = i+1;
				column = j+1;
			}
		}
	}
	//cout << row << " " << column << endl;
	steps += (row >= 3 ? row - 3 : 3 - row);
	steps += (column >= 3 ? column - 3: 3 - column);
	cout << steps << endl;
}
