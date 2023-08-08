package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
/**
 * Two players have two Queue<Integer> of cards with the same even sizes(>=2).
 * They want to combine all the cards together into an ArrayDeque<Integer> according to the following rule.
 *
 * First, both take turns adding two cards to the ArrayDeque<Integer>.
 * Then, with each move, the player:
 * takes the top card from the ArrayDeque<Integer> and adds this card to the end of his Queue<Integer>
 * then puts two cards from the beginning of his Queue<Integer> into the ArrayDeque<Integer>.
 * The moves go until the both players' Queue<Integer> of cards are not empty.
 *
 * Implement the program which gets two Queue<Integer> and creates ArrayDeque<Integer>
 *     in accordance with the rules of the game.
 * */
public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> combinedDeque = new ArrayDeque<>();
        boolean player1Turn = true;

        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            if (player1Turn) {
                combinedDeque.add(firstQueue.poll());
                combinedDeque.add(secondQueue.poll());
                player1Turn = false;
            } else {
                combinedDeque.add(secondQueue.poll());
                combinedDeque.add(firstQueue.poll());
                player1Turn = true;
            }
        }

        while (!firstQueue.isEmpty()) {
            combinedDeque.add(firstQueue.poll());
        }

        while (!secondQueue.isEmpty()) {
            combinedDeque.add(secondQueue.poll());
        }

        return combinedDeque;
    }
    }

