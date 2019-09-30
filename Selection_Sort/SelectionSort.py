import sys

arr = sys.argv[1].split(',')
arr = [int(i) for i in arr]

n = len(arr)

for i in range(n):
    min_index = i
    j = i + 1
    while j<n:
        if (arr[j]<arr[min_index]):
            min_index = j
        j=j+1
    temp = arr[i]
    arr[i] = arr[min_index]
    arr[min_index] = temp 
    i=i+1

print(arr)