user_1 = input("Enter your name: ")
user_2 = input("Enter your friend's name: ")


wants_to_play_again = "yes"

while wants_to_play_again == "yes":
    user_1_option = input(f"Hey {user_1}, Select Rock, Paper, or Scissors: ").lower()
    user_2_option = input(f"Hey {user_2}, Select Rock, Paper, or Scissors: ").lower()

    if user_1_option == user_2_option:
        print("It's a tie!")
    elif user_1_option == "rock":
        if user_2_option == "scissors":
            print(f"{user_1} wins! as Rock beats Scissors.")
        else:
            print(f"{user_2} wins! as Paper beats Rock.")

    elif user_1_option == "paper":
        if user_2_option == "rock":
            print(f"{user_1} wins! as Paper beats Rock.")
        else:
            print(f"{user_2} wins! as Scissors beats Paper.")

    elif user_1_option == "scissors":
        if user_2_option == "paper":
            print(f"{user_1} wins! as Scissors beats Paper.")
        else:
            print(f"{user_2} wins! as Rock beats Scissors.")

    wants_to_play_again = input("Do you want to play again? (yes/no): ").lower()