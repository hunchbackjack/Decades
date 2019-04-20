package com.example.jsaun.flashcards;

import java.util.ArrayList;

public class CO518List {

    //list to store level 1
    private final ArrayList<String> level1 = new ArrayList<>();

    //list to store level 2
    private final ArrayList<String> level2 = new ArrayList<>();

    //list to store level 3
    private final ArrayList<String> level3 = new ArrayList<>();

    //list to store level 4
    private final ArrayList<String> level4 = new ArrayList<>();

    //list to store level 5
    private final ArrayList<String> level5 = new ArrayList<>();

    //list to store level 6
    private final ArrayList<String> level6 = new ArrayList<>();

    //list to store level 7
    private final ArrayList<String> level7 = new ArrayList<>();

    //list to store level 8
    private final ArrayList<String> level8 = new ArrayList<>();

    //list to store level 9
    private final ArrayList<String> level9 = new ArrayList<>();

    //list to store level 10
    private final ArrayList<String> level10 = new ArrayList<>();

    //list to store level 11
    private final ArrayList<String> level11 = new ArrayList<>();

    //list to store level 12
    private final ArrayList<String> level12 = new ArrayList<>();

    //list to store level 13
    private final ArrayList<String> level13 = new ArrayList<>();

    //list to store level 14
    private final ArrayList<String> level14 = new ArrayList<>();

    //list to store level 15
    private final ArrayList<String> level15 = new ArrayList<>();

    //list to store level 16
    private final ArrayList<String> level16 = new ArrayList<>();

    //list to store level 17
    private final ArrayList<String> level17 = new ArrayList<>();

