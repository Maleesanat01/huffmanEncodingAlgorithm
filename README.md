# Huffman encoding algorithm

## Introduction
This repository consists of a Huffman encoding algorithm built using java, OOP and suitable data structures. 
Where the user is able to input a message, and the algorithm will display the encoded message to the user.

Note: This algorithm was implemented with all data structures hard-coded (no in-built libraries used)

### How it works
- User is able to input a message
- Algorithm stores the character and its corresponding frequencies in a linked list of objects
- The algorithm will then use two linked list based queues to compare and dequeue two least weighted nodes
- The two dequed nodes are then used to create an internal node
- The internal node is enqueued to queue 2
- These steps are repeated and the tree is formed in queue 2
- The algorithm then creates a dictionary that stores the character with its corresponding Huffman codes after Huffman tree traversal
- The dictionary is then used to encode and disply encoded message


## 💻 Tech Stack:

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
