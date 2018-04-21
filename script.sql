create table ratings
(
  ratingId    int auto_increment
    primary key,
  clarity     int          null,
  schoolYear  int          null,
  easiness    int          null,
  comment     varchar(100) null,
  professorId int          null,
  createdDate datetime     not null,
  updatedDate datetime     not null,
  studentId   int          null,
  helpfulness int          null,
  finalGrade  char         null,
  subject     varchar(20)  null,
  teacherId   int          null
);

create index ratings_teacherId_index
  on ratings (teacherId);

create table students
(
  studentId   int auto_increment
    primary key,
  email       varchar(100) not null,
  password    varchar(8)   not null,
  createdDate datetime     null,
  updatedTime datetime     null
);

create index email_index
  on students (email);

create table teachers
(
  teacherId    int auto_increment
    primary key,
  firstName    varchar(20) not null,
  lastName     varchar(20) not null,
  middleName   varchar(20) not null,
  department   varchar(20) not null,
  universityId int         null,
  createdDate  datetime    null,
  updatedDate  datetime    null
);

create table subjects
(
  subjectId    int         null,
  name         varchar(20) null,
  departmentId int         null,
  teacherId    int         null,
  createdDate  datetime    null,
  updatedDate  datetime    null,
  constraint subjects_teachers_teacherId_fk
  foreign key (subjectId) references teachers (teacherId)
);

create table departments
(
  departmentId int auto_increment
    primary key,
  name         varchar(20) not null,
  createdDate  datetime    not null,
  updatedDate  datetime    not null,
  constraint departments_subjects_departmentId_fk
  foreign key (departmentId) references subjects (departmentId)
);

create index index_subjects_departments
  on subjects (departmentId);

create index subjects__index_teacher
  on subjects (teacherId);

create index subjects_teachers_teacherId_fk
  on subjects (subjectId);

create index university_id_teachers__index
  on teachers (universityId);

create table universities
(
  universityId int auto_increment
    primary key,
  name         varchar(50) null,
  createdDate  datetime    not null,
  updatedDate  datetime    not null,
  website      varchar(20) null
);


