package com.example.jsaun.flashcards;

import java.util.ArrayList;

public class CO528List {

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

    public CO528List() {


        level1.add("What is intelligence?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Insight into problems, rather than mere mechanical application of rules.");
        level1.add("Explain the Turing Test." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Involves 3 participants, a human interrogator and two entities answering questions: another human, and a computer. The interrogator asks questions and gets answers via a keyboard and screen, without knowing if the answer was given by the other human or by the computer (Computer can give wrong answers to deceive interrogator). The human interrogator has to figure out who is the other human and who is the computer, based on the answers.");
        level1.add("What are the 4 possible objections to the Turing Test?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "1. The chimpanzee objection. 2. The sense organs objection. 3. The simulation objection. 4. The black box objection.");
        level1.add("Explain the chimpanzee objection." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Chimpanzees can think, but they would not pass the test. So, the test is too conservative and biased towards human intelligence. This objection shows a limitation, rather than flaw, of the test: Failing the test is inconclusive, but passing it shows intelligence");
        level1.add("Explain the sense organs objection." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Test does not measure the computer’s understanding of the words it is using in relation to real-world objects. So, passing the test is not proof of intelligence. Test should be strengthened by equipping the computer with artificial sense organs (e.g., cameras, arms, etc.) However, many concepts are abstract and can be the subject of an interrogation to test intelligence without sense organs.");
        level1.add("Explain the simulation objection." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Passing the test only shows that the computer is good at simulating thinking, not that it is thinking. Assumes all simulations lack an essential feature of the thing being simulated – prejudiced answer to the test. This argument does not consider the possibility of a simulation having all essential features of the thing being simulated. E.g., a simulated (artificial) voice is essentially a voice… Raises the question: is it possible that a computer passes the test by using a simulation that does not have all the essential features of intelligence?");
        level1.add("Explain the black box objection." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "In the test, the computer is treated as a black box, the interrogator evaluates only the outward behaviour of the computer (Ignores how the computer program was designed and works). – We evaluate the intelligence of people based on their outward behaviour, but we believe all people have similar brains (from a biochemical point of view). The Turing test is based just on the output of the program. Should we use both an output criterion and a design criterion?");
        level1.add("What are the 4 general components of a typical AI problem?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "1. A computational problem to solve. 2. A rule to generate candidate solutions to these problems (encoding). 3. There is a fitness function f that takes any possible solution and returns a value that indicates how good the solution is. 4. An algorithm to use existing solutions and their fitness to generate better solutions.");
        level1.add("What is an optimisation problem?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "A problem where you want to find an optimum/extreme value. For example, dial problem.");
        level1.add("What is a fujiyama landscape?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "A landscape with one maximal value, such as a volume dial.");

        level2.add("When local minima exists what is there typically a trade off between?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Convergence (the ability to find good solutions), and exploration (the ability to avoid local minima).");
        level2.add("What is the limiting case of only exploration?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Random search (not very efficient).");
        level2.add("What is the limiting case of only convergence?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Greedy search.");
        level2.add("What is the fitness in the travelling salesman problem?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Total distance travelled.");
        level2.add("What is the candidate solution in the travelling salesman problem?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "A sequence of cities where each city appears exactly once.");
        level2.add("What is the fitness function in the travelling salesman problem?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Mapping from a sequence of cities to the distance.");
        level2.add("Why is the TSP hard?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "It is computationally intractable. The time required to find the best route grows very fast with the number of cities. Already for a moderately large number of cities it is impossible to check all combinations, because it would take too long. At the same time, there are no short cuts or tricks to find the optimal solution quickly.");
        level2.add("Genetic algorithms are best applied to problems where ... ?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Similar candidate solutions have similar fitness, there are local minima, there are no short-cut solutions that can find the optimal solution directly, brute force is not feasible.");
        level2.add("What is the fitness function of a genetic algorithm?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "The fitness function is a function that assigns a fitness value to each possible combination of genes.");
        level2.add("What are evolutionary algorithms?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Evolutionary algorithms are a class of optimisation algorithms that are inspired by natural evolution. They generally consist of the following key components: An encoding of a solution, a fitness function, selection operators. They usually start with a population of random candidate solutions, each candidate solution is assigned a fitness value. A new population is created from the old one by mutation/selection. Individuals with a lower fitness are less likely to proceed. Typically, there is a tension between fast convergence (optimum is found) and exploration (local minima are avoided).");

        level3.add("What is the basic outline of a genetic algorithm?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "1. Create an initial population of candidate solutions. 2. Determine the fitness of all candidate solutions. 3. Create a new population from the existing population by applying a selection procedure. 4. Go to 2.");
        level3.add("What are the 2 aspects of selection?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "1. Select a candidate to go forward from the previous population to the next one. 2. With a given probability the chosen candidate is modified using mutation or selection or both.");
        level3.add("What is fitness proportional selection?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "We select a solution from the current population to go to the next one with a probability that is proportional to its fitness. This is also called roulette wheel selection");
        level3.add("What is tournament selection?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "1. Randomly pick two or more solutions from the current population. 2. Determine the solution that is best amongst the chosen ones. 3. Add the best one to the new population.");
        level3.add("What is elitism?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Always choose the n best solutions for the new population. This is not a selection scheme in its own right, but can be combined with the previous ones");
        level3.add("What is crossover?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Crossover takes two different solutions and produces a new solution from the old one.");
        level3.add("What is a good encoding?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "A good candidate solution.");
        level3.add("How do you mutate a candidate selection?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Make a small change in an existing solution. When solutions are binary strings than this is often chosen to be the flip of a single bit. If solutions are vectors of floats then one could implement mutations as a small variation of one of the numbers.");
        level3.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level3.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");

        level4.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");

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