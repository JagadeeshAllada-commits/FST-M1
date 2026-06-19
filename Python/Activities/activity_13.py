li= []

no_OfElements = int(input("Enter the number of elements in the list: "))
for i in range(no_OfElements):
    element = int(input(f"Enter element {i+1}: "))
    li.append(element)

print(f"The entered list is: {li}")

def calculateSum(num):
    sum = 0
    for i in range(len(li)):
        sum += li[i]
    return sum

result = calculateSum(li)
print(f"The sum of the elements in the list is: {result}")