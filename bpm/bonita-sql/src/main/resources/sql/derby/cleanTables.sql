DELETE FROM actormember;

DELETE FROM actormember;
DELETE FROM actor;
DELETE FROM processcategorymapping;
DELETE FROM category;
DELETE FROM migration_plan;
DELETE FROM arch_process_comment;
DELETE FROM process_comment;
DELETE FROM process_definition;
DELETE FROM arch_document_mapping;
DELETE FROM document;
DELETE FROM document_mapping;
DELETE FROM arch_transition_instance;

DELETE FROM arch_flownode_instance;

DELETE FROM arch_process_instance;

DELETE FROM arch_connector_instance;
DELETE FROM multi_biz_data;

DELETE FROM ref_biz_data_inst;

DELETE FROM pending_mapping;

DELETE FROM message_instance;

DELETE FROM waiting_event;

DELETE FROM event_trigger_instance;

DELETE FROM connector_instance;

DELETE FROM flownode_instance;

DELETE FROM process_instance;

DELETE FROM breakpoint;
DELETE FROM report;
DELETE FROM processsupervisor;
DELETE FROM business_app_menu;
DELETE FROM business_app_page;
DELETE FROM business_app;
DELETE FROM command;

DELETE FROM arch_data_instance;

DELETE FROM data_instance;
DELETE FROM dependencymapping;

DELETE FROM dependency;
DELETE FROM external_identity_mapping;
DELETE FROM user_membership;

DELETE FROM custom_usr_inf_val;

DELETE FROM custom_usr_inf_def;

DELETE FROM user_contactinfo;

DELETE FROM user_login;
DELETE FROM user_;

DELETE FROM role;

DELETE FROM group_;
DELETE FROM queriablelog_p;

DELETE FROM queriable_log;
DELETE FROM page;
DELETE FROM sequence WHERE tenantId <> -1;
DELETE FROM profilemember;

DELETE FROM profileentry;

DELETE FROM profile;
DELETE FROM job_log;

DELETE FROM job_param;

DELETE FROM job_desc;
DELETE FROM theme;

DELETE FROM tenant;

DELETE FROM platformCommand;
DELETE FROM form_mapping;
DELETE FROM page_mapping;

-- do NOT clear directly PLATFORM table, Hibernate needs to update its cache to know the platform has been deleted
