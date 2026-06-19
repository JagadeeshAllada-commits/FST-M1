li = []
no_OfElements = int(input("Enter the number of elements in the list: "))
for i in range(no_OfElements):
    element = int(input(f"Enter element {i+1}: "))
    li.append(element)

tup = tuple(li)

for element in tup:
    if element%5 == 0:
        print(element)
