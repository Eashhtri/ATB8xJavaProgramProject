package oct_oops.ex_14102024.abstraction;

public class Lab_118 {
}

interface I1{
    int age =10;//In interface all of them are oie constant like final
}
interface I2{}
class A{}
class B{}
class Test1 extends A{}//Single Inheritance
//class Test1 extends A,B{}//Multiple inheritance never possible while using class
class Test3 implements I1{}
class Test4 implements I1,I2{}//Multiple inheritance can be possible using Interfaces only
class Test5 extends A implements I1,I2{}//This is also possible
//class  Test6 implements I1 extends {}//This is not possible first always extends then implements