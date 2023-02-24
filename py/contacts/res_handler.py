import add_contact
import delete_contact
import export_contacts

def handle_num(n):
    match n:
        case 1:
            add_contact.addContact()
        case 2:
            delete_contact.deleteContact()
        case 3:
            export_contacts.exportContacts()
        case 4:

            print("qwe4")
        case 5:
            exit()