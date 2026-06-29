import pytest

def test_addition():
    num1 = 5
    num2 = 7

    add = num1+num2

    assert add == 12

def test_substraction():
    num1= 10
    num2 = 7

    sub = num1-num2

    assert sub == 3

@pytest.mark.activity
def test_multiply():
    num1 = 5
    num2 = 5

    mul = num1*num2

    assert mul == 25

@pytest.mark.activity
def test_quotient ():
    num1 = 15
    num2 = 5

    quotient = num1/num2

    assert quotient == 3