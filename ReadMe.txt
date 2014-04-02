1. generate service from wsdl, and copy to java directory

    > cd ./wsdl
    > wsdl2java -encoding utf-8 -frontend jaxws21 ws320.wsdl11.wsdl


2. write SIB and implements the generate SEI Ws320 class

    public class Ws320Impl implements Ws320

