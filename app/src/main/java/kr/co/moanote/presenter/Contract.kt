package kr.co.moanote.presenter

public interface Contract {
    interface View {
        fun showResult(answer:Int)
    }

    interface Presenter {
        fun chk()
    }
}