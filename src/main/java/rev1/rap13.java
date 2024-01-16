package rev1;

public class rap13 {
    /*# **Math Magic**

In this project, you will become a magician and write a small program that performs a mathematical _magic trick_! It will involve performing arithmetic operations on an integer that you created.


**For you to do:**

1. Create an int variable called myNumber. Set it equal to any number other than 0.
2. We will refer to myNumber as the _original number_ from now on.
3. Create an int variable called stepOne. Set it equal to the original number (myNumber) multiplied by itself.
4. Create an int variable called stepTwo. Set it equal to the previous result (stepOne) plus the original number (myNumber).
5. Create an int variable called stepThree. Set it equal to the previous result (stepTwo) divided by the original number.
6. Create an int variable called stepFour. Set it equal to the previous result (stepThree) plus 17.
7. Create an int variable called stepFive. Set it equal to the previous result (stepFour) minus the original number.
8. Create an int variable called stepSix.Set it equal to the previous result (stepFive) divided by 6.
9. Let's print out the value of the last step as: "The magic number is _ !"

Now try running your code! What number is printed to the console?

Now, go back to your code and change myNumber to any other integer.

Run your program again.

Is the output the same?

It's math magic!

**Output:**

```
The magic number is _!
```*/
    public static void main(String[] args) {
        int MyNumber=76;
        int StepOne=MyNumber*MyNumber;
        int StepTow=StepOne+MyNumber;
        int StepThree=StepTow%MyNumber;
        int StepFour=StepThree+17;
        int StepFive=StepFour-MyNumber;
        int StepSix=StepFive/6;
        System.out.println(StepSix);

    }
}
