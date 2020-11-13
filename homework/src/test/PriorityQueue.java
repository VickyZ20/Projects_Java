package test;

import java.util.ArrayList;

public class PriorityQueue<T extends Comparable> {
    private ArrayList<T> pq = new ArrayList<>();
    private T obj;

    //default constructor
    public PriorityQueue() {}

    public PriorityQueue(T[] obj) {
        for (int i = 0; i < obj.length; i++) {
            add(obj[i]);
        }
    }

    public void add(T newItem) {
        pq.add(newItem);
        int curIdx = pq.size() - 1;

        while (curIdx > 0) {
            int maxIdx = (curIdx - 1) / 2;
            if (pq.get(curIdx).compareTo(pq.get(maxIdx)) > 0) {
                T t = pq.get(curIdx);
                pq.set(curIdx, pq.get(maxIdx));
                pq.set(maxIdx, t);

            } else {
                break;
            }
            curIdx = maxIdx;
        }
    }
    public T peek() {
        if (pq.size() == 0) {
            return null;
        }
        return remove();
    }

    public T remove() {
        if (pq.size() == 0) {
            return null;
        }
        T removeObj = pq.get(0);
        pq.set(0, pq.get(pq.size() - 1));

        int curIdx = 0;
        while (curIdx < pq.size()) {
            int left = curIdx * 2 + 1;
            int right = curIdx * 2 + 2;
            if (left >= pq.size()) {
                break;
            }
            int maxIdx = left;
            if (right < pq.size()) {
                if (pq.get(maxIdx).compareTo(pq.get(right)) < 0) {
                    maxIdx = right;
                }
            }
            if (pq.get(curIdx).compareTo(pq.get(maxIdx)) < 0) {
                T t = pq.get(maxIdx);
                pq.set(maxIdx, pq.get(curIdx));
                pq.set(curIdx, t);
                curIdx = maxIdx;
            } else {
                break;
            }
        }
        return removeObj;
    }

    public void reset() {
        pq.clear();
    }

    public int size() {
        return pq.size();
    }
}
