package com.example.jsaun.flashcards;

import java.util.ArrayList;

public class CO510List {

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

    public CO510List() {

        //add lyrics to level 1
        level1.add("What four activities are fundamental to any software engineering process?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Specification, design and implementation, validation, and evolution");
        level1.add("What is a software specification?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Required services and the constraints on the system’s operation and development. A requirement specifies an externally visible function or attribute of a system (IEEE 830). Obtained from customer/user/stakeholder.");
        level1.add("Explain requirements analysis." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "The activity of obtaining a requirements specification from the user. One of the specification activities.");
        level1.add("What is the design and implementation stage of s/w development?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "The activity of converting the system specification into an executable system. Software design - Design a software structure that realises the specification; Implementation - Translate this structure into an executable program; The activities of design and implementation are closely related and may be inter-leaved.");
        level1.add("What are the differences between specification and design?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Customer should be able to review the requirements specification and help validate it. Usually only development team needs to understand the design. The specification should not bias the design. Design details would make the specification harder to understand for the customer. Design details are irrelevant for system and acceptance testing. A change of design should not change the specification. A change of the specification is a change of goals (by the customer).");
        level1.add("What is the verification and validation stage?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Intended to show that a system conforms to its specification and meets the requirements of the system customer. Testing is the most commonly used V & V activity. May also involve inspections and reviews.");
        level1.add("What are the three stages of testing?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Component testing - Test components independently, unit-testing. System testing - Test the complete system. Acceptance testing - Test that customer accepts the system. Real data.");
        level1.add("What is the software evolution stage?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "As requirements change, the software must also evolve and change. Although there has been a demarcation between development and evolution (maintenance) this is increasingly irrelevant as fewer and fewer systems are completely new.");
        level1.add("What is a software process?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "A structured set of activities required to develop a software system. A software process model is an abstract representation of a process. It presents a description of a process from some particular perspective.");

        level2.add("What are software process descriptions?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Focus on the activities such as specifying a data model, designing a user interface, etc. and the ordering of these activities. Process descriptions may also include: Products, which are the outcomes of a process activity; Roles, which reflect the responsibilities of the people involved in the process; Pre- and post-conditions, which are statements that are true before and after a process activity has been enacted or a product produced.");
        level2.add("Explain plan-driven processes." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Plan-driven processes are processes where all of the process activities are planned in advance and progress is measured against this plan.");
        level2.add("Explain agile processes." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "In agile processes, planning is incremental and it is easier to change the process to reflect changing customer requirements.");
        level2.add("Explain the waterfall model." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Separate and distinct phases of specification and development. Plan-driven model.");
        level2.add("Explain incremental development." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Specification, development and validation are interleaved. May be plan-driven or agile.\n");
        level2.add("Explain reuse oriented software development" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "The system is assembled from existing components. May be plan-driven or agile.\n");
        level2.add("What are the 5 stages of the waterfall model?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Requirements definition, system and software design, implementation and user testing, integration and system testing, operation and maintenance.");
        level2.add("What are the 4 advantages of the waterfall model?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Fits well with other engineering process models. Requirements documentation good basis for a contract. Clear structure and produced documents make process visible. Works well for large projects and where a system is developed on several sites.\n");
        level2.add("What is the disadvantage of the waterfall model?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Responds badly to changes (requirements; also at later stages).\n");
        level2.add("What are the stages of incremental development?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Initially outline a description of the software. Then concurrently go through the specification, development, and validation stages for the intial version, intermediate version, and the final version.");

        level3.add("What are the 3 advantages of incremental development?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "1. The cost of accommodating changing customer requirements is reduced. 2. It is easier to get customer feedback on the development work that has been done. 3. More rapid delivery and deployment of useful software to the customer is possible. \n");
        level3.add("What are the 2 disadvantages of incremental development?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "1. The process is not visible. How measure progress? 2. System structure tends to degrade as new increments are added.  Need refactoring.\n");
        level3.add("Give three examples of components of reuse-oriented software engineering." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "1. Collections of objects that are developed as a package to be integrated with a component framework such as .NET or J2EE. 2. Web services that are developed according to service standards and which are available for remote invocation. 3. Stand-alone software systems (COTS, commercial-off-the-shelf) that are configured for use in a particular environment.\n");
        level3.add("What are the 6 stages of reuse-oriented software engineering?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "1. Requirements specification. 2. Component analysis. 3. Requirements modification. 4. System design with reuse. 5. Development and integration. 6. System validation.");
        level3.add("What are the three advantages of reuse-oriented software engineering?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "1. Reduces amount of software to be developed. 2. Reduces cost and risks. 3. Usually leads to faster delivery.\n");
        level3.add("What are the two disadvantages of reuse-oriented software engineering?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "1. Requires modification of requirements (compromise!). 2. Some control over evolution is lost, because evolution of reused components not under control.\n");
        level3.add("What is change avoidance in the context of reducing the cost of rework?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Change avoidance, where the software process includes activities that can anticipate possible changes before significant rework is required. May develop a prototype. \n");
        level3.add("What is change tolerance in the context of reducing the cost of rework?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Change tolerance, where the process is designed so that changes can be accommodated at relatively low cost. Incremental development\n");
        level3.add("What is software prototyping?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "A prototype is an initial, partially working version of a system used to demonstrate concepts and try out design options.\n");
        level3.add("When can a software prototype be used?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "The requirements engineering process to help with requirements elicitation and validation. In design processes to explore options and develop a UI design.\n");

        level4.add("Explain incremental delivery." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "The development and delivery of the system is broken down into increments with each increment delivering part of the required functionality. User requirements are prioritised and the highest priority requirements are included in early increments. Once the development of an increment is started, the requirements are frozen though requirements for later increments can continue to evolve. An increment can be used by the customer, leading to requirement clarification and changes.\n");
        level4.add("What are the 9 stages of incremental delivery?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "1. Define outline requirements. 2. Assign requirements to increments. 3. Design system architecture. 4. Develop system increment. 5. Validate increment. 6. Integrate increment. 7. Validate system. 8. Deploy increment. If system is incomplete go back to stage 4, else 9. Final system.");
        level4.add("What are the 4 advantages of incremental delivery?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "1. Customer value can be delivered with each increment so system functionality is available earlier. 2. Early increments act as prototypes to help elicit requirements for later increments. 3. Easy to incorporate changes. Lower risk of overall project failure. 4. The highest-priority system services receive the most testing.\n");
        level4.add("What are the 3 disadvantages of incremental delivery?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "1. Most systems require a set of basic facilities that are used by different parts of the system. Without early requirements analysis it is hard to identify common facilities that are needed by all increments. 2. When a replacement system is being developed, users may be unwilling to experiment with an incomplete system. 3. Developing the specification incrementally conflicts with standard procurement model: The complete system specification is part of the system development contract. \n");
        level4.add("What is plan-driven development?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "A plan-driven approach to software engineering is based around separate development stages with the outputs to be produced at each of these stages planned in advance. Not necessarily waterfall model – plan-driven, incremental development is possible. Produces more documentation. \n");
        level4.add("What is agile development?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Specification, design, implementation and testing are inter-leaved and the outputs from the development process are decided through a process of negotiation during the software development process.\n");
        level4.add("What are the three characteristics of agile methods?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "1. Based on an incremental approach to software development (recall incremental development). 2. Focus on the code rather than the design. 3. Focus on simplicity in both the software being developed and in the development process. Wherever possible, actively work to eliminate complexity from the system.\n");
        level4.add("The agile manifesto states that they have come to value what 4 things?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Individuals and interactions over processes and tool. Working software over comprehensive documentation. Customer collaboration over contract negotiation. Responding to change over following a plan \n");
        level4.add("Give three reasons for choosing an agile development method." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "1. Rapid delivery and deployment. 2. Requirements change quickly in changing business environment. 3. Plan-driven processes have substantial overheads. E.g. documentation\n");
        level4.add("What are the two times where an agile method is applicable?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "1. Product development where a software company is developing a small or medium-sized product for sale. 2. Custom system development within an organization, where there is a clear commitment from the customer to become involved in the development process and where there are not a lot of external rules and regulations that affect the software.\n");

        level5.add("What are the 5 disadvantages of agile methods?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "1. It can be difficult to keep the interest of customers who are involved in the process. 2. Team members may be unsuited to the intense involvement that characterises agile methods. 3. Prioritising changes can be difficult where there are multiple stakeholders. 4. Maintaining simplicity requires extra work. 5. Contracts may be a problem as with other approaches to incremental development.\n");
        level5.add("What is scaling up in terms of agile software development?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "‘Scaling up’ is concerned with using agile methods for developing large software systems that cannot be developed by a small team. E.g. More up-front design and documentation? Communication via phone or video conference?\n");
        level5.add("What is scaling out in terms of agile software development?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "‘Scaling out’ is concerned with how agile methods can be introduced across a large organization with many years of software development experience. E.g. Cultural resistance, incompatible quality procedures, not all team members high-skilled\n");
        level5.add("What is Extreme Programming (XP)?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Perhaps the best-known and most influential agile method. Extreme Programming (XP) takes an ‘extreme’ approach to incremental development. New versions may be built several times per day; Increments are delivered to customers every 2 weeks; All tests must be run for every build and the build is only accepted if tests run successfully. Focus on technical / programming practices.\n");
        level5.add("How does XP implement agile principles?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Incremental development is supported through small, frequent system releases. Change supported through regular system releases. Customer involvement means full-time customer engagement with the team. People - not process - through pair programming, collective ownership and avoiding long working hours. Maintaining simplicity through constant refactoring of code.\n");
        level5.add("What is the XP release cycle?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Select user stories for this release, break down stories to tasks, plan release, develop/integrate/test software, release software, evaluate system, start again.");
        level5.add("How do we collect requirements for XP development?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Requirements expressed as user stories, written on story cards. Development team breaks these down into tasks. Customer prioritizes stories. Thus a few stories for next release chosen. Later stories may change or be discarded.\n");
        level5.add("How does XP handle change?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Conventional wisdom in software engineering is to design for change. It is worth spending time and effort anticipating changes as this reduces costs later. XP, however, maintains that this is not worthwhile as changes cannot be reliably anticipated. Rather, it proposes constant code improvement (refactoring) to make changes easier when they have to be implemented.\n");
        level5.add("Give 3 examples of refactoring. " + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "1. Re-organisation of a class hierarchy to remove duplicate code. 2. Tidying up and renaming attributes and methods to make them easier to understand. 3. The replacement of inline code with calls to methods that have been included in a program library.\n");
        level5.add("What is continuous refactoring?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Programming team look for possible software improvements and make these improvements even where there is no immediate need for them. This improves the understandability of the software and so reduces the need for documentation. Changes are easier to make because the code is well-structured and clear. However, some changes requires architecture refactoring and this is much more expensive.\n");

        level6.add("How do we test in XP development?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Test-first development. Incremental test development from scenarios. User involvement in test development and validation. Automated test harnesses are used to run all component tests each time that a new release is built.\n");
        level6.add("What is test-first development?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Writing tests before code clarifies the requirements to be implemented. Tests are written as programs rather than data so that they can be executed automatically. The test includes a check that it has executed correctly. Usually relies on a testing framework such as Junit. All previous and new tests are run automatically when new functionality is added, thus checking that the new functionality has not introduced errors. \n");
        level6.add("Why does XP involve the customer in testing?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Helps develop acceptance tests for the stories that are to be implemented in the next release of the system.  Writes tests as development proceeds. All new code is therefore validated to ensure that it is what the customer needs. \n");
        level6.add("What is the problem with involving the customer in testing?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "People adopting the customer role have limited time available and so cannot work full-time with the development team. They may feel that providing the requirements was enough of a contribution and so may be reluctant to get involved in the testing process. ");
        level6.add("What are the three difficulties with testing in XP?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "1. Programmers prefer programming to testing. For example, they may write obviously incomplete tests.  2. Some tests can be very difficult to write. For example, in a complex user interface, it is difficult to write unit tests for the code that implements the ‘display logic’ and workflow between screens. 3. It difficult to judge the completeness of a set of tests. \n");
        level6.add("Why does XP use pair programming?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "This helps develop common ownership of code and spreads knowledge across the team. The team has collective responsibility for resolving problems. Reduces risks when team members leave. It serves as an informal review process as each line of code is looked at by more than 1 person. It encourages refactoring. Measurements suggest that development productivity with pair programming is similar to that of two people working independently.\n");

        level7.add("What do we mean by heavy development?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Planned. Large systems, generally well understood. Stable requirements, long development time. Predictable. \n");
        level7.add("What do we mean by lightweight development?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Agile. Smallish, not always clearly understood. Unstable requirements, short development time. Unpredictable.\n");
        level7.add("What are user requirements?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "User requirements state what services the software is expected to provide to its users and any constraints under which it must operate.\n");
        level7.add("What are system requirements?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "System requirements detail exactly what functions are to be implemented, the services and operational constraints. \n");
        level7.add("What 5 groups of people will read user requirements?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Client managers, system end-users, client engineers, contractor managers, system architects.");
        level7.add("What 4 groups of people will read system requirements?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "System end-users, client engineers, system architects, software developers.");
        level7.add("What are the 2 subsets of system requirements?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Those that specify the services the system must do for its users; Functional Requirements. Those that specify constraints upon the system and how it is developed; Non-functional Requirements. \n");
        level7.add("What are functional requirements?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "These should tell you what the system must do. Not how the software is to be implemented! They need to be complete and consistent: All services must be defined without contradictions, omissions or inconsistencies. They must be unambiguous.\n");
        level7.add("What are non-functional requirements?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Describe aspects of the system that do not specifically provide user functionality but are required to support delivery of the functions. Their implementation may require additional functional requirements to be made. Examples include product requirements, such as: Response times, Storage capacity, Security, etc. \n");
        level7.add("Name 2 non-functional requirements that may affect a system." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "External considerations such as legal, ethical or regulatory requirements. How the users and developers organisations work, e.g. in an open plan office (confidentiality), using prescribed development tools, languages, frameworks, etc.\n");
        level7.add("What is a software requirements specification?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "This states what the developers of the software will implement. It is not a design document. What needs to be provided, not how it should do it. Often is (should be) part of the contract between client and software developers");

        level8.add("Sommerville suggests that software requirements should be read by which 5 groups of people?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "System customers, Managers, System engineers, System test engineers, and System maintenance engineers.\n");
        level8.add("What is the requirements cycle?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Discover, analyse, negotiate, specify (an agreed set of unambiguous requirements that can be used as the basis for system development), restart.");
        level8.add("Explain the use of closed questioning in interviews." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Useful to direct the interview, helps concentration on pertinent issues, the risk is that over reliance on fixed lists of closed questions can limit the scope of requirements discovery.\n");
        level8.add("Explain the use of open questioning in interviews." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Enables exploration of issues to develop a better understanding of the requirements. Danger if waffling on endlessly, getting nowhere.\n");
        level8.add("Explain the use of observation in requirements gathering?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "What you say you do and what you actually do may not be the same thing. Requirements based on what is actually done rather than what is stated as being done. People do not always obey the rules laid down in work directives, etc. People work in social and organisational contexts which affects their behaviour. Observation (Ethnography) can help to see how requirements work in context, not theory. \t\n");
        level8.add("What are the 4 dangers in requirements gathering?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "1. Do users and other stakeholders know what they want? 2. Creeping user requirements. 3. What you considered acceptance criteria may not turn out to be what stakeholders think they are. 4. There may be misunderstandings between different stakeholders and the developers that are either unrecognised or unresolved.\n");
        level8.add("Give 5 example classes of requirements" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "System, User Interface, Network, Database, Security\n");

        level9.add("What is system modelling?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "System modeling is the process of developing abstract models of a system. Each model presenting a different view or perspective of that system. Helps the analyst to understand the structure and behaviour of the system. Structure of the system in terms of its components. Iinteraction between the component. Used to communicate with customers");
        level9.add("When are models of the existing system used?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "During requirements engineering to clarify what the existing system does and can be used as a basis for discussing its strengths and weaknesses. Lead to requirements for the new system\n");
        level9.add("When are models of the new system used?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "During requirements engineering to help explain the proposed requirements to other system stakeholders. Used to discuss design proposals and to document the system for implementation\n");
        level9.add("What are the four system perspectives?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "External, interaction, structural, and behavioural.");
        level9.add("What does the external perspective model?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "The context or environment of the system\n");
        level9.add("What does the interaction perspective model?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "The interactions between a system and its environment and between the components of a system\n");
        level9.add("What does the structural perspective model?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "The organization of a system or the structure of the data that is processed by the system\n");
        level9.add("What does the behavioral perspective model?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "The dynamic behavior of the system and how it responds to events\n");
        level9.add("What do context models do?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Illustrate the operational context of a system. They show what lies outside the system boundaries\n");
        level9.add("What does an architectural model show?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "The system and its relationship to other systems.");

        level10.add("What is a system boundary?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Define what is inside and what is outside the system and show other systems that are used or depend on the system being developed. The position of the system boundary has a profound effect on the system requirements. Defining a system boundary is a political judgment, there may be pressures to develop system boundaries that increase / decrease the influence or workload of different parts of an organization\n");
        level10.add("What do process models do?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "reveal how the system being developed is used in broader business processes");
        level10.add("Name 3 interaction models." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "User interaction, system-to-system interaction, and component interaction.");
        level10.add("Explain structural models." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Structural models display the organization of a system in terms of components that make up that system and their relationships\n");
        level10.add("What are the 2 types of structural models?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Static models, which show the structure of the system design, and dynamic models, which show the organization of the system when it is executing\n");
        level10.add("When are structural models created?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "When discussing and designing the system architecture");
        level10.add("What are behavioral models?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Behavioral models are models of the dynamic behavior of a system as it is executing. They show what happens or what is supposed to happen when a system responds to a stimulus from its environment. Stimuli can be: data - some data arrives that has to be processed by the system, or events  - some event happens that triggers system processing. Events may have associated data, although this is not always the case\n");
        level10.add("Explain data-driven models." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Data-driven models represent sequence of actions involved in processing input data, generating an associated output, and are useful during the analysis of requirements as they can be used to show end-to-end processing in a system\n");
        level10.add("What is event-driven modeling?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Event-driven modeling shows how a system responds to external and internal events and are based on the assumption that a system has a finite number of states. Events (stimuli) may cause a transition from one state to another\n");
        level10.add("What are state machines?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "State machines model the behaviour of the system in response to external and internal events and show the system’s responses to stimuli \n");

        level11.add("What do state machines models show?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "System states as nodes and events as arcs between these nodes. When an event occurs, the system moves from one state to another.\n");
        level11.add("What is model-driven engineering?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "An approach to software development where models rather than programs are the principal outputs of the development process. Programs are then generated automatically from the models. This raises the level of abstraction in software engineering. \n");
        level11.add("What are the two advantages of model-driven engineering?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "1. Allows systems to be considered at higher levels of abstraction. 2. Automatic generation of code means that it is cheaper to adapt systems to new platforms\n");
        level11.add("What are the two disadvantages of model-driven engineering?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "1. Models for abstraction and not necessarily right for implementation. 2. Savings from generating code may be outweighed by the costs of developing translators for new platforms\n");
        level11.add("What is model-driven architecture?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "MDA is a model-focused approach to software design and implementation. It was the precursor of more general model-driven engineering. Uses a subset of UML models to describe a system. Models at different levels of abstraction are created. From a high-level, platform independent model, it is possible to generate a working program without manual intervention\n");
        level11.add("What does the computation independent model (CIM) show?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Model the domain abstractions used in a system. CIMs are sometimes called domain models\n");
        level11.add("What is the platform independent model (PIM)?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Model the operation of the system without reference to its implementation. PIM is usually described using UML models. It shows the static system structure and how it responds to external and internal events.\n");
        level11.add("What are platform specific models (PSM)?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Transformations of the platform-independent model with a separate PSM for each application platform. There may be layers of PSM with each layer adding some platform-specific detail.\n");

        level12.add("What is a model?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "A model is an abstract view of a system that ignores system details. Complementary system models can be developed to show the system’s context, interactions, structure and behaviour.\n");
        level12.add("What are context models?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Context models show how a system that is being modeled is positioned in an environment with other systems and processes. \n");
        level12.add("What are interaction models?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Interactions models represent interactions between users and systems, and between system components\n");
        level12.add("What are structural models?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Structural models show the organization and architecture of a system\n");
        level12.add("What are behavioral models?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Behavioral models describe the dynamic behavior of an executing system from the perspective of the data processed by the system and from the perspective of the events that stimulate responses from a system\n");
        level12.add("What is model-driven engineering?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Model-driven engineering is an approach to software development in which a system is represented as a set of models that can be automatically transformed to executable code\n");

        //UML
        level13.add("What is object-orientation?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Breaking software to self contained pieces\n");
        level13.add("What are objects?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Abstraction of physical entities and  conceptual things. Encapsulates its properties in (attributes) and the operations that access or change those properties\n");
        level13.add("Define UML." + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "UML is a language for visualizing, specifying, constructing and documenting the process of designing a computer system. UML is a mixed textual and diagrammatic language.\n");
        level13.add("What 5 things does UML model?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "1. Business process, 2. software and systems architecture, 3. data, 4. real-time system (manufacturing plants, multimedia systems…), and 5. languages themselves (metamodelling). \n");
        level13.add("What are the 3 uses of UML?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "For analysis (high level abstract models), for design (more concrete models), and for implementation (programming with pictures).\n");

        //Use case diagrams
        level14.add("What is the primary goal of the requirements phase?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Identify and document what is really needed in a form that clearly communicates to the client and to development team members\n");
        level14.add("What are use cases?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "A use case describes a sequence of actions a system performs that yields a value to a particular user such as a typical interaction between a user and a computer system. Describe requirements of the system from the point of view of a user. The sequence of actions is know as a scenario.\n");
        level14.add("What are the 8 uses of use cases?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "1. Primary artefact in project development and planning. 2. Describes the requirements of a system. 3. Helps in requirements analysis. 4. Aids providing a test plan. 5. Creating user guide and documentation. 6. Validating a design. 7. Creating project schedule. 8. Risk analysis.\n");
        level14.add("What are actors?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Anything that interfaces with the system (people, other software, hardware device, data stores or networks). An actor is a role that user plays with respect to the system. Actors are always external to the system, we don’t have any control over actors. Use cases related to each actor. A use case should be a complete task from the perspective of the actor.\n");
        level14.add("What are associations?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Associations capture the relation between a use case and an actor, actors, and use cases.\n");
        level14.add("What is the normal path?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "The idealised scenario of your use case.\n");
        level14.add("What is an alternate path?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "A different sequence of events, normally if one or more preconditions is violated.\n");
        level14.add("What does association direction show?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Who initiates the use case (one arrow per use case) system, actor or both. Nothing to do with flow.\n");
        level14.add("What does <<include>> show?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Use cases for reuse, to factor out common behaviour from two or more use cases. If there is something generic that you can use abstract the common behaviour. Represented as a stereotype.");
        level14.add("What does <<extend>> show?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Conditionally extend the behaviour of an existing use case (adding behaviour without changing the original use case). Separating variant behaviour. Two or more scenarios,  one is the main case and the other subsidiary cases.\n");
        level14.add("What are generalisations?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Show inheritance between actors and between use cases. \n");
        level14.add("How can we have inheritance between actors?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "One actor fills the same role as other actor. It also may fill additional role. The subtype actor can interact with the same use  case in the same way.\n");
        level14.add("How can we have inheritance between use cases?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "One use case is generalised version of the other. The generalised version inherits behaviour from the case and may add into it.\n");

        //class diagrams
        level15.add("What are the 3 interpretations for class diagrams?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "1. Conceptual (key domain abstraction), classes represent concepts in the domain under study. 2. Specification (interfaces of the software), classes define types in the system. 3. Implementation (the code), classes are mapped to Java classes in the code.\n");
        level15.add("What do class diagrams do?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Describe the types of objects in the system, and the static relationships that exist among them. Show type of structures for the objects. Show the properties and operations of a class (feature is a term that covers properties and operations of a class). Show the constraints that apply to the way objects are connected.\n");
        level15.add("What do properties do?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Represent structural features of a class. Properties correspond to fields in the class, attributes and associations.\n");
        level15.add("What is an attribute?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "An attribute describes a property as a line of text within the class box itself. (visibility name : type multiplicity = default {property-string}). An example - title: String [1] = “Untitled” {readonly}.\n");
        level15.add("What are associations?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Associations are an alternative way to notate a property. The same information that appears on an attribute can be shown on an association. Attributes are used for small things (e.g. Booleans and dates). Represented as a solid line between two classes, directed from the source class to the target class (the name of property goes on the target end). Associations can show multiplicity at both ends.\n");
        level15.add("What are roles?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Instead of using an association name identify roles it’s more readable to have roles that objects play in the association. Association name and roles are not advisable.\n");
        level15.add("What is multiplicity?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "Multiplicity is how many objects may fill the property. Can be: an exact number (1 – an order must have exactly one customer), a range of numbers (0..1 – a corporate customer may or may not have a single sales representative), or an arbitrary, unspecified number (* -  a customer needs not to place an Order and there is no upper limit to the number of Orders a Customer may place – zero or more orders)\n");
        level15.add("What are bidirectional associations?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "In addition to unidirectional associations there are also bidirectional associations. A pair of properties that are linked together as inverses; The Car class has property owner : Person [1], and the Person class has a property cars : Car [*];\n");
        level15.add("What is instantiation?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "The state of an object-oriented system. A collection of objects, with values for their attributes, a collection of links between objects.\n");
        level15.add("What are associations?" + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "In terms of object diagrams associations are the type construct for links (objects -> classes, links -> associations). Show relationship types between objects and define navigation paths.\n");

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