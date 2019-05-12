package com.android.study.dagger.di.Inject

import com.android.study.dagger.di.Component.DaggerFastFoodComponent
import com.android.study.dagger.di.Module.BurgerModule

class Store{

   /* @Inject 어노테이션을 사용하여
    컴포넌트로부터 객체를 주입받는 것으로 표시합니다.
    프로퍼티 선언 시점에 객체를 초기화하지 않으므로
    latenint으로 선언해야 한다.. */

init {
    DaggerFastFoodComponent.builder()
        .burgerModule(BurgerModule())
        .build()
        .inject(this)
    DaggerFastFoodComponent.builder()
        //BuggerModule의 객체를 컴포넌트에 전달한다.
        .burgerModule(BurgerModule())
        .build()

        //FoodComponent로 부터 객체를 전달받는다.
        .inject(store = this)
}

}