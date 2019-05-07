package net.the4thdimension.cryptoreadertv.presenters

import net.the4thdimension.cryptoreadertv.contracts.ContractInterface
import net.the4thdimension.cryptoreadertv.models.MainModel

class MainPresenter(_view: ContractInterface.View?) : BasePresenter(), ContractInterface.Presenter {

    var view = _view
    val mainModel : MainModel = MainModel()

    override fun onData() {
        view?.showData(mainModel.getData())
    }
}