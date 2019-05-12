package com.android.study.dagger.di.Module

import com.android.study.dagger.di.*
import dagger.Module
import dagger.Provides

@Module
class  BurgerModule{

    @Provides
    fun providePatty() : Patty{
        return BeefPatty()
    }

    @Provides
    fun provideBun():Bun{
        return WheatBun()
    }

    @Provides
    fun providesBurger(bun : Bun, patty: Patty) : Burger{
        return Burger(bun,patty)
    }
}



/*
@Module
class BurgerModule {

   *//* 햄버거 객체를 제공한다.
    햄버거 객체를 만들기 위해 필요한 객체는 함수의 매개변수로 선언한다.*//*
    @Provides
    fun providesBurger(bun: Bun, patty: Patty): Burger {
        return Burger(bun, patty)
    }

    //햄버거 빵 제공.
    @Provides
    fun provideBun() : Bun {
        return WheatBun()
    }

    //소고기 패티 적용,
    @Provides
    fun providePatty() : Patty {
        return BeefPatty()
    }

}*/
