import add_contact
import delete_contact
import export_contacts
import import_contacts
import change_contact

def handle_num(n):
    match n:
        case 1:
            add_contact.addContact()
        case 2:
            delete_contact.deleteContact()
        case 3:
            export_contacts.exportContacts()
        case 4:
            import_contacts.importContacts()
        case 5:
            change_contact.changeContact()
        case 6:
            exit()