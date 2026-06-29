import pytest

@pytest.fixture
def list_fixture():
    li = [1,2,3,4,5,6,7,8,9,10]
    return li

@pytest.fixture
def wallet():
    amount = 0
    return amount