import user_interface as ui


def importContacts():
    with open("buffer_file.txt") as f:
        data = f.read()
    print(data)
    ui.user_choice()