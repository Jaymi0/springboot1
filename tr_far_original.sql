/*
Navicat PGSQL Data Transfer

Source Server         : gers
Source Server Version : 90609
Source Host           : 10.189.186.163:5432
Source Database       : gears-dev
Source Schema         : gears

Target Server Type    : PGSQL
Target Server Version : 90609
File Encoding         : 65001

Date: 2019-03-06 18:23:05
*/


-- ----------------------------
-- Table structure for tr_far_original
-- ----------------------------
DROP TABLE IF EXISTS "gears"."tr_far_original";
CREATE TABLE "gears"."tr_far_original" (
"id" int4 DEFAULT nextval('tr_far_original_id_seq'::regclass) NOT NULL,
"company_code" varchar(50) COLLATE "default" NOT NULL,
"book_type_code" varchar(15) COLLATE "default",
"local_currency" varchar(15) COLLATE "default",
"asset_number" varchar(150) COLLATE "default" NOT NULL,
"tag_number" varchar(25) COLLATE "default",
"asset_description" varchar(255) COLLATE "default",
"major_category" varchar(30) COLLATE "default",
"minor_category" varchar(30) COLLATE "default",
"sub_category" varchar(30) COLLATE "default",
"gap_description" varchar(255) COLLATE "default",
"stat_category" varchar(150) COLLATE "default",
"tax_category" varchar(150) COLLATE "default",
"owner_sso" varchar(150) COLLATE "default",
"subar_no" varchar(30) COLLATE "default",
"country" varchar(30) COLLATE "default",
"state" varchar(30) COLLATE "default",
"county" varchar(150) COLLATE "default",
"city" varchar(30) COLLATE "default",
"building" varchar(30) COLLATE "default",
"floor_and_room" varchar(150) COLLATE "default",
"date_placed_in_service" date,
"project" varchar(64) COLLATE "default",
"project_code" varchar(25) COLLATE "default",
"reference" varchar(25) COLLATE "default",
"last_pi_date" varchar(150) COLLATE "default",
"original_cost_centre" varchar(150) COLLATE "default",
"expense_account" varchar(25) COLLATE "default",
"cost_account" varchar(25) COLLATE "default",
"depreciation_reserve_account" varchar(25) COLLATE "default",
"current_cost" numeric,
"original_cost" numeric,
"monthly_depreciation" numeric,
"accumulated_depreciation" numeric,
"ytd_depreciation" numeric,
"py_accumulated_depreciation" numeric,
"salvage_value" numeric,
"net_book_value" numeric,
"original_cost_usd" numeric,
"current_cost_usd" numeric,
"monthly_depreciation_usd" numeric,
"salvage_value_usd" numeric,
"serial_number" varchar(35) COLLATE "default",
"po_number" varchar(35) COLLATE "default",
"invoice_number" varchar(50) COLLATE "default",
"vendor_number" varchar(30) COLLATE "default",
"vendor_name" varchar(240) COLLATE "default",
"model" varchar(40) COLLATE "default",
"units" numeric,
"total_units" numeric,
"manufacturer" varchar(360) COLLATE "default",
"ownership" varchar(15) COLLATE "default",
"life_in_years" numeric,
"life_in_months" numeric,
"date_ineffective" date,
"asset_status" varchar(15) COLLATE "default",
"report_date" date,
"creation_date" date,
"last_update_date" date,
"accumulated_depreciation_usd" numeric,
"ytd_depreciation_usd" numeric,
"net_book_value_usd" numeric,
"py_accumu_depreciation_usd" numeric,
"fa_book_name" varchar(60) COLLATE "default",
"book_class" varchar(60) COLLATE "default",
"sub_tag_number" varchar(500) COLLATE "default",
"retirement_number" varchar(500) COLLATE "default",
"created_by" varchar(64) COLLATE "default",
"last_updated_by" varchar(64) COLLATE "default",
"account" varchar(25) COLLATE "default",
"trading_partner" varchar(25) COLLATE "default",
"cost_center" varchar(50) COLLATE "default",
"geography" varchar(25) COLLATE "default",
"ref_code" varchar(25) COLLATE "default",
"product_line" varchar(25) COLLATE "default",
"book_type" varchar(25) COLLATE "default",
"future1" varchar(50) COLLATE "default",
"future2" varchar(50) COLLATE "default",
"line_number" varchar(64) COLLATE "default",
"remaining_life_in_years" numeric,
"remaining_life_in_months" numeric,
"line_status" varchar(64) COLLATE "default",
"imported_by" varchar(64) COLLATE "default",
"imported_from" varchar(64) COLLATE "default",
"imported_date" timestamp(6)
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Alter Sequences Owned By 
-- ----------------------------

-- ----------------------------
-- Indexes structure for table tr_far_original
-- ----------------------------
CREATE INDEX "tr_far_original_index" ON "gears"."tr_far_original" USING btree (company_code, asset_number);

-- ----------------------------
-- Primary Key structure for table tr_far_original
-- ----------------------------
ALTER TABLE "gears"."tr_far_original" ADD PRIMARY KEY ("id");
