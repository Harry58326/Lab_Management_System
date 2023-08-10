public class HashTable {
    public StudentLinkedList[] arr;
    public int size;


    public HashTable(int size) {
        this.size = size;
        arr = new StudentLinkedList[size];
        for (int i = 0; i < size; i++) {
            arr[i] = new StudentLinkedList();
        }
    }

    public void add (Student s) {
        int position = hashCode(s);
        arr[position].addStudent(s);
    }


    public void list (){
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("This is" + i + "linked list");
            arr[i].listStudent();
        }
    }


    public int hashCode (Student s){
        return s.studentID % size;
    }
}
