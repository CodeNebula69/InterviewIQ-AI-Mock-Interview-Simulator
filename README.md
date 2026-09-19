# 🎯 InterviewIQ – AI-Powered Mock Interview Simulator

## 📌 Project Overview

InterviewIQ is a Java-based mock interview platform developed using Object-Oriented Programming (OOP) principles. The system simulates technical and HR interviews, evaluates candidate responses, calculates scores, and provides performance feedback.

This project is being developed as part of a B.Tech AIML Project-Based Learning (PBL) project.

---

## 🚀 Problem Statement

Many students face difficulties during placement interviews due to:

- Lack of interview practice
- Limited access to mock interview platforms
- No structured feedback mechanism
- Low confidence during real interviews

InterviewIQ aims to solve these problems by providing a simple interview simulation environment where students can practice and evaluate their performance.

---

# 🎯 Project Objectives

- Simulate real interview scenarios
- Evaluate candidate responses automatically
- Improve interview readiness
- Demonstrate OOP concepts in Java
- Build a scalable foundation for future AI integration

---

# ✅ Phase 1 (Current Progress - 50% Complete)

Phase 1 focuses on creating the core architecture and interview workflow using Java and OOP principles.

### Features Implemented

- Candidate Registration
- Question Bank Management
- Technical and HR Questions
- Interview Session Workflow
- Multi-Factor Answer Evaluation
- Performance Feedback
- Score Calculation
- Final Recommendation System

---

# 🔄 System Workflow

```text
Candidate Registration
        ↓
Question Bank Loading
        ↓
Interview Session Starts
        ↓
Answer Submission
        ↓
Evaluation Engine
        ↓
Score Calculation
        ↓
Performance Feedback
        ↓
Final Result
```

---

# 🧠 OOP Concepts Used

## 1. Abstraction

Implemented using the abstract class:

```java
abstract class Question
```

Provides a common structure for all interview questions.

---

## 2. Inheritance

```java
TechnicalQuestion extends Question
HRQuestion extends Question
```

Allows specialized question types while reusing common functionality.

---

## 3. Polymorphism

```java
Question q = new TechnicalQuestion(...)
```

Enables dynamic handling of different question types.

---

## 4. Encapsulation

Candidate details are stored using private variables and managed through class methods.

---

## 5. Collections Framework

```java
ArrayList<Question>
```

Used to store and manage interview questions dynamically.

---

# 📊 Evaluation Engine

The answer evaluation system uses a multi-factor scoring approach.

| Evaluation Factor | Weight |
|------------------|----------|
| Keyword Matching | 50% |
| Answer Length | 25% |
| Sentence Quality | 25% |

This prevents users from obtaining full marks by entering only keywords and encourages meaningful interview-style responses.

---

# 📋 Performance Analysis

The system provides:

- Question-wise score
- Question-wise feedback
- Final score
- Percentage calculation
- Performance rating
- Interview readiness recommendation

Example:

```text
Keyword Score : 40/50
Length Score  : 20/25
Quality Score : 25/25

Final Score   : 85/100

Feedback      : Excellent
```

---

# 📂 Project Structure

```text
InterviewIQ
│
├── Candidate.java
├── Question.java
├── TechnicalQuestion.java
├── HRQuestion.java
├── QuestionBank.java
├── EvaluationEngine.java
├── InterviewSession.java
├── Main.java
└── README.md
```

---

# 💻 Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Java Collections Framework
- VS Code
- GitHub

---

# 🔮 Phase 2 Roadmap (Remaining 50%)

The next phase will transform InterviewIQ into a more intelligent interview preparation platform.

### Planned Features

#### 🎯 Multi-Round Interviews

- HR Round
- Technical Round
- Problem Solving Round

---

#### 🎯 Adaptive Difficulty System

Question difficulty will change according to user performance.

```text
Easy → Medium → Hard
```

---

#### 🎯 AI-Based Feedback Generator

Provide personalized suggestions for improvement.

Example:

```text
Strength:
Good understanding of OOP

Improvement:
Provide more practical examples
```

---

#### 🎯 Performance Dashboard

Track:

- Total Interviews
- Best Score
- Average Score
- Performance Trends

---

#### 🎯 Interview History

Store and analyze previous interview attempts.

---

#### 🎯 Skill-Based Question Selection

Generate interview questions based on selected skills such as:

- Java
- AIML
- Web Development
- Data Structures

---

#### 🎯 Strength and Weakness Analysis

Identify areas where the candidate performs well and areas requiring improvement.

Example:

```text
Strength:
Java Collections

Weakness:
Exception Handling
```

---

# 🌟 Future Vision

InterviewIQ aims to evolve into an intelligent interview preparation platform capable of delivering adaptive interviews, personalized feedback, performance analytics, and AI-assisted evaluation to help students become placement-ready.

---

# 👨‍💻 Developed By

Team Error 404

Project-Based Learning (PBL)

InterviewIQ – AI-Powered Mock Interview Simulator
