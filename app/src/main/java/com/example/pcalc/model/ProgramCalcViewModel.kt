package com.example.pcalc.model

import androidx.lifecycle.ViewModel
import com.example.pcalc.component.NumberSystem
import com.example.pcalc.component.Operator
import java.math.BigInteger

class ProgramCalcViewModel: ViewModel(){
    var initialized = false
    var textEXP = ""
    var textRES = ""
    var numberSys: NumberSystem = NumberSystem.DEC
    var currentOp: Operator? = null
    var isCalcPending = false
    var prevResult: BigInteger = BigInteger("0")
    var clearInput = false
    var divByZero = false
    var opPresent = false
}