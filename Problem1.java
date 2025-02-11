//TC: O(1)
//SC: O(n)
class PhoneDirectory {
    Queue<Integer> q = new LinkedList<>();
    HashSet<Integer> set = new HashSet<>();
    public PhoneDirectory(int maxNumbers) {
        for(int i=0;i<maxNumbers;i++)
        {
            q.add(i);
        }
    }

    public int get() {
        if(q.isEmpty())
        {
            return -1;
        }
        int result=q.poll();
        set.add(result);
        return result;

    }

    public boolean check(int number) {
        if(set.contains(number))
        {
            return false;
        }
        return true;
    }

    public void release(int number) {
        if(set.contains(number))
        {
            set.remove(number);
            q.add(number);
        }
    }
}