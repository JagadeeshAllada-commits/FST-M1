first_list = [4,3,45,223,24,23]
second_list = [1,3,76,4,4,6663,33,23]

new_list = []

for element in first_list:
    if element%2 != 0:
        new_list.append(element)

for element in second_list:
    if element%2 == 0:
        new_list.append(element)

print(new_list)