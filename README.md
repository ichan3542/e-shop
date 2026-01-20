# E-Shop (Spring Boot RESTful API)

## 🚀 技術亮點

- **清晰分層架構**：Controller / Service / DAO / DTO / Model，職責單一、易於維護與測試。
- **JDBC + NamedParameterJdbcTemplate**：手寫 SQL，精準控制查詢、排序、分頁、與效能。
- **查詢條件動態組裝**：支援商品搜尋、分類、排序與分頁（Filtering / Sorting / Pagination）。
- **交易一致性**：訂單建立使用 `@Transactional`，確保庫存扣減與訂單寫入原子性。
- **輸入驗證與錯誤處理**：`@Valid` + Bean Validation，搭配 `ResponseStatusException` 回傳正確 HTTP 狀態碼。
- **安全意識**：註冊與登入使用 MD5 雜湊保存密碼（可作為後續升級到 BCrypt 的基礎）。
- **高覆蓋測試**：使用 `SpringBootTest + MockMvc` 完成控制器層 API 測試，包含正常流程與錯誤情境。
- **多資料庫支援**：內建 H2（測試）與 MySQL（正式）連線能力。

## 🧱 系統架構概覽

```
Controller  ->  Service  ->  DAO  ->  Database
   |             |            |
   |             |            +-- RowMapper
   |             +-- Transaction, Business Rules
   +-- Validation, HTTP Response
```

## ✅ 核心功能

- **會員系統**：註冊 / 登入（Email 格式檢查、重複註冊檢查）
- **商品管理**：新增 / 修改 / 刪除 / 單筆查詢 / 列表查詢
- **訂單流程**：建立訂單、扣庫存、計算總金額、訂單與明細查詢
- **API 分頁**：可調整 `limit` / `offset`

## 🧪 測試策略

- 使用 **MockMvc** 進行整合測試
- 覆蓋常見情境：成功流程、參數錯誤、資源不存在、重複註冊等
- 測試資料由 `src/test/resources/data.sql` 初始化

## 🔌 Restful API 範例

### 使用者
- `POST /users/register`
- `POST /users/login`

### 商品
- `GET /products`（支援 `category`、`search`、`orderBy`、`sort`、`limit`、`offset`）
- `GET /products/{productId}`
- `POST /products`
- `PUT /products/{productId}`
- `DELETE /products/{productId}`

### 訂單
- `GET /users/{userId}/orders`
- `POST /users/{userId}/orders`

## ⚙️ 開發與執行

### 環境需求
- Java 11
- Maven

### 啟動方式
1. 設定資料庫連線（見 `src/main/resources/application.properties`）
2. 使用 Maven 啟動 Spring Boot

```bash
mvn spring-boot:run
```

### 執行測試
```bash
mvn test
```
