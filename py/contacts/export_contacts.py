import user_interface as ui
import json
import csv
import vobject

def exportContacts():
    print("\n Choose file format for export:"
          "\n\t a) .txt"
          "\n\t b) .csv"
          "\n\t c) .json"
          "\n\t d) .vcf")
    with open('buffer_file.txt') as f:
        data = f.readlines()
        n = input()
        match n:
            case "a":
                with open("exported_files/export.txt", "w") as expFile:
                    expFile.write(''.join(data))
            case "b":
                with open("exported_files/export.csv", "w", newline='') as expFile:
                    writer = csv.writer(expFile, delimiter=';')
                    for line in data:
                        fields = line.strip().split()
                        writer.writerow(fields)
            case "c":
                contacts = []
                for line in data:
                    fields = line.strip().split()
                    contact = {
                        "Name": fields[0],
                        "Surname": fields[1],
                        "Phone number": fields[2]
                    }
                    contacts.append(contact)
                with open("exported_files/export.json", "w") as expFile:
                    json.dump(contacts, expFile, indent=4)
            case "d":
                with open("exported_files/export.vcf", "w") as expFile:
                    for line in data:
                        fields = line.strip().split()
                        contact = vobject.vCard()
                        contact.add('fn')
                        contact.fn.value = f"{fields[0]} {fields[1]}"
                        contact.add('n')
                        contact.n.value = vobject.vcard.Name(family=fields[0], given=fields[1])
                        contact.add('tel')
                        contact.tel.value = fields[2]
                        expFile.write(contact.serialize())
                        expFile.write('\n')
        ui.user_choice()
