package datastructure.linkedlist;

public class GenericLinkedList<T> {
    private int size = 0;
    private Node<T> head;
    private Node<T> rear;

    public int getSize(){ return size;}

    private static class Node<T>{
        private Node<T> next;
        private Node<T> prev;
        private T data;
    }

    public void addFirst(T element){
        Node<T> node = new Node<>();
        node.data = element;
        if(size==0){
            rear = node;
            head = node;
        }else{
            head.prev = node;
            node.next = head;
            head = node;
        }
        size++;
    }

    public void addLast(T element){
        Node<T> node = new Node<>();
        node.data = element;
        if(size==0){
            head = node;
            rear = node;
        }else{
            rear.next = node;
            node.prev = rear;
            rear = node;
        }
        size++;
    }

    public T removeFirst(){
        if(size==0){
            System.out.println("the list is empty");
            return null;
        }
        T element = head.data;
        if(head.next!=null){
            head = head.next;
            head.prev=null;
        }else {
            head=null;
        }
        size--;
        if(size==0){
            rear=null;
        }
        return element;
    }

    public T removeLast(){
        if(size==0){
            System.out.println("the list is empty");
            return null;
        }
        T element = rear.data;
        if(rear.prev!=null){
            rear = rear.prev;
            rear.next=null;
        }else{
            rear=null;
        }
        size--;
        if(size==0){
           head = null;
        }
        return element;
    }

    public boolean contains(T element){
        Node<T> nodeToCheck = head;
        for(int i=0;i<size;i++){
            if(nodeToCheck.data.equals(element)){
                return true;
            }
            nodeToCheck=nodeToCheck.next;
        }
        return false;
    }

    public static void main(String[] args) {
        GenericLinkedList<String> list = new GenericLinkedList<>();

        // 1. 리스트에 하나의 요소만 추가 후 삭제하는 테스트
        list.addFirst("A");
        System.out.println("Removed: " + list.removeFirst()); // 기대값: "A"
        System.out.println("List size after removal: " + list.getSize()); // 기대값: 0
        System.out.println("Removing from empty list: " + list.removeFirst()); // 기대값: "The list is empty"

        // 2. 여러 개 추가 후 연속 삭제 테스트
        list.addFirst("X");
        list.addFirst("Y");
        list.addFirst("Z");
        System.out.println("Removed: " + list.removeLast()); // 기대값: "X"
        System.out.println("Removed: " + list.removeLast()); // 기대값: "Y"
        System.out.println("Removed: " + list.removeLast()); // 기대값: "Z"
        System.out.println("Removing from empty list: " + list.removeLast()); // 기대값: "The list is empty"

        // 3. 엣지 케이스: 빈 리스트에서 `removeLast()` 연속 호출
        System.out.println("Extra remove attempt: " + list.removeLast()); // 기대값: "The list is empty"

        // 4
        list.addFirst("Single");
        System.out.println("Removed: " + list.removeLast()); // 기대값: "Single"
        System.out.println("List size after removal: " + list.getSize()); // 기대값: 0
        System.out.println("Head should be null: " + (list.head == null)); // 기대값: true
        System.out.println("Rear should be null: " + (list.rear == null)); // 기대값: true

        //5
        list.addFirst("OnlyOne");
        System.out.println("Removed: " + list.removeFirst()); // 기대값: "OnlyOne"
        System.out.println("List size after removal: " + list.getSize()); // 기대값: 0
        System.out.println("Head should be null: " + (list.head == null)); // 기대값: true
        System.out.println("Rear should be null: " + (list.rear == null)); // 기대값: true

        //6
        list.addFirst("1");
        list.addLast("2");
        list.addFirst("0");
        list.addLast("3");
        System.out.println("Removed: " + list.removeFirst()); // 기대값: "0"
        System.out.println("Removed: " + list.removeLast()); // 기대값: "3"
        System.out.println("Removed: " + list.removeFirst()); // 기대값: "1"
        System.out.println("Removed: " + list.removeLast()); // 기대값: "2"
        System.out.println("List should be empty now: " + list.getSize()); // 기대값: 0

        //7
        System.out.println(list.contains("X")); // 기대값: false (빈 리스트에서도 오류 없이 실행)
        list.addFirst("A");
        System.out.println(list.contains("A")); // 기대값: true
        System.out.println(list.contains("B")); // 기대값: false
    }




}
