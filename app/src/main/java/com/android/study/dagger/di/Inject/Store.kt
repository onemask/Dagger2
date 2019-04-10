package com.android.study.dagger.di.Inject

import com.android.study.dagger.di.Component.DaggerFastFoodComponent

class Store{

   /* @Inject 어노테이션을 사용하여
    컴포넌트로부터 객체를 주입받는 것으로 표시합니다.
    프로퍼티 선언 시점에 객체를 초기화하지 않으므로
    latenint으로 선언해야 한다.. */

init {
    DaggerFastFoodComponent.builder()
}

}