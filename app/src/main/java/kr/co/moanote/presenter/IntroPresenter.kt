package kr.co.moanote.presenter

import kr.co.moanote.model.IntroModel

class IntroPresenter(view:Contract.View) : Contract.Presenter {
    private lateinit var view:Contract.View
    private lateinit var introModel:IntroModel

    init {
        this.view = view
        introModel = IntroModel(this)
    }
}