import json

class NoteManager:
    def __init__(self, file_path):
        self.file_path = file_path
        self.load_notes()

    def create_note(self, title, content):
        note = {"title": title, "content": content}
        self.notes.append(note)
        self.save_notes()
        print("Note created successfully!")

    def read_notes(self):
        if not self.notes:
            print("No notes found.")
        else:
            for i, note in enumerate(self.notes, start=1):
                print(f"{i}. {note['title']}")

    def edit_note(self, note_index, new_title, new_content):
        if 0 <= note_index < len(self.notes):
            note = self.notes[note_index]
            note["title"] = new_title
            note["content"] = new_content
            self.save_notes()
            print("Note edited successfully!")
        else:
            print("Invalid note index.")

    def delete_note(self, note_index):
        if 0 <= note_index < len(self.notes):
            del self.notes[note_index]
            self.save_notes()
            print("Note deleted successfully!")
        else:
            print("Invalid note index.")

    def save_notes(self):
        with open(self.file_path, "w") as file:
            json.dump(self.notes, file)

    def load_notes(self):
        try:
            with open(self.file_path, "r") as file:
                self.notes = json.load(file)
        except FileNotFoundError:
            self.notes = []

def main():
    note_manager = NoteManager("notes.json")

    while True:
        print("1. Create a note")
        print("2. Read notes")
        print("3. Edit a note")
        print("4. Delete a note")
        print("5. Exit")

        choice = input("Enter your choice: ")

        if choice == "1":
            title = input("Enter note title: ")
            content = input("Enter note content: ")
            note_manager.create_note(title, content)
        elif choice == "2":
            note_manager.read_notes()
        elif choice == "3":
            note_index = int(input("Enter the index of the note to edit: ")) - 1
            new_title = input("Enter new title: ")
            new_content = input("Enter new content: ")
            note_manager.edit_note(note_index, new_title, new_content)
        elif choice == "4":
            note_index = int(input("Enter the index of the note to delete: ")) - 1
            note_manager.delete_note(note_index)
        elif choice == "5":
            break
        else:
            print("Invalid choice. Please try again.")

if __name__ == "__main__":
    main()