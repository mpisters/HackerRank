# Enter your code here. Read input from STDIN. Print output to STDOUT
import re
total = int(input())

lines = []
for i in range(total):
    line = input()
    lines.append(line)

words_total = int(input())

words = []
for j in range(words_total):
    word = input()
    words.append(word)

for word in words:
    total = 0
    for line in lines:
        matches = re.findall(r'\b{}\b'.format(word), line)
        total +=len(matches)
    print(total)
