import random #Maybe needed for random generation

#sorts in decending order 
def bubbleSort(array):
    for i in range(0, len(array)-1):
        for j in range(0, len(array)-i-1):
            if array[j]<array[j+1]:
                array[j], array[j+1] = array[j+1], array[j]
    return array
test = [12,3,5]
#for x in range(49):
#    test[x] = random.randrange(0, 100, 1)
print(test)
print(bubbleSort(test))