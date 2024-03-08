package org.example;


public class Main
{
  public static void main(String[] args)
  {
    final int x = 0;
    for (int i = 0; i <5 ; i++)
    {
      switch(x)
      {
        case 0 -> function(i);
        case 1 -> function(i);
      }
    }
  }
  
  private static void function(int s)
  {
    System.out.println(s);
  }
}