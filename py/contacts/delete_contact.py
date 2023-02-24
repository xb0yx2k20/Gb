import user_interface as ui

def deleteContact():
    fl = 0
    surname = input("Surname: ")
    with open('buffer_file.txt') as f:
        buff = f.readlines()
    for s in buff:
        if surname in s.split():
            buff.remove(s)
            fl = 1
            print("Contact successfully deleted")
    with open('export.txt', 'w') as f:
        f.writelines(buff)
    if fl == 0:
        print("Contact not found")
    ui.user_choice()
