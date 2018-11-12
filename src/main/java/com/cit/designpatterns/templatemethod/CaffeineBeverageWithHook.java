package com.cit.designpatterns.templatemethod;

public abstract class CaffeineBeverageWithHook
{
    final void prepareRecipe()
    {
        boilWater();
        brew();
        pourInCup();
        // 我们加上了一个小小的条件语句，而该条件是否成立，
        // 是由一个具体方法customerWantsCondiments()决定的。
        // 如果顾客“想要”调料，只有这时我们才调用addCondiments()。
        if (customerWantsCondiments())
        {
            addCondiments();
        }
    }

    public final void boilWater()
    {
        System.out.println("Boiling water");
    }

    public final void pourInCup()
    {
        System.out.println("Pouring into cup");
    }

    abstract void brew();

    abstract void addCondiments();

    // 我们在这里定义了一个方法，（通常）是空的缺省实现。这个方法只会返回true，不做别的事。
    // 这就是一个钩子，子类可以覆盖这个方法，但不见得一定要这么做。
    boolean customerWantsCondiments()
    {
        return true;
    }
}