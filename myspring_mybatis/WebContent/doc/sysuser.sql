create table t_sys_user 
(
   t_user_id            varchar(50)                    not null,
   t_user_name          varchar(50)                    null,
   t_user_pwd           varchar(50)                    null,
   t_role               varchar(50)                    null,
   t_status             varchar(50)                    null,
   constraint PK_T_SYS_USERA primary key clustered (t_user_id)
);
