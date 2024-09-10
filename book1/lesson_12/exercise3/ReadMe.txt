Exercise 12-3

(The exercise12_2.Item class is the same as it was in exercise 12-1.)

In the exercise12_2.Shirt class:
1.  Add a public getColor method that converts the colorCode field 
      into the corresponding color name (example: 'R' = "Red"). Include
      at least 3 colorCode/color combinations.  
2.  Use a switch statement in the method and return the color String. 

In the exercise12_2.ShoppingCart class:
3.  Declare and instantiate a exercise12_2.Shirt object using an exercise12_2.Item reference type.
      Call the 3-arg constructor to assign values.
4.  Call the display method of the object.
5.  Use instanceof to confirm that the object is, indeed, a exercise12_2.Shirt.
6.  If it is a exercise12_2.Shirt,
      - cast the object to a exercise12_2.Shirt and call the getColor method, assigning
        the return value to a String variable.
      - Print out the color name using a suitable label.
7.  If it is not a exercise12_2.Shirt, print a message to that effect.
8.  Test your code.  You can test the non-exercise12_2.Shirt object condition
      by instantiating an exercise12_2.Item object instead of a exercise12_2.Shirt object.