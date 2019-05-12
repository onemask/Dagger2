package com.android.study.dagger.di.Component

import com.android.study.dagger.di.Inject.Store
import com.android.study.dagger.di.Module.BurgerModule
import dagger.Component

//FastFoodComponent는 BurgerModule로 부터 객체를 제공받는다.

@Component(modules = [BurgerModule::class])
interface FastFoodComponent{

    //Store 클래스에 FastFoodComponent에서 제공하는 객체를 주입 한다.
    fun inject(store: Store)


}




/*
@Component(modules = [BurgerModule::class])
interface FastFoodComponent {

    //Store 클래스에 FastFoodComponent에서 제공하는 객체를 주입 한다.
    public fun inject(store : Store)

    //BurgerModule의 객체를 컴포넌트에 전달합니다.

}*/
