from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net")
    about_us_btn = driver.find_element(By.LINK_TEXT, "About Us")
    about_us_btn.click()
    print(f"About us page titie: {driver.title}" )
