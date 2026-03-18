# 🚗 MotorPH Automatic Payroll System (Individual Version)
**Student Name:** Princess Jade R. Magahis  
**Course & Section:** IT101 - Computer Programming 1  
**Project Type:** Individual Final Project

---

## 📝 Project Description
This is my independent implementation of the **MotorPH Automatic Payroll System**. While originally a group concept, this repository contains my unique code structure and logic. 

The system is a Java-based solution designed to automate the computation of employee salaries, integrating attendance data with Philippine statutory deductions (SSS, PhilHealth, Pag-IBIG) and Tax withholding.

## ✨ Key Features (Solo Edition)
* **Dual-Portal System:** Separate login paths for **Employees** (View Profile) and **Payroll Personnel** (Process Salaries).
* **Dynamic Payroll Calculation:** * Automatic calculation of Gross Pay based on Hourly Rates.
    * Accurate deduction logic for SSS, PhilHealth, and Pag-IBIG.
    * Withholding Tax computation based on BIR standards.
* **Data Integration:** Reads employee data and attendance logs from `.csv` files.
* **Cutoff Management:** Supports bimonthly cutoff periods (1–15 and 16–31).

## 🛠 Tech Stack
* **Language:** Java (JDK 17 or higher)
* **IDE:** NetBeans IDE
* **File Format:** CSV (Comma Separated Values) for data storage

## 📂 Project Structure
* `src/` - Contains all Java source files and logic.
* `EmployeeDetails.csv` - Database of employee profiles and salary rates.
* `AttendanceRecords.csv` - Log of time-in/time-out data for all staff.
* `LICENSE` - MIT License for open-source use.

## 🚀 How to Run
1. **Clone the Repo:** `git clone https://github.com/[YOUR-USERNAME]/MO-IT101-Magahis.git`
2. **Open in NetBeans:**
   Go to `File > Open Project` and select the folder.
3. **Check CSV Files:**
   Ensure `EmployeeDetails.csv` and `AttendanceRecords.csv` are in the project root folder.
4. **Run:**
   Execute the main class (usually `MotorPH_Automatic_Payroll_System.java`).

## 📊 Logic & Computation
This project handles complex payroll formulas including:
1. **Total Hours:** Calculated from raw attendance logs.
2. **Deductions:**
   - **SSS:** Based on salary brackets.
   - **PhilHealth:** 5% total (Shared between employee/employer).
   - **Pag-IBIG:** Fixed contribution rates.
3. **Net Pay:** Gross Salary - (Deductions + Withholding Tax).

---
*Note: This project was developed as a requirement for IT101 at [Mapúa Malayan Digital College].*
