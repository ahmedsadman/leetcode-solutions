# CodeForces - String Task 118A
# http://codeforces.com/problemset/problem/118/A

vowels = "aeiouy"
userinput = raw_input("")
userinput = userinput.lower()
userinput = userinput.translate(None, vowels) # removes the vowels
new_word = ["."]

for i, char in enumerate(userinput):
	new_word.append(char)
	new_word.append(".")

new_word.pop() # removes the last extra "."
print ''.join(new_word)