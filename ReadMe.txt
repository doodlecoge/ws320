1. generate service from wsdl, and copy to java directory

    > cd ./wsdl
    > wsdl2java -encoding utf-8 -frontend jaxws21 ws320.wsdl11.wsdl


2. write SIB and implements the generate SEI Ws320 class

    public class Ws320Impl implements Ws320


# 2014-04-04
complete:
    1. wsdl 1.1
    2. interface structures
    3. code framework

todo:
    1. global memory
    2. db interface & design
    3. hospital webservice client transfer
    4. config design

fixme:
    1. ...