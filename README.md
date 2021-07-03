# data-structures-binary-tree-cars
Higher Diploma in Computing, Software Development, Data Structures module.
This small project was created as a practice exercise with binary trees in Java, using generics.
The projects defines a comparable Cars Object that contains the following information: Model, Year, Price, CO2 
Emission label (integer assigned between the range of 0-10, with least CO2 Emission cars closer to 0).
Comparison of Car Objects should use the CO2 Emission label.
An interface for a Binary Tree is created that ensures that only trees of comparable objects can be constructed. 
Methods to implement: 
- isEmpty, checks if tree contains no nodes
- add, inserts new node into the tree
- size,  counts the number of nodes in the tree
- minEmission, finds the minimum CO2 emission car
- maxEmission, finds the maximum CO2 emission car
- inOrder, a tree traversal method, prints the nodes in ascending order.

