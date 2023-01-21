-- --------------------------------------------------------
-- Host:                         localhost
-- Server version:               PostgreSQL 15.1 (Debian 15.1-1.pgdg110+1) on x86_64-pc-linux-gnu, compiled by gcc (Debian 10.2.1-6) 10.2.1 20210110, 64-bit
-- Server OS:                    
-- HeidiSQL Version:             12.0.0.6468
-- --------------------------------------------------------


-- Dumping data for table public.alert: 6 rows
DELETE FROM "alert";
/*!40000 ALTER TABLE "alert" DISABLE KEYS */;
INSERT INTO "alert" ("id", "abnormal_clip", "anomaly", "normal_clip", "time", "title", "machine_id") VALUES
	(1, 'https://testwav1.s3.ap-southeast-1.amazonaws.com/1.wav', 'MILD', 'https://testwav1.s3.ap-southeast-1.amazonaws.com/1.wav', '2023-01-20 18:04:46.955611', NULL, 1),
	(2, 'https://testwav1.s3.ap-southeast-1.amazonaws.com/2.wav', 'MODERATE', 'https://testwav1.s3.ap-southeast-1.amazonaws.com/2.wav', '2023-01-20 18:06:53.310461', NULL, 2),
	(3, 'https://testwav1.s3.ap-southeast-1.amazonaws.com/3.wav', 'SEVERE', 'https://testwav1.s3.ap-southeast-1.amazonaws.com/3.wav', '2023-01-20 18:06:53.310461', NULL, 3),
	(4, 'https://testwav1.s3.ap-southeast-1.amazonaws.com/4.wav', 'MILD', 'https://testwav1.s3.ap-southeast-1.amazonaws.com/4.wav', '2023-01-20 18:06:53.310461', NULL, 4),
	(5, 'https://testwav1.s3.ap-southeast-1.amazonaws.com/5.wav', 'MODERATE', 'https://testwav1.s3.ap-southeast-1.amazonaws.com/5.wav', '2023-01-20 18:06:53.310461', NULL, 5),
	(6, 'https://testwav1.s3.ap-southeast-1.amazonaws.com/6.wav', 'SEVERE', 'https://testwav1.s3.ap-southeast-1.amazonaws.com/6.wav', '2023-01-20 18:06:53.310461', NULL, 6);
/*!40000 ALTER TABLE "alert" ENABLE KEYS */;

-- Dumping data for table public.machine: 6 rows
DELETE FROM "machine";
/*!40000 ALTER TABLE "machine" DISABLE KEYS */;
INSERT INTO "machine" ("id", "action_required", "comment", "comment_by", "name", "suspected_reason", "equipment", "sensor", "modify_time") VALUES
	(2, 'NO_ACTION', NULL, NULL, NULL, 'AXIS_PROBLEM', 'CNC', '0123456789', '2023-01-20'),
	(3, 'NO_ACTION', NULL, NULL, NULL, 'NORMAL', 'CNC', '1234567890', '2023-01-20'),
	(4, 'NO_ACTION', NULL, NULL, NULL, 'MACHINE_CRASH', 'MILLING', '1122334455', '2023-01-20'),
	(5, 'NO_ACTION', NULL, NULL, NULL, 'ROUTER_FAULT', 'MILLING', '2345678900', '2023-01-20'),
	(6, 'NO_ACTION', NULL, NULL, NULL, 'NORMAL', 'MILLING', '2345678900', '2023-01-20'),
	(1, 'NO_ACTION', 'test comment', 'anonymous', NULL, 'SPINDLE_ERROR', 'CNC', '1234567890', '2023-01-20');

