CREATE DATABASE IF NOT EXISTS `thanatos_data`;

USE `thanatos_data`;

CREATE TABLE IF NOT EXISTS `m_member` (
    `id` INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    `num` INT UNSIGNED DEFAULT 0
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `o_orders` (
    `id` INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    `num` INT UNSIGNED DEFAULT 0
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `p_product` (
    `id` INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    `num` INT UNSIGNED DEFAULT 0
) ENGINE = InnoDB;

CREATE DATABASE IF NOT EXISTS `thanatos_oauth2`;

USE `thanatos_oauth2`;

DROP TABLE IF EXISTS `oauth_client_details`;
CREATE TABLE `oauth_client_details`  (
  `client_id` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `resource_ids` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  `client_secret` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  `scope` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  `authorized_grant_types` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  `web_server_redirect_uri` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  `authorities` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  `access_token_validity` int(11) NULL DEFAULT NULL,
  `refresh_token_validity` int(11) NULL DEFAULT NULL,
  `additional_information` varchar(4096) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  `autoapprove` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  PRIMARY KEY (`client_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Compact;

INSERT INTO `oauth_client_details` VALUES ('app-client', 'gateway-service', '$2a$10$DVdqTrpMWBjed3C3F43v0ewmCpkg9V0scgGAS9dYoYrjLm6bHce5S', 'all', 'authorization_code,refresh_token,password', NULL, NULL, 7200, 72000, NULL, '1');
INSERT INTO `oauth_client_details` VALUES ('web-client', 'gateway-service', '$2a$10$DVdqTrpMWBjed3C3F43v0ewmCpkg9V0scgGAS9dYoYrjLm6bHce5S', 'all', 'authorization_code,refresh_token,password', NULL, NULL, 7200, 72000, NULL, '1');
