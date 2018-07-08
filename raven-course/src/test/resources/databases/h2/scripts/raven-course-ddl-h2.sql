-- 
-- sequence: career_plan_seq 
--

create sequence career_plan_seq
    start with 1
    increment by 1
    nominvalue
    nomaxvalue
    cache 20
;

-- 
-- sequence: course_career_plan_seq 
--

create sequence course_career_plan_seq
    start with 1
    increment by 1
    nominvalue
    nomaxvalue
    cache 20
;

-- 
-- sequence: course_modality_seq 
--

create sequence course_modality_seq
    start with 1
    increment by 1
    nominvalue
    nomaxvalue
    cache 20
;

-- 
-- sequence: course_resource_seq 
--

create sequence course_resource_seq
    start with 1
    increment by 1
    nominvalue
    nomaxvalue
    cache 20
;

-- 
-- sequence: course_seq 
--

create sequence course_seq
    start with 1
    increment by 1
    nominvalue
    nomaxvalue
    cache 20
;

-- 
-- sequence: course_topic_seq 
--

create sequence course_topic_seq
    start with 1
    increment by 1
    nominvalue
    nomaxvalue
    cache 20
;

-- 
-- table: career_plan 
--

create table career_plan(
    career_plan_id    number(2, 0)      not null,
    name              varchar2(100)     not null,
    description       varchar2(3000)    not null,
    adquired_ack      varchar2(3000)    not null,
    constraint career_plan_pk primary key (career_plan_id)
);



-- 
-- table: course_status 
--

create table course_status(
    course_status_id    number(2, 0)     not null,
    name                varchar2(40)     not null,
    description         varchar2(100)    not null,
    active              number(1, 0)     not null,
    constraint course_status_pk primary key (course_status_id)
);



-- 
-- table: course_topic 
--

create table course_topic(
    course_topic_id    number(10, 0)    not null,
    topic_number       varchar2(15)     not null,
    name               varchar2(100)    not null,
    parent_topic_id    number(10, 0),
    constraint course_topic_pk primary key (course_topic_id), 
    constraint course_topic_parent_fk foreign key (parent_topic_id)
    references course_topic(course_topic_id)
);



-- 
-- table: course 
--

create table course(
    course_id           number(10, 0)     not null,
    name                varchar2(40)      not null,
    description         varchar2(3000)    not null,
    adquired_ack        varchar2(3000)    not null,
    total_hours         number(3, 0)      not null,
    logo                binary,
    landing_page        varchar2(300)     not null,
    course_status_id    number(2, 0)      not null,
    course_topic_id     number(10, 0)     not null,
    constraint course_pk primary key (course_id), 
    constraint course_status_fk foreign key (course_status_id)
    references course_status(course_status_id),
    constraint course_topic_root_fk foreign key (course_topic_id)
    references course_topic(course_topic_id)
);



-- 
-- table: course_career_plan 
--

create table course_career_plan(
    course_career_plan_id    number(10, 0)    not null,
    course_order             number(2, 0)     not null,
    career_plan_id           number(2, 0)     not null,
    course_id                number(10, 0)    not null,
    constraint course_career_plan_pk primary key (course_career_plan_id), 
    constraint course_career_plan_id_fk foreign key (career_plan_id)
    references career_plan(career_plan_id),
    constraint course_career_course_id_fk foreign key (course_id)
    references course(course_id)
);



-- 
-- table: modality 
--

create table modality(
    modality_id    number(2, 0)     not null,
    active         number(1, 0)     not null,
    name           varchar2(40)     not null,
    description    varchar2(100)    not null,
    constraint modality_pk primary key (modality_id)
);



-- 
-- table: course_modality 
--

create table course_modality(
    course_modality_id    number(10, 0)    not null,
    course_id             number(10, 0)    not null,
    modality_id           number(2, 0)     not null,
    constraint course_modality_pk primary key (course_modality_id), 
    constraint course_modality_course_id_fk foreign key (course_id)
    references course(course_id),
    constraint course_modality_modality_id_fk foreign key (modality_id)
    references modality(modality_id)
);



-- 
-- table: course_resource 
--

create table course_resource(
    course_resource_id    number(10, 0)     not null,
    name                  varchar2(100)     not null,
    description           varchar2(3000)    not null,
    url                   varchar2(300)     not null,
    is_private            number(1, 0)      not null,
    course_id             number(10, 0)     not null,
    constraint course_resource_pk primary key (course_resource_id), 
    constraint course_resource_course_id_fk foreign key (course_id)
    references course(course_id)
);