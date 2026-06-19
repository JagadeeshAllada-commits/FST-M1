entered_list = []

li = int(input("Enter the number of elements you want to add in the list: "))
for i in range(li):
    element = int(input("Enter an element: "))
    entered_list.append(element)
print(f"The entered list is: {entered_list}")