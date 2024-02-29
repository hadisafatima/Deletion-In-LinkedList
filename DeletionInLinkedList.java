public class DeletionInLinkedList {
        int data ;
        DeletionInLinkedList next ;

    public DeletionInLinkedList(int data) {
        this.data = data;
    }
    DeletionInLinkedList delete(DeletionInLinkedList start, int x){
        if (start == null || start.data > x){
            return start ; // this will return the whole original list
        }
        if (start.data == x){
            return start.next ; // this statement will eliminate the first element of linkedList and will make the second element the new head of the list
        }
        for (DeletionInLinkedList p = start ; p.next != null ; p = p.next){
            if (p.next.data > x){
                break;
            }
            if (p.next.data == x){
                p.next = p.next.next ;
                break;
            }
        }
        return start;

    }

    public static void main(String[] args) {
        DeletionInLinkedList deletion = new DeletionInLinkedList(7);
        deletion.next = new DeletionInLinkedList(8);
        deletion.next.next = new DeletionInLinkedList(9) ;

        System.out.println("Original list");
        // we have to put list != null and not list.next != null bcuz otherwise the last element of te list will not be printed
        for (DeletionInLinkedList list = deletion ; list != null ; list = list.next){
            System.out.println(list.data);
        }
        System.out.println("list after deletion");
        for (DeletionInLinkedList list2 = deletion.delete(deletion ,8) ; list2 != null ; list2 = list2.next){
            System.out.println(list2.data);
        }
    }
}
