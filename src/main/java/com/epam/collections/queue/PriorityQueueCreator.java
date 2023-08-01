package com.epam.collections.queue;

import java.util.*;

/**Implement the program which gets two List<String>
 * and merged them into PriorityQueue<String> alphabetically in reverse order.*/
public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        List<String> sorted = new LinkedList<>();
        sorted.addAll(firstList);
        sorted.addAll(secondList);
        sorted.sort((a,b)->String.CASE_INSENSITIVE_ORDER.compare(b,a));
        priorityQueue.addAll(sorted);

        return  priorityQueue;

    }
}
