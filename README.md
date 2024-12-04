# Court Calendar Management System  

## 📖 Description  
The Court Calendar Management System is a backend API built with **Spring Boot** to manage court schedules, case statuses, and notifications. This API helps legal professionals, court administrators, and users streamline case management processes and stay updated with case statuses and schedules.  

---

🤝 Contributing
Contributions, issues, and feature requests are welcome! Feel free to fork the repository and submit a pull request.

## ✨ Features  

### 1. **User Management**  
   - Role-based access control:
     - Admin
     - Judges
     - Lawyers
     - Public Users
   - User registration and authentication (JWT-based).  
   - Profile management for all roles.

### 2. **Case Management**  
   - CRUD operations for:
     - Cases
     - Parties involved
     - Case details (e.g., title, description, type, status).  
   - Assign cases to judges and lawyers.  
   - Update case progress and status (e.g., open, in progress, closed).  

### 3. **Courtroom and Calendar Management**  
   - Manage courtrooms (e.g., courtroom availability).  
   - Schedule hearings with date and time allocation.  
   - Reschedule or cancel hearings.  
   - View and filter hearings on a calendar interface.  

### 4. **Notifications and Reminders**  
   - Automated notifications for:
     - Upcoming hearings.
     - Changes in case status.
     - Newly assigned cases.  
   - Email or SMS reminders for critical updates.  

### 5. **Search and Filter Functionality**  
   - Search for cases by:
     - Case number.
     - Parties involved.
     - Date range.  
   - Filter cases by status, type, or assigned judge/lawyer.  

### 6. **Reporting and Analytics**  
   - Generate reports for:
     - Case history and progress.
     - Monthly or yearly hearing schedules.  
   - Analytics on case types, outcomes, and durations.  

### 7. **Audit Trail**  
   - Record changes made to cases and schedules.  
   - Keep track of which user performed specific actions.  

### 8. **Public Access Features**  
   - View publicly available case information (restricted data only).  
   - Search for case hearing schedules.  

---

## 🛠️ Tech Stack  

- **Backend**: Spring Boot, Spring Data JPA, Spring Security, Hibernate.  
- **Database**: MySQL / PostgreSQL.  
- **Authentication**: JSON Web Tokens (JWT).  
- **Other Tools**: Swagger (API documentation), Maven / Gradle (build management).  

---

## 🚀 Installation and Setup  

1. Clone the repository:  
   ```bash  
   git clone https://github.com/yourusername/court-calendar-management.git  
   cd court-calendar-management  
