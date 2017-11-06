package com.se77.java9.examples;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class StackWalkerTest {

    @Test
    public void testStackWalker(){

        // optain a stackwalker for the current thread
        StackWalker walker = StackWalker.getInstance();

        // print the current stack trace
        walker.forEach(System.out::println);
    }

    @Test
    public void testStackWalkerWithLimit(){
        StackWalker walker = StackWalker.getInstance();

          // collect the first two elements to a list.
          List<?> elements = walker.walk(s -> s.limit(2).collect(Collectors.toList()) );

        // and print the list
        elements.forEach(System.out::println);
    }

    @Test
    public void testGetCallerClass(){

        // we need this option to access the caller class
        StackWalker walker = StackWalker.getInstance(StackWalker.Option.RETAIN_CLASS_REFERENCE);

        System.out.println(walker.getCallerClass());
    }

    @Test
    public void testGetStackTraceElementInfos(){

        StackWalker sw = StackWalker.getInstance(StackWalker.Option.RETAIN_CLASS_REFERENCE);

        // output all available information of a statrace element
        sw.forEach( f->
        {
            System.out.printf("Bytecode index: %d%n",
                    f.getByteCodeIndex());
            System.out.printf("Class name: %s%n",
                    f.getClassName());
            System.out.printf("Declaring class: %s%n",
                    f.getDeclaringClass());
            System.out.printf("File name: %s%n",
                    f.getFileName());
            System.out.printf("Is native: %b%n",
                    f.isNativeMethod());
            System.out.printf("Line number: %d%n",
                    f.getLineNumber());
            System.out.printf("Method name: %s%n%n",
                    f.getFileName());
        });
    }
}
