package com.example.jsaun.flashcards;

import java.util.ArrayList;

public class CO519List {

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

    public CO519List() {


        level1.add("What is logic?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "The language of reasoning.");
        level1.add("What is formal logic?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "A way to encapsulates reasoning into unambiguous statements. It brings certainty and checkability, and is a way to model systems.");
        level1.add("Give an example of syllogism." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "All people are mortal. I am a person. Therefore I am mortal.");
        level1.add("Give an example of a logical syllogism." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Some cats have no tails. All cats are mammals. Therefore, some mammals have no tails.");
        level1.add("What is natural deduction?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "A system of inference rules of the form (premise1... ... premiseN)/conclusion, with a label. Used to construct and deconstruct formula preserving the truth.");
        level1.add("Give the formula for conjunction introduction." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "(P    Q) == (P and Q), and introduction.");
        level1.add("Give the formula for conjunction elemination 1 and 2." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "(P and Q) == P, and elimination 1. (P and Q) == Q, and elimination 2.");
        level1.add("Give the truth table for conjunction." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "For u, w, and u and w. F F = F, F T = F, T F = F, T T = T. Only true when both are true.");
        level1.add("What is entailment?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "For P1, …, Pn ⊢ Q: given some assumed formulas P1, …, Pn the rules of our logic let us prove the conclusion Q");
        level1.add("What are the steps to prove P ∧ Q ⊢ Q ∧ P" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "And elimination on P and Q to get Q, and elimination on P and Q to get P, and introduction for Q   P to get Q and P.");

        level2.add("Explain fitch style." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "You have three columns. In the first you give the proof step (e.g 1, 2, 3, etc.), in the second you have the formula you've got (E.g P and Q), and in the third you have the rule used to derive that formula (e.g premise, and introduction, and elimination, etc.)");
        level2.add("Give the formula for implication elimination." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "(P -> Q    P) = Q, implication elimination.");
        level2.add("Give the formula for implication introduction." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "A subproof of (P ... Q) = p -> Q, implication introduction.");
        level2.add("Give the general form for subproofs." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "assumption ... conclusion");
        level2.add("Solve: (P ^ Q) -> (Q ^ P)." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "and elimination to get P, and elimination to get Q, and implication to get Q and P.");
        level2.add("Give the formula for disjunction introduction." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "(P) = P or Q. Disjunction introduction.");
        level2.add("Give the formula for disjunction elimination." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "(P or Q), subproof(P ... R), subproof (Q ... R) = R. Disjunction elimination.");
        level2.add("Give the truth table for P implies Q." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "For P, Q, and P -> Q, F F = T, F T = T, T F = F, T T = T. Only false when P is true and Q is false.");
        level2.add("Give the truth table for P or Q (disjunction)." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "For P, Q, and P or Q, F F = F, F T = T, T F = T, T T = T. Always true when P or Q or both are true.");
        level2.add("Natural deduction preserves ... ?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Truth! Given P cannot directly prove ¬P");

        level3.add("Give the formula for negation elimination." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "(P    ¬P) = false. Negation elimination.");
        level3.add("Give the formula for negation introduction." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Subproof: (P ... false) = ¬P. Negation introduction.");
        level3.add("Give the formula for double negation elimination." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "¬¬P = P. Double negation elimination.");
        level3.add("Give the formula for double negation introduction." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "P = ¬¬P. Double negation introduction.");
        level3.add("Derive the principle of proof-by-contradiction." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Subproof: ( ¬P ... false) = P. PBC.");
        level3.add("What is the law of excluded middle?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "P is true or it is false. Constructive logics reject LEM (preserves proof rather than true) by rejecting ¬¬e (stating a proof of ¬¬P is not the same as a proof of P).");
        level3.add("What is bi-implication?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "P implies Q, and Q implies P.");
        level3.add("What is the algebraic property of idempotence?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "P and P bi-directionally implies P, just as P or P  bi-directionally implies P.");
        level3.add("What is the algebraic property of commutativity?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "P and Q  bi-directionally implies Q and P, just as P or Q  bi-directionally implies Q or P.");
        level3.add("What is the algebraic property of associativity?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "(P and Q) and R  bi-directionally implies P and (Q and R), just as (P or Q) or R  bi-directionally implies P or (Q or R).");

        level4.add("What is the algebraic property of unitality?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "P and true bi-directionally implies P, just as P or false bi-directionally implies P.");
        level4.add("What is the algebraic property of annihilation?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "P and false bi-directionally implies false, just as P and true bi-directionally implies true.");
        level4.add("What is the algebraic property of distributivity?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "(P or Q) and R bi-directionally implies (P and R) or (Q and R). Works the same flipping all symbols around.");
        level4.add("What is the algebraic property of absorption?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "(P and Q) or P bi-directionally implies P. Just as (P or Q) and P bi-directionally implies P.");
        level4.add("What is the algebraic property of complementation?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "P or ¬P bi-directionally implies true. Just as P and ¬P bi-directionally implies false.");
        level4.add("What is the algebraic property of involution?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "¬¬P bi-directionally implies P.");
        level4.add("What is the algebraic De Morgan's law?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "¬(P and Q) bi-directionally implies ¬P or ¬Q. Just as ¬(P and Q) bi-directionally implies ¬P and ¬Q.");
        level4.add("What is the process for modelling in propositional logic?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "1. Describe the state space of the system atoms. 2. Express state transitions via implications. 3. Compose transitions with conjunction. 4. Define a property ('specification') we want to check. 5. Prove validity of: model implies specification.");
        level4.add("When is formula P satisfiable?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "If it is sometimes true for some assignment of true/false to the variables.");
        level4.add("When is a model too weak?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "When it implies both the specification and not the specification.");
        level4.add("What is SAT?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Boolean satisfiability. It is an algorithm for finding satisfying assignments to formulas, if one exists. It verifies forumlas by proving that model implies specification is always true, and that the negation of that is always false.");

        level5.add("What is DPLL?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "A SAT algorithm that takes as input a formula in conjunctive normal form.");
        level5.add("What is conjunctive normal form?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "A conjunction of disjunctions of literals. No implication, and no nesting of disjunctions/conjunctions.");
        level5.add("How do we informally convert to conjunctive normal form?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "1. Convert implication to disjunction. 2. De Morgan's to push negation in. 3. Push disjunction in and pull conjunction out (using distributivity). 4. Cancel double negation.");
        level5.add("What are the 4 rules of DPLL?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "1. Tautology elimination. 2. Unit propagation. 3. Pure literal elimination. 4. Split a variable. Repeateledy apply in order.");
        level5.add("What is tautology elimination?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Start with a clause with a literal and its negation, e.g. (x V ... V ¬x) and replace it with T (True).");
        level5.add("What is unit propagation?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Take a clause with a single literal (called a unit) such as P ^ (x) ^ Q, and replace all occurrences of x with T. Same with (¬x), replace that statement with T, and all other x's with F.");
        level5.add("What is pure literal elimination?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "If the negation of a literal does not occur anywhere else in the formula then it is a pure literal. All clauses containing a pure literal can be dropped.");
        level5.add("How do you split a variable?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Choose a variable x, start two new branches of DPLL setting x=T on one branch, and x=F on the other. Work way through DPLL steps on each branch.");
        level5.add("Which statement is true in the riddle: A - 'C is telling the truth'. B - 'A is lying'. C - 'We're all lying'." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "B is the only one telling the truth as he negates A, and A bidirectionally implies C, so by negating A they are negating A and C.");
        level5.add("What is the main limit in propositional logic?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "When discussing various variables we have to represent all of them.");
        level5.add("What is first-order logic?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Also called predicate logic as it uses predicated (classifiers/relations) and quantification. For example ∃s . student(s) ∧ wearingGlasses(s), there exists an s where s is a student and s wears glasses. Some students wear glasses.");

        level6.add("What is U in first order logic?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Our universe of things our logic talks about.");
        level6.add("What is x in first order logic?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Variables, representing elements of U.");
        level6.add("What is ∀x.P in first order logic?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Universal quantification (for all).");
        level6.add("What is ∃x.P in first order logic?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Existential quantification (exists).");
        level6.add("How would you say at least two people are wearing glasses in first order logic?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "∃s . ∃t . wearingGlasses(s) ∧ wearingGlasses(t) ∧ ¬(s = t)");
        level6.add("What is the difference between a free variable and a bound variable?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "A free variable exists independently, however a bound variable has a predicate. For example x V ALLu.( y ^ u) x is free, ALLu is the binder, and u is bound.");
        level6.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level6.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level6.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level6.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level6.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");

        level7.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level7.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level7.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level7.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level7.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level7.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level7.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level7.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level7.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level7.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level7.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");

        level8.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level8.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level8.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level8.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level8.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level8.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level8.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level8.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level8.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level8.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");

        level9.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level9.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level9.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level9.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level9.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level9.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level9.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level9.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level9.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level9.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level9.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");

        level10.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level10.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level10.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level10.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level10.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level10.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level10.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level10.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level10.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level10.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");

        level11.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level11.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level11.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level11.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level11.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level11.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level11.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level11.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level11.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level11.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");

        level12.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level12.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level12.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level12.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level12.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level12.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level12.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level12.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level12.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level12.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");

        level13.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level13.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level13.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level13.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level13.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level13.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level13.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level13.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level13.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level13.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");

        level14.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level14.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level14.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level14.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level14.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level14.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level14.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level14.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level14.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level14.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");

        level15.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level15.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level15.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level15.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level15.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level15.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level15.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level15.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
        level15.add("" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "");
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