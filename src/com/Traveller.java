package com;

abstract class Traveller {
    void travel(String place){}
}
 
abstract class BeachTraveller extends Traveller {
    //public void travel(String place){}
    //no method with body
    //abstract  void travel(String place);
    //public void travel(String place) throws RuntimeException{}
}