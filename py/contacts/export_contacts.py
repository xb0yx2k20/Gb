import user_interface as ui
import json
import csv

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
                        "first_name": fields[0],
                        "last_name": fields[1],
                        "phone_number": fields[2]
                    }
                    contacts.append(contact)
                with open("exported_files/export.json", "w") as expFile:
                    json.dump(contacts, expFile, indent=4)
            
