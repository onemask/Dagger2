package com.android.study.dagger.di

//햄버거를 표현하는 클래스
class Burger(val bun: Bun, val patty: Patty) {}

//햄버거 번 정의
interface Bun {}

//햄버거 패티 정의
interface Patty {}

//소고기 패티 정의
class BeefPatty : Patty { }

//밀 빵을 정의하는 클래스.
class WheatBun : Bun {}


