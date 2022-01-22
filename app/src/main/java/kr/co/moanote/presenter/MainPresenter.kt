package kr.co.moanote.presenter

import kr.co.moanote.model.MainModel

class MainPresenter(view:Contract.View) : Contract.Presenter{

    private lateinit var view:Contract.View
    private lateinit var mainModel:MainModel

    init {
        this.view = view                         // Activity View정보 가져와 통신
        mainModel = MainModel(this)     // Model 객체 생성
    }
}