#include <iostream>
#include <algorithm>
using namespace std;

void getInput(int arr[], int size) {
	for (int i = 0; i < size; i++)
		cin >> arr[i];
}

int maxIndex(int arr[], int size) {
	int index;
	index = distance(arr, max_element(arr, arr+size));
	return index;
}

int minIndex(int arr[], int size) {
	int index;
	index = distance(arr, min_element(arr, arr+size));

	for (int i = size; i > 0; i--) {
		if (arr[i] == arr[index]) {
			index = i;
			break;
		}
	}
	return index;
}

void sortBubble(int array[], int size) {
    int temp;
  	for(int j = size; j > 0; j--){
  		temp = array[j];
        array[j] = array[j - 1];
        array[j - 1] = temp;
    }
}

int main() {
	int n;
	int total(0);
	cin >> n;
	int a[n];

	getInput(a, n);
	total += maxIndex(a, n);
	sortBubble(a, maxIndex(a, n));
	total += n - (minIndex(a, n) + 1);
	cout << total << endl;

	return 0;
}
