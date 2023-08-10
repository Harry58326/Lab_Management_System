public class StudentLinkedList {
    private Student head; // Reference to the head of the linked list

    public void addStudent(Student s) {
        if (head == null) {
            head = s;
            return;
        }
        Student pointer = head;
        while (pointer.next != null) {
            pointer = pointer.next; // Move to the next element
        }
        pointer.next = s; // Add the student to the end of the list
    }

    public void listStudent() {
        if (head == null) {
            System.out.println("The linked list is empty");
            return;
        }
        Student pointer = head;
        while (pointer != null) {
            System.out.println(pointer); // Print the current element
            pointer = pointer.next; // Move to the next element
        }
    }
}
