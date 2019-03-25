INSERT INTO AUTHORITY_GROUP VALUES('F7ACCC2E61254754830C138F01DCB570','组织管理',0,NULL,NOW(),NOW());
INSERT INTO AUTHORITY_GROUP VALUES('A02D0A8C43484C12BE6B4FF4F1542F3B','添加组织',0,'F7ACCC2E61254754830C138F01DCB570',NOW(),NOW());
INSERT INTO AUTHORITY_GROUP VALUES('CFC5D0AE15F948D3AF785821F6680474','删除组织',1,'F7ACCC2E61254754830C138F01DCB570',NOW(),NOW());
INSERT INTO AUTHORITY_GROUP VALUES('3D5FDA91454144B2A082587DDAD4D3E7','修改组织',2,'F7ACCC2E61254754830C138F01DCB570',NOW(),NOW());
INSERT INTO AUTHORITY_GROUP VALUES('15727CE167524E9CB028F8A6E480C924','查询所有组织',3,'F7ACCC2E61254754830C138F01DCB570',NOW(),NOW());

INSERT INTO AUTHORITY_GROUP VALUES('4606E6731BDE420B9BAF14125F469F4B','角色管理',0,NULL,NOW(),NOW());
INSERT INTO AUTHORITY_GROUP VALUES('E9A23FD123814DD4802CE207EDCA02C5','查询所有权限组',0,'F7ACCC2E61254754830C138F01DCB570',NOW(),NOW());


INSERT INTO AUTHORITY VALUES('user.controller.OrganizationController.add','添加组织','A02D0A8C43484C12BE6B4FF4F1542F3B',NOW(),NOW());
INSERT INTO AUTHORITY VALUES('user.controller.OrganizationController.delete','删除组织','CFC5D0AE15F948D3AF785821F6680474',NOW(),NOW());
INSERT INTO AUTHORITY VALUES('user.controller.OrganizationController.update','修改组织','3D5FDA91454144B2A082587DDAD4D3E7',NOW(),NOW());
INSERT INTO AUTHORITY VALUES('user.controller.OrganizationController.all','查询所有组织','15727CE167524E9CB028F8A6E480C924',NOW(),NOW());
INSERT INTO AUTHORITY VALUES('organization.all','查询所有组织菜单','15727CE167524E9CB028F8A6E480C924',NOW(),NOW());

INSERT INTO ROLE VALUES('4476A107F7B049EDBDB417B02955ABF0','admin','管理员','00',NOW(),NOW());

INSERT INTO ROLE_AUTHORITY VALUES('4476A107F7B049EDBDB417B02955ABF0','F7ACCC2E61254754830C138F01DCB570');
INSERT INTO ROLE_AUTHORITY VALUES('4476A107F7B049EDBDB417B02955ABF0','A02D0A8C43484C12BE6B4FF4F1542F3B');
INSERT INTO ROLE_AUTHORITY VALUES('4476A107F7B049EDBDB417B02955ABF0','CFC5D0AE15F948D3AF785821F6680474');
INSERT INTO ROLE_AUTHORITY VALUES('4476A107F7B049EDBDB417B02955ABF0','3D5FDA91454144B2A082587DDAD4D3E7');
INSERT INTO ROLE_AUTHORITY VALUES('4476A107F7B049EDBDB417B02955ABF0','15727CE167524E9CB028F8A6E480C924');

INSERT INTO USER VALUES('570BB923C48149B28F4E6055196A9F9D','admin','$2a$10$zNQ3kT8TQRgGBiy8FVHRnOCXV2OR.Ult.ujhOhCC4ad11JyAHyu3C','admin','+86','13888888888','00',null,null,null,null,'NORMAL',null,null,null,null,0,null,NOW(),NOW());

INSERT INTO USER_ROLE VALUES('570BB923C48149B28F4E6055196A9F9D','4476A107F7B049EDBDB417B02955ABF0');