public class OneAway {
    
}

/*
    3 types of edits
    1) insert a char
    2) remove a char
    3) replace a char

    given 2 strings, write a function to check if they are one or zero edits away

    Questions
    1) are white spaces included, and if so, should they be considered?
    2) are capital letters and undercase letters considered the same?
    3) can a null string be given as an input?
    
    Method 1- brute force
    - for each input string, find all possible adjustments and see if one matched the output string

    Method 2 - case by case

    - seperate into each edit type
        <0 steps>
            - same length
            - same chars
        <1 step>
        (1) same length
            - cycle through each car, and  
 */
