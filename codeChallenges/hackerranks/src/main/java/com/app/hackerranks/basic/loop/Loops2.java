/*
We use the integers , , and  to create the following series:

You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and  values as a single line of  space-separated integers.

Input Format

The first line contains an integer, , denoting the number of queries.
Each line  of the  subsequent lines contains three space-separated integers describing the respective , , and  values for that query.

Constraints

Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.

Sample Input

2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
Explanation

We have two queries:

We use , , and  to produce some series :

... and so on.

Once we hit , we print the first ten terms as a single line of space-separated integers.

We use , , and  to produce some series :

We then print each element of our series as a single line of space-separated values.
* */
package com.app.hackerranks.basic.loop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Loops2 {

  public static void main(String[] args) throws IOException {

    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    List<String> data = new ArrayList<>();
    List<String> result = new ArrayList<>();
    int a = 0;
    int b = 0;
    int n = 0;
    int cont = 0;
    while (cont <= t) {
      cont++;
      data.add(in.nextLine());
    }
    data.remove("");
    in.close();
    for (String d : data) {
      String[] newStr = d.split("\\s+");
      a = Integer.parseInt(newStr[0]);
      b = Integer.parseInt(newStr[1]);
      n = Integer.parseInt(newStr[2]);
      result.add(makeSeries(a, b, n));

    }
    result.forEach(System.out::println);

  }

  private static String makeSeries(int a, int b, int n) throws IOException {
    final int VALUE_FOR_SERIE = 2;
    AtomicInteger first = new AtomicInteger(0);
    AtomicInteger count = new AtomicInteger(0);
    return IntStream.iterate(0, s -> s + 1)
        .map(p -> (int) Math.pow(VALUE_FOR_SERIE, p))
        .limit(n)
        .map(serie -> {
          Integer result = 0;
          if (serie == 1) {
            first.set(a + (b * serie));
            count.set(first.get());
            result = count.get();
          } else {
            result = count.get() + (serie * b);
            count.set(result);
          }
          return result;
        })
        .boxed()
        .map(i -> i.toString())
        .collect(Collectors.joining(" "));

  }


}

