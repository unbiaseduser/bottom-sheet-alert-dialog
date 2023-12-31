package com.sixtyninefourtwenty.bottomsheetalertdialog

/**
 * Class consisting of methods that allow users to manipulate some dialog UI behavior.
 */
@Suppress("unused")
class BottomSheetAlertDialogActions internal constructor(private val ui: BottomSheetAlertDialogCommonUi) {

    fun enableButton(button: DialogButton) {
        ui.setButtonEnabled(button, true)
    }

    fun disableButton(button: DialogButton) {
        ui.setButtonEnabled(button, false)
    }

}