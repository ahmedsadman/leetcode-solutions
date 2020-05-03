#include <iostream>
using namespace std;

int main() {
	int n;
	cin >> n;
	int in, counter(0), counter2(0);
	int check(0);

	for (int i = 0; i < n; i++) {
		cin >> in;
		//cout << i << " for input " << in << endl;
		if (in >= check) {
			//cout << "check: " << check;
			counter++;
			check = in;
			//cout << " " << check << " counter: " << counter << endl;
			if (counter > counter2)
				counter2 = counter;
		}
		else {
			//cout << "counter reset: " << counter << endl;
            counter = 1;
			check = in;
		}
	}
	cout << counter2 << endl;
	return 0;
}
