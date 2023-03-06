from termcolor import colored
import user_interface as ui

def changeContact():
    fl = 0
    ans1 = input("Surname: ")
    with open("buffer_file.txt") as f:
        data = f.readlines()
        
    for i in range(len(data)):
        if ans1 in data[i].split():
            fl = 1
            print(colored("Contact found: ", "green"),  colored(data[i], "green"))

            ans2 = input("What to change?"
                  "\n\t I. Name & Surname"
                  "\n\t II. Phone number \n")
            if ans2 == "I" or ans2 == "1":
                name, surname = input("Name: "), input("Surname: ")
                contact_data = data[i].split()
                contact_data[0], contact_data[1] = name, surname
                data[i] = ' '.join(contact_data) + '\n'
            elif ans2 == "II" or ans2 == "2":
                num = input("Phone number: ")
                contact_data = data[i].split()
                contact_data[2] = num
                data[i] = ' '.join(contact_data) + '\n'

    if fl == 1:
        print(colored("Contact successfully changed!", "green"))
        with open("buffer_file.txt", "w") as f:
            f.writelines(data)
    else:
        print(colored("Contact not found", "red"))
    ui.user_choice()
