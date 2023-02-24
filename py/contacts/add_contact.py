import user_interface as ui

def addContact():
    name = input("Name: ")
    surname = input("Surname: ")
    phoneNumber = input("Phone number: ")

    with open('buffer_file.txt', 'a') as f:
        f.write("\n" + name + " " + surname + " " + phoneNumber)
    print("Contact added succefull")
    ui.user_choice()