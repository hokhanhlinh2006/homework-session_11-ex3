# Bài 3: Gradle Dependency Caching

## 1. Mục tiêu
Tối ưu thời gian CI bằng cách bật cache các dependency Gradle trong GitHub Actions.

## 2. Cấu hình
Trong file .github/workflows/ci.yml, bổ sung:

    cache: 'gradle'

## 3. So sánh kết quả

| Tiêu chí | Lần chạy 1 | Lần chạy 2 |
|---|---|---|
| Thời gian toàn bộ Job | Điền thời gian thực tế | Điền thời gian thực tế |
| Thời gian setup-java | Điền theo log | Điền theo log |
| Thời gian chạy test | Điền theo log | Điền theo log |
| Trạng thái cache | Kiểm tra log | Kiểm tra log |

## 4. Nhận xét
Cache Gradle giúp tái sử dụng dependency giữa các lần chạy workflow. Hiệu quả thực tế được đánh giá dựa trên log và thời gian chạy của hai lần CI.

## 5. Kết luận
Đã cấu hình Gradle Dependency Caching và kiểm tra qua GitHub Actions.