    public CO518List() {


        level1.add("What is an algorithm?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "A way of solving a problem.");
        level1.add("What is a data structure?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "A way of structuring your data so that it can be stored properly.");
        level1.add("What are algorithms in computer science?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Set of steps to accomplish a task. Input some data => complex calculations => output.");
        level1.add("Why are arrays important data structures?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "They are contiguous / non-contiguous blocks of memory. They can store any types of data while a program is running. They allow for data  manipulation. They are the building  block for many concepts related to algorithms, such as sorting, searching, recursion ");
        level1.add("What is an ArrayList?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "A dynamically resizeable list of variables.");
        level1.add("How would you declare an array of ints called intArray containing the values 1, 2, 3, 4, 5?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "int[] intArray = {1, 2, 3, 4, 5};");
        level1.add("How would you get the first value in an array called intArray?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "intArray[0]");
        level1.add("What is a binary search?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "A binary search searches for a data item in an array. The array must be sorted. It cuts the array in half and looks to see if the data is stored in the first or second half. For example, looking for  1 in a list containing 1, 2, 3, 4, 5, 6, it would split the array between 3 and 4, and as 1 is less than 3 it would search in the first array.");
        level1.add("How would you find the midpoint of an array?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "int midPoint = lowerBound + (upperBound - lowerBound) / 2");
        level1.add("What is a stack?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "A class to store a list using an array that can push and pop items into it. ");

        level2.add("What are parallel arrays?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Arrays that are associated and should be addressed together. For example String[] name = new String[5], int[] marks = new int[5]. Each name has a corresponding mark. When referring to marks[1] we should also refer to names[1].");
        level2.add("Give 6 types of sorting." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "1. bubble sort, 2. insertion, 3. selection, 4. merge, 5. quick, 6. shell.");
        level2.add("Explain bubble sort." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "One of the simplest ways to sort elements. Takes an unsorted list, compares adjacent elements with one another, does a swap if one is larger than the other, repeats process until entire array is sorted. Makes use of many iterations to sort array. Not suitable for large amounts of data.");
        level2.add("Explain insertion sort." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Similar to bubble sort as makes use of swapping items. Instead of swapping elements next to each other, it sort swaps and element until it is in the right place.");
        level2.add("Explain selection sort." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array. The two arrays are the subarray which is already sorted, and the remaining subarray which is unsorted. In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray.");
        level2.add("Explain merge sort." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "A Divide and Conquer algorithm. It divides input array in two halves, calls itself for the two halves and then merges the two sorted halves. The merge() function is used for merging two halves. It assumes the two arrays are sorted and merges the two sorted sub-arrays into one.");
        level2.add("Explain quick sort." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "A Divide and Conquer algorithm. It picks an element as pivot and partitions the given array around the picked pivot. There are many different versions of quickSort that pick pivot in different ways.");
        level2.add("Explain shell sort." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "ShellSort is mainly a variation of Insertion Sort. In insertion sort, we move elements only one position ahead. When an element has to be moved far ahead, many movements are involved. The idea of shellSort is to allow exchange of far items. In shellSort, we make the array h-sorted for a large value of h. We keep reducing the value of h until it becomes 1. An array is said to be h-sorted if all sublists of every h’th element is sorted.");
        level2.add("Give 3 different threats to testing the accuracy of computational resources." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "1. Different computers (desktop vs. phone vs. cloud), 2. Different inputs (size, characteristics), 3. non-determinism (different results on different measurements), might need serious statistical tests.");
        level2.add("When would you use an abstract model of an algorithm?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "To compare two algorithms to each other. You take the code and ignore the compiler and hardware, just thinking about the input size and shape, and check performance.");

        level3.add("What is a step-counting model?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Each primitive operation takes a certain number of steps. A step-counting model measures efficiency by the number of steps an algorithm takes.");
        level3.add("What is a constant time measure?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Code runs in constant time if there exists some number of steps (possibly very large) where it will compute in fewer steps, no matter how large the input.");
        level3.add("What is the notation for constant time?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "constant-time(c) = ∃s. ∀i. steps(c,i) < s. There exists an s, and for every i, where constant time of c is equal to the steps of c and i, less than s.");
        level3.add("What is the worst case scenario for insertion sort?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "It's quadratic. Meaning that it takes fewer than n^2 constant time steps, where n is the length of the array.");
        level3.add("What is the best case scenario for insertion sort?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "It linear. This means that it takes fewer than n constant time steps.");
        level3.add("What is the difference between a linear and a quadratic algorithm?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "In a linear algorithm, if you double the input, you double the number of steps. In a quadratic algorithm, if you double the input, you multiply the steps by 4. ");
        level3.add("What is Big O notation?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "A way of writing the number of steps an algorithm takes. For a function f, we say that the number of steps is order (f(n)), writen O(f(n)) in Big O notation.");
        level3.add("Give an example of a constant big O notation." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "O(1). The function f is just f(n) = 1. 1 step.");
        level3.add("Give an example of a linear big O notation." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "O(n). The function f(n) = n. The number of steps is the same as the input.");
        level3.add("Give an example of a quadratic big O notation." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "O(n^2). The function f is f(n) = n^2.");
        level3.add("Give an example of a exponential big O notation." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "O(2^n). The function f is f(n) = 2^n.");

        level4.add("What is the definition of Big O?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "An algorithm A has runtime O(f(n)) if there is a constant C and number N where for all inputs i larger than N, A takes fewer than C*f(size(i)) steps.");
        level4.add("What is the formula for big O?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "order(A, f) = ∃C N. ∀i. size(i) > N -> steps(A,i) < C*f(size(i))");
        level4.add("Why do we need a constant factor C in big O?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "It makes the notation more robust against the exact notion of a step.");
        level4.add("What is a logarithm?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "The inverse of an exponent. log2(n) = x whenever 2^x = n. Exponential functions grow very fast (increase the input by 1, double the amount of work). Logarithmic functions grow very slow (double the input, increase the amount of work by a constant amount). ");
        level4.add("What is the building block of a linked list?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "A cons cell. A cell with two parts, the first being the data element, and the second being the tail pointing to the next element.");
        level4.add("How do we signal the end of a linked list?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Either a null element, or a dedicated empty-list class/object. Latter version is more OO, but works less well with loops.");
        level4.add("How would you declare a new cons cell that contains the string 'hello'?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Cons<String> lco=new Cons<String>(); lco.set('hello');");
        level4.add("Why do we use generics when creating a cons cell?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "To be able to store anything (of an object type) in a list we could have used the concrete class Object instead of the parameter A. The parameter allows us to preserve the type information of the stored data when we retrieve it, without needing a cast.");
        level4.add("Explain non-destructively adding a cell to the start of a linked list." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "We can create a new cons-cell and stick it at the front, thus all the old cells remain unchanged, thus all variables storing an old cell are unaffected too. To keep the whole list in a field/variable we would need to update that field with the new cell.\n");
        level4.add("Explain destructively adding a cell to the start of a linked list." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Each cons-cell is an object. Objects can be stored in fields/variables. Suppose a variable x of type Cons<Integer> is set to the first cons-cell of the original list, the one with the 12 in it, then we call x.addFront(8);. Because we have not changed the value of x, after the call x will be pointing to the very same cons-cell, i.e. the one at the very same address. Thus if we want that x points to the first cell of the updated list we need to change the content of that very cell and put the number 12 into a different cell\n");

        level5.add("What is the problem with adding to the back of a linked list?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Adding at the end is in neither case efficient, it always requires O(n) effort (for a list with n elements) to get to the end of the list. We can avoid the problem (for destructive update) by putting a supervisor layer on top of our list, this also helps the addFront task.\n");
        level5.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level5.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level5.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level5.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level5.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level5.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level5.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level5.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level5.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");

        level6.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");

        level7.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");

        level8.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");

        level9.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");

        level10.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");

        level11.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");

        level12.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");

        level13.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");

        level14.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");

        level15.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");

        level16.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level16.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level16.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level16.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level16.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level16.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level16.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level16.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level16.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level16.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");

        level17.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level17.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level17.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level17.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level17.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level17.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level17.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level17.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level17.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level17.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");

    }

    //get level 1 array list
    public ArrayList<String> getLevel1List() {
        return level1;
    }

    //get level 2 array list
    public ArrayList<String> getLevel2List() {
        return level2;
    }

    //get level 3 array list
    public ArrayList<String> getLevel3List() {
        return level3;
    }

    //get level 4 array list
    public ArrayList<String> getLevel4List() {
        return level4;
    }

    //get level 5 array list
    public ArrayList<String> getLevel5List() {
        return level5;
    }

    //get level 6 array list
    public ArrayList<String> getLevel6List() {
        return level6;
    }

    //get level 7 array list
    public ArrayList<String> getLevel7List() {
        return level7;
    }

    //get level 8 array list
    ArrayList<String> getLevel8List() {
        return level8;
    }

    //get level 9 array list
    ArrayList<String> getLevel9List() {
        return level9;
    }

    //get level 10 array list
    ArrayList<String> getLevel10List() {
        return level10;
    }

    //get level 11 array list
    ArrayList<String> getLevel11List() {
        return level11;
    }

    //get level 12 array list
    ArrayList<String> getLevel12List() {
        return level12;
    }

    //get level 13 array list
    ArrayList<String> getLevel13List() {
        return level13;
    }

    //get level 14 array list
    ArrayList<String> getLevel14List() {
        return level14;
    }

    //get level 15 array list
    ArrayList<String> getLevel15List() {
        return level15;
    }
}