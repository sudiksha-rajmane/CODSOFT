# 🏦 ATM Interface

## 📌 Project Description

The **ATM Interface** is a Java-based console application developed as part of the **CODSOFT Java Development Internship**.

The application simulates basic ATM operations by connecting an `ATM` class with a `BankAccount` class. Users can check their account balance, deposit money, withdraw money, and safely exit the application.

## ✨ Features

* Check current account balance
* Deposit money into the account
* Withdraw money from the account
* Validates deposit and withdrawal amounts
* Prevents withdrawals when the balance is insufficient
* Displays appropriate transaction messages
* Simple and user-friendly console interface

## 🛠️ Technologies Used

* **Java**
* **Scanner Class** – for user input
* **Object-Oriented Programming (OOP)**
* **Classes and Objects**
* **Methods**
* **Conditional Statements**
* **Switch-Case**

## 📂 Project Structure

```text
Task3_ATMInterface
│
├── ATM.java
├── BankAccount.java
└── README.md
```

## 💰 Initial Balance

The program starts with an initial account balance of:

```text
₹10,000
```

## ▶️ How to Run

### 1. Open the project directory

Navigate to the `Task3_ATMInterface` folder.

### 2. Compile the Java files

```bash
javac BankAccount.java ATM.java
```

### 3. Run the application

```bash
java ATM
```

## 🖥️ Sample Output

```text
=================================
          ATM INTERFACE
=================================

1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit

Enter your choice: 1

Current Balance: ₹10000.0

Enter your choice: 2

Enter deposit amount: ₹2000
₹2000.0 deposited successfully.

Enter your choice: 3

Enter withdrawal amount: ₹1500
₹1500.0 withdrawn successfully.

Enter your choice: 1

Current Balance: ₹10500.0

Enter your choice: 4

Thank you for using the ATM.
```

## 🎯 Internship Task

**Organization:** CODSOFT
**Internship:** Java Development Internship
**Task:** Task 3 – ATM Interface

## 📚 Learning Outcomes

Through this project, I practiced:

* Java programming
* Object-Oriented Programming concepts
* Creating and using classes
* Methods and constructors
* Encapsulation
* User input handling
* Input validation
* Conditional logic
* Switch-case statements
* Basic banking transaction logic

## 📄 License

This project was developed for educational purposes as part of the CODSOFT Java Development Internship.
