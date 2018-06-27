create table department
(
  departmentId int auto_increment
  constraint `PRIMARY`
  primary key,
  name         varchar(15) not null
);

create table course
(
  courseId     int auto_increment
  constraint `PRIMARY`
  primary key,
  departmentId int          not null,
  courseNo     int          not null,
  title        varchar(150) not null,
  credits      varchar(15)  not null,
  number       bigint       not null,
  constraint course_department_departmentId_fk
  foreign key (departmentId) references department (departmentId)
);

create index course_department_departmentId_fk
  on course (departmentId);

create table professor
(
  professorId  int auto_increment
  constraint `PRIMARY`
  primary key,
  departmentId int         not null,
  name         varchar(50) not null,
  constraint professor_ibfk_1
  foreign key (departmentId) references department (departmentId)
);

create index department_id
  on professor (departmentId);

create table semester
(
  semesterId int auto_increment
  constraint `PRIMARY`
  primary key,
  year       int        not null,
  season     varchar(6) not null
);

create table rate
(
  rateId        int auto_increment
  constraint `PRIMARY`
  primary key,
  timestamp     date            not null,
  courseId      int             null,
  professorId   int             null,
  courseName    varchar(150)    null,
  professorName varchar(50)     null,
  semesterId    int             not null,
  credits       int             null,
  grade         varchar(10)     not null,
  difficulty    double          not null,
  quality       double          not null,
  workload      double          not null,
  recommend     int             not null,
  suggestion    varchar(2000)   null,
  viewable      int default '0' not null,
  constraint rate_course_courseId_fk
  foreign key (courseId) references course (courseId),
  constraint rate_professor_professorId_fk
  foreign key (professorId) references professor (professorId),
  constraint rate_ibfk_3
  foreign key (semesterId) references semester (semesterId)
);

create index courseId
  on rate (courseId);

create index professorId
  on rate (professorId);

create index semester_id
  on rate (semesterId);

create table students
(
  studentId   int auto_increment
  constraint `PRIMARY`
  primary key,
  email       varchar(100) not null,
  password    varchar(8)   not null,
  createdDate date         null,
  messageRecipient    varchar(20)  not null,
  courseId    int          null,
  constraint students_course_courseId_fk
  foreign key (courseId) references course (courseId)
);

create index email_index
  on students (email);

create index students_course_courseId_fk
  on students (courseId);


