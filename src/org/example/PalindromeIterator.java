package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class PalindromeIterator {
    public static void main(String[] args) {
        String s = "word";
        List<Character> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        System.out.println(list);
        ListIterator<Character> iteratorFor = list.listIterator();
        ListIterator<Character> iteratorBack = list.listIterator(list.size());
        boolean isPolindrom=true;
        while (iteratorFor.hasNext() && iteratorBack.hasPrevious() &&
        (iteratorFor.nextIndex()!= iteratorBack.previousIndex())) {
            if (iteratorFor.next() != iteratorBack.previous()) {
                isPolindrom = false;
                break;
            }
        }
        if (isPolindrom){ System.out.println("This word is polindrom");
            } else {
                System.out.println("This word is not Palindrom");

            }
        }

    }

