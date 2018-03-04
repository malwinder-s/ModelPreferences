Android library for saving or reading any model object in Preferences

How to use?

This library defines two methods:

putObject(key, object)

key: Key of Shared Preference

object: Object of your model class

AND

YourObject getObject(key, Class)

YourObject: Returned by this method
key: Key which was used
Class: Class of this object. Example: In above case: Apple.class

Suppose you created model class:

class Apple {
 int weight;
 float price;
 
 public void setWeight(int weight) {
 this.weight = weight;
 }
 
 public void setPrice(float price) {
 this.price = price;
 }
}

Now, to save above object using this library into the SharedPreferences:

Water water = new Water(context);
//Save
water.putObject("KEY_APPLE_SMALL", new Apple(200,34));
//Retreive
Apple apple = water.getObject("KEY_APPLE_SMALL", Apple.class);


Thank you.
My LinkedIn profile: https://www.linkedin.com/in/malwinder/
