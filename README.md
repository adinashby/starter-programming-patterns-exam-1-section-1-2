# Programming Patterns - Exam 1 Section 1 and 2

This template repository is the starter project for Programming Patterns Exam 1 Section 1 and 2. Written in Java, and tested with Gradle/JUnit.

### Question(s)

Write a program that receive two strings namely “str” and “letters” and finds the minimum window in “str” which will contain all the characters in “letters”. Input string “str” can take alphabets, numbers, spaces, commas and periods. It cannot exceed column 70 (max length of “str”<=70). The second line of the input “letters” will not be greater than the size of string “str”. The search is case-sensitive.

**Note:** It is important to keep the complexity of the algorithm to O(n). Otherwise, you will get partial marks even if all testcases pass.

Example 1:

Input: str = "qploresinazxrhqk<ins>**nhoil**</ins>erthf"  
letters = "lion"  
Output: "nhoil"

Example 2:

Input: str = "MKWPLNHNNKLASOPQ<ins>**LRHLI**</ins>"  
letters = "HILL"  
Output: "LRHLI"

Example 3:

Input: str = "1qnkyp098fSkkmnQr<ins>**yS9pkYn0Qd7**</ins>mksy0fRW0a7Sxzc"  
letters = "Sky07"  
Output: "yS9pkYn0Qd7"

### Setup Command

`gradle clean`

### Run Command

`gradle test`
