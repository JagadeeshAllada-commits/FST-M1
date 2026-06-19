fruit_shop = {
    "apple": 2.5,
    "banana": 1.2,
    "orange": 1.8,
    "grapes": 3.0,
}

fr = input("Which fruit would you like to buy? ")
fruit = fr.lower()
if fruit in fruit_shop:
    price = fruit_shop[fruit]
    print(f"The price of {fruit} is ${price:.2f}")
else:
    print(f"Sorry, we don't have {fruit} in our shop.")