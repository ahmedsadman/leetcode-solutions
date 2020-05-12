/*
PRE-REQUISITE:
XOR of zero and a bit results in that bit
0⊕x=x

XOR of one and a bit flips that bit
1⊕x=1−x

Algo (using bitmask):
There are many ways construct bit mask, one simple:

- Compute bit length of the input number l = [log2num]+1.
- Compute 1-bits bitmask of length l: bitmask=(1<<l)−1.
- Return num ^ bitmask.

Bit mask example:
00000101 -> bit length = 3
00001000 -> 1 << 3 (1 bit followed by 3 zeros)
00000111 -> (1 << 3) - 1 (finlal bitmask)

Solution example:
00000101 -> num
00000111 -> bitmask
00000010 -> final result after num ^ bitmask (XOR operation)
*/

class Solution {
    public int findComplement(int num) {
        // n is length of num in binary representation
        int n = (int) (Math.log(num) / Math.log(2)) + 1;

        int bitmask = (1 << n) - 1;
        return num ^ bitmask;
    }
}