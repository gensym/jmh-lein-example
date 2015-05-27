package org.gensym.jmh;

import org.openjdk.jmh.annotations.Benchmark;
import org.gensym.jmh.example;


public class Hello {
    public static void main(String[] args) {
	System.out.println(example.foo(2));
    }

    @Benchmark
    public int testMethod() {
	return example.foo(2);
    }


}

