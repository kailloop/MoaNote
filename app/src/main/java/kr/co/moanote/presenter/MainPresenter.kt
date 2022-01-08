package kr.co.moanote.presenter

import kr.co.moanote.model.MainModel

class MainPresenter(view:Contract.View) : Contract.Presenter{

    lateinit var mainModel:MainModel

    init {
        mainModel = MainModel(this)
    }

    override fun chk() {

    }
}