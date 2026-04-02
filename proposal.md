# UnderDev - AI-Powered Undergraduate Developers Productivity System

Estimated Complete Time - 6–8 weeks

## 🚀 Project Overview

DevFlow is a full-stack productivity system designed for undergraduate developers to:

* Plan tasks and projects
* Generate AI-based schedules
* Track focus time and productivity
* Analyze performance trends

# 🛠️ Tech Stack

* **Frontend:** Angular (TypeScript)
* **Backend:** Spring Boot (Java)
* **Database:** PostgreSQL
* **Authentication:** JWT + Spring Security
* **AI Integration:** OpenAI API
* **Deployment:** Docker + Cloud (Render / Netlify)

# 🗓️ Project Timeline (8 Weeks)

## ✅ Week 1: Project Setup

### Backend

* [ ] Initialize Spring Boot project
* [ ] Add dependencies (Web, JPA, Security)
* [ ] Setup project structure (controller, service, repository, dto)

### Frontend

* [ ] Install Angular CLI
* [ ] Create Angular project
* [ ] Setup folder structure (core, shared, features)

### Goal

* [ ] Backend running on `localhost:8080`
* [ ] Frontend running on `localhost:4200`


## ✅ Week 2: Authentication System

### Backend

* [ ] Implement user entity
* [ ] Setup JWT authentication
* [ ] Create login/register APIs
* [ ] Encrypt passwords using BCrypt

### Frontend

* [ ] Create login & register UI
* [ ] Implement auth service
* [ ] Add route guards

### Goal

* [ ] User can register and login securely


## ✅ Week 3: Task Management

### Backend

* [ ] Create Task entity (title, description, deadline, priority)
* [ ] Implement CRUD APIs:

  * [ ] GET /tasks
  * [ ] POST /tasks
  * [ ] PUT /tasks/{id}
  * [ ] DELETE /tasks/{id}

### Frontend

* [ ] Create task dashboard
* [ ] Add task creation form
* [ ] Implement edit & delete functionality
* [ ] Connect APIs via Angular service

### Goal

* [ ] Fully functional task system


## ✅ Week 4: AI Smart Scheduler

### Backend

* [ ] Integrate Azure OpenAI API
* [ ] Create schedule generation API:
  * [ ] POST /schedule/generate
* [ ] Design prompt for schedule generation

### Frontend

* [ ] Add “Generate Schedule” button
* [ ] Display generated schedule in UI

### Goal

* [ ] AI-generated schedules working


## ✅ Week 5: Focus Tracking & Analytics

### Backend

* [ ] Create FocusSession entity
* [ ] Implement APIs:

  * [ ] POST /focus/start
  * [ ] POST /focus/stop
  * [ ] GET /focus/stats

### Frontend

* [ ] Build focus timer (Pomodoro)
* [ ] Create analytics dashboard
* [ ] Display daily/weekly stats

### Goal
* [ ] Users can track productivity

## ✅ Week 6: Advanced Features

* [ ] Burnout detection (AI suggestions)
* [ ] Email notifications (Spring Mail)
* [ ] GitHub activity integration
* [ ] Adaptive scheduling (based on missed tasks)


## ✅ Week 7: Testing & Improvements

### Backend

* [ ] Add global exception handler
* [ ] Implement logging (SLF4J)
* [ ] Write unit tests (JUnit + Mockito)

### Frontend

* [ ] Improve UI (Angular Material / Tailwind)
* [ ] Add error handling

## ✅ Week 8: Deployment

### Backend

* [ ] Dockerize Spring Boot app
* [ ] Deploy to cloud (Render / AWS / Railway)

### Frontend

* [ ] Build Angular app
* [ ] Deploy to Netlify / Vercel

### Extras

* [ ] Add Swagger API documentation
* [ ] Write complete README
* [ ] Add screenshots & architecture diagram

### Goal

* [ ] Live deployed application

---

# 🏗️ Architecture

```
Angular Frontend
        ↓ HTTP
Spring Boot Backend
        ↓
PostgreSQL Database
        ↓
OpenAI API
```

---

# 📦 Core Features Checklist

* [ ] User Authentication (JWT)
* [ ] Task Management System
* [ ] AI Schedule Generator
* [ ] Focus Tracking Timer
* [ ] Productivity Analytics Dashboard
* [ ] Advanced Feature (Burnout / Notifications / GitHub)
* [ ] Fully Deployed Application





