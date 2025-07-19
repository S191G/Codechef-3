# Codechef-3
# 💻 String Utility Problems in Java

Welcome to my collection of Java-based solutions for common string manipulation problems. This repository contains individual programs that solve classic problems often seen in interviews and coding platforms.

---

## 📂 Contents

1. [Title Case Converter](#1-title-case-converter)
2. [Different Consecutive Characters](#2-different-consecutive-characters)
3. [DNA String Validity Checker](#3-dna-string-validity-checker)
4. [Wordle - Java Version](#4-wordle---java-version)

---

## 1. Title Case Converter

**Problem Statement:**  
Convert a given string to title case where:
- The first letter of each word is capitalized.
- Words that are acronyms (entirely in uppercase) are left unchanged.

✅ Handles edge cases like mixed case input and preserves acronyms.  
📥 Input: Single string  
📤 Output: Title-cased string  

### Example:
**Input:** `"this is NASA and isro"`  
**Output:** `"This Is NASA And Isro"`

---

## 2. Different Consecutive Characters

**Problem Statement:**  
Given a binary string (`0`s and `1`s), determine the minimum number of insertions required so that no two consecutive characters are the same.

💡 Insertion can be at any position.  
📥 Input: Binary string  
📤 Output: Minimum number of insertions  

### Example:
**Input:** `"001100"`  
**Output:** `3`

---

## 3. DNA String Validity Checker

**Problem Statement:**  
Check if a string is a valid DNA sequence. A valid DNA string contains only the characters: `'A'`, `'T'`, `'C'`, `'G'`.

📥 Input: DNA sequence string  
📤 Output: `"Valid"` or `"Invalid"`  

### Example:
**Input:** `"ATGCGTA"`  
**Output:** `"Valid"`

---

## 4. Wordle - Java Version

🎮 A mini Java implementation of the popular game **Wordle**!

**Features:**
- Predefined word list or randomized selection
- User guesses a 5-letter word
- Feedback provided: ✅ Correct, ❌ Incorrect, or 🟨 Wrong position

📥 Input: User guess  
📤 Output: Status per letter

---

## 🛠️ Technologies Used

- Java
- VS Code
- Git & GitHub

---

## 📦 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/string-utilities-java.git
   cd string-utilities-java
