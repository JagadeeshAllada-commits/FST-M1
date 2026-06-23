from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/login-form")
    print(f"Title of the page is {driver.title}")

    user_name = driver.find_element(By.ID, "username")
    password = driver.find_element(By.ID, "password")
    click_btn = driver.find_element(By.XPATH, "//button[text()='Submit']")

    user_name.send_keys("admin")
    password.send_keys("password")
    click_btn.click()