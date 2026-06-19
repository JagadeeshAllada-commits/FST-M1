no_OfElements = int(input("Enter the number of elements in the list: "))

li = []
for i in range(no_OfElements):
    element = int(input(f"Enter element {i+1}: "))
    li.append(element)

first_number = li[0]
last_number = li[len(li)-1]

print(f"The first number in the list is {first_number}")
print(f"The last number in the list is {last_number}")

if(first_number == last_number):
    print(f"The first number {first_number} is equal to the last number {last_number}")
else:
    print(f"The first number {first_number} is not equal to the last number {last_number}")