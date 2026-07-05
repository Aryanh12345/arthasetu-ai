# System Architecture

## High-Level Architecture

┌───────────────────────────┐
│       React Frontend      │
│ (Vite + Tailwind + Charts)│
└─────────────┬─────────────┘
              │ REST APIs
              ▼
┌───────────────────────────┐
│   Spring Boot Backend     │
│ Authentication & Business │
│         Logic             │
└─────────────┬─────────────┘
              │
              ▼
┌───────────────────────────┐
│      PostgreSQL DB        │
│ Users, Scores, Profiles   │
└─────────────┬─────────────┘
              │
              ▼
┌───────────────────────────┐
│      Python ML Service    │
│ XGBoost + SHAP + Rules    │
└───────────────────────────┘

---

## Frontend Components

- Landing Page
- Registration/Login
- Trust Score Dashboard
- Risk Assessment Interface
- Investment Simulator
- Financial Roadmap Viewer

---

## Backend Modules

### User Module
- Registration
- Authentication
- Profile Management

### Trust Score Module
- Score calculation
- Feature extraction
- Explanation generation

### Investment Module
- Risk assessment
- Asset recommendation
- Growth simulation

### Roadmap Module
- Monthly goals
- Improvement tracking

---

## Database Tables

### users
- id
- name
- age
- occupation
- monthly_income

### transactions
- user_id
- recharge_frequency
- utility_payments
- ecommerce_activity

### trust_scores
- user_id
- score
- confidence
- created_at

### investments
- user_id
- risk_level
- recommendation

---

## AI Components

### Trust Engine
Technology:
- XGBoost
- Rule-Based Validation

Inputs:
- Digital financial behavior

Outputs:
- Trust Score (0–1000)

---

### Explainability Layer

Technology:
- SHAP

Outputs:
- Top 3 positive factors
- Top 3 improvements
- Feature importance charts