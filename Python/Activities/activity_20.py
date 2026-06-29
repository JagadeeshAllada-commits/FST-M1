import pandas as pd

data = pd.read_excel("Sample.xlsx")

print(f"No of rows and columns: {data.shape}")

print(f"Data in Email Column: {data['Email']}")

print(f"Sorted first names: {data.sort_values('FirstName')}")