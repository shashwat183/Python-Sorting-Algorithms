import sys

arr = sys.argv[1].split(',')
arr = [int(i) for i in arr]

n = len(arr)

swap = 1

while swap==1:
    swap = 0
    for i in range(n-1):
        if(arr[i]>arr[i+1]):
            temp = arr[i]
            arr[i] = arr[i+1]
            arr[i+1] = temp
            swap = 1

print(arr)