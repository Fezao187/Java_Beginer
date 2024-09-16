
(The exercise12_2.Item, exercise12_2.Shirt, and Trousers classes are provided.  exercise12_2.Item and exercise12_2.Shirt are very similar to exercise 12-3)

In the exercise12_2.ShoppingCart class:
1.  Examine the code.  As you can see, the items list has been initialized with
       2 shirts and 2 pairs of trousers.
2.  In the removeItemFromCart method, use the removeIf method 
       (which takes a Predicate lambda type) to remove all items 
        whose description matches the desc argument.
3.  Print the items list.  Hint: the toString method in the exercise12_2.Item class has
        been overloaded to return the item description.
4.  Call the removeItemFromCart method from the main method.  Try different
        description values, including ones that will return false.
5.  Test your code.