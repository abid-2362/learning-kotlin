//package com.example.main

fun main() {
    val abidAccount = Account("Abid")
    abidAccount.deposit(1000)
    abidAccount.withdraw(1500)
    abidAccount.deposit(-10)
    abidAccount.calculateBalance()
}

class Account(val accountName: String) {
    private var balance = 0
    private var transactions: MutableList<Int> = mutableListOf<Int>()

    fun deposit(amount: Int) {
        if (amount > 0) {
            transactions.add(amount)
            balance += amount
            println("$amount deposited, Balance is now $balance")
        } else {
            println("Deposit amount must be positive")
        }
    }

    fun withdraw(amount: Int) {
        if (amount > 0 && amount <= balance) {
            transactions.add(-amount)
            balance += -amount
            println("$amount withdrawn, Balance is now $balance")
        } else if (amount > balance) {
            println("Insufficient balance to withdraw $amount. Your current balance is $balance")
        } else {
            println("Invalid withdrawal amount, amount must be between 0 and $balance")
        }
    }

    fun calculateBalance(): Int {
        var currentBalance = 0
        for (transaction in transactions) {
            currentBalance += transaction
        }

        if (currentBalance == this.balance) {
            println("Current balance is $currentBalance")
            return currentBalance
        } else {
            println("The data seems to be corrupted. calculated Balance is $currentBalance but the account balance is $this.balance")
            return currentBalance
        }
    }
}
