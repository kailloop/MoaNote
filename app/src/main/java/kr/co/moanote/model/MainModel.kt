package kr.co.moanote.model

import kr.co.moanote.presenter.Contract

class MainModel(presenter:Contract.Presenter) {
    private var presenter:Contract.Presenter

    init {
        this.presenter = presenter
    }


}