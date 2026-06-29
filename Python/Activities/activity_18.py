import pandas as pd

data = pd.read_csv("sample.csv")

print("---------USER NAMES-----------")
print(data["Usernames"])

print("---------USER NAMES WITH THIER PASSWORDS--------")
print(data["Usernames"][1], data["Passwords"][1])

sorted_usernames = data.sort_values("Usernames")
sorted_passwords = data.sort_values("Passwords")

print("---------SORTED USERNAMES------------")
print(sorted_usernames["Usernames"])

print("---------SORTED PASSWORDS----------")
print(sorted_passwords["Passwords"])