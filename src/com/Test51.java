package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Father {}

    class Son extends Father {}

    class GrandSon extends Son {}

    abstract class Super51 {
        abstract List<Father> get();
    }

    class Sub51 extends Super51 {
        public List<Father> get(){
            return null;
        }

  /*      public ArrayList<Father> get(){
            return null;
        }*/

       /* public List<Son> get() {return null;}*/

        //ArrayList<Son> get() {return null;}

        //List<GrandSon> get() {return null;}

        //List<Object> get() {return null;}

        //ArrayList<Object> get() {return null;}
    }

