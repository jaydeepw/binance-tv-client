package net.the4thdimension.cryptoreadertv.contracts

import net.the4thdimension.cryptoreadertv.views.BaseView

interface ContractInterface {

    interface View: BaseView {
        fun initView()
        fun showData(list: List<String>?)
    }

    interface Presenter {
        fun onData()
    }

    interface Model {
        fun getData(): List<String>
    }

}