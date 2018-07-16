-- 
-- sequence: career_plan_student_seq 
--

create sequence career_plan_student_seq
    start with 1
    increment by 1
    nominvalue
    nomaxvalue
    cache 20
    
;

-- 
-- sequence: course_professor_seq 
--

create sequence course_professor_seq
    start with 1
    increment by 1
    nominvalue
    nomaxvalue
    cache 20
    
;

-- 
-- sequence: user_seq 
--

create sequence user_seq
    start with 1
    increment by 1
    nominvalue
    nomaxvalue
    cache 20
    
;

-- 
-- sequence: user_social_media_seq 
--

create sequence user_social_media_seq
    start with 1
    increment by 1
    nominvalue
    nomaxvalue
    cache 20
    
;

-- 
-- table: user 
--

create table user(
    user_id             number(10, 0)    not null,
    name                varchar2(100),
    last_name           varchar2(10),
    second_last_name    varchar2(100),
    email               varchar2(200)    not null,
    password            varchar2(20),
    birth_date          date,
    start_date          timestamp(6),
    is_student          number(1, 0)     not null,
    is_professor        number(1, 0)     not null,
    is_admin            number(1, 0)     not null,
    constraint pk1 primary key (user_id)
)
;



-- 
-- table: admin 
--

create table admin(
    user_id    number(10, 0)    not null,
    active     number(1, 0),
    constraint admin_pk primary key (user_id), 
    constraint admin_user_fk foreign key (user_id)
    references user(user_id)
)
;



-- 
-- table: student 
--

create table student(
    user_id    number(10, 0)    not null,
    active     number(1, 0)     not null,
    constraint student_pk primary key (user_id), 
    constraint student_user_id_fk foreign key (user_id)
    references user(user_id)
)
;



-- 
-- table: career_plan_student 
--

create table career_plan_student(
    career_plan_student_id    number(10, 0)    not null,
    career_plan_id            number(10, 0)    not null,
    user_id                   number(10, 0)    not null,
    constraint career_plan_student_pk primary key (career_plan_student_id), 
    constraint career_plan_student_id_fk foreign key (user_id)
    references student(user_id)
)
;



-- 
-- table: professor 
--

create table professor(
    user_id    number(10, 0)    not null,
    photo      binary             not null,
    active     number(1, 0)     not null,
    constraint professor_pk primary key (user_id), 
    constraint profesor_user_id_fk foreign key (user_id)
    references user(user_id)
)
;



-- 
-- table: course_professor 
--

create table course_professor(
    course_professor_id    number(10, 0)    not null,
    course_id              number(10, 0)    not null,
    user_id                number(10, 0)    not null,
    constraint course_professor_pk primary key (course_professor_id), 
    constraint course_profesor_user_id_fk foreign key (user_id)
    references professor(user_id)
)
;



-- 
-- table: social_media 
--

create table social_media(
    social_media_id    number(2, 0)     not null,
    name               varchar2(40)     not null,
    description        varchar2(100)    not null,
    active             number(1, 0)     not null,
    constraint social_media_pk primary key (social_media_id)
)
;



-- 
-- table: user_social_media 
--

create table user_social_media(
    user_social_media_id    number(10, 0)     not null,
    url                     varchar2(4000)    not null,
    social_media_id         number(2, 0)      not null,
    constraint user_social_media_pk primary key (user_social_media_id), 
    constraint user_social_media_id_fk foreign key (social_media_id)
    references social_media(social_media_id)
)
;



