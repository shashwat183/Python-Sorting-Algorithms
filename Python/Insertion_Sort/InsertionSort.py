import sys

arr = sys.argv[1].split(',')
arr = [int(i) for i in arr]

n = len(arr)

for i in range(1,n):
    for j in range(i+1):
        if(arr[j]>arr[i]):
            