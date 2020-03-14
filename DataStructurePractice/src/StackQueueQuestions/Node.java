package StackQueueQuestions;
class Node
{
    int key, value;
    Node next, pre;

    Node(int key, int value)
    {
        this.key = key;
        this.value = value;
        next = pre = null;
    }
}