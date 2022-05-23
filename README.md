# 주소 API 테스트

### step1 브랜치
- 기존 로직 사용!!

### master 브랜치
- Store에 저장해서 폴링하는 방식 사용
- Store는 세션저장소(Redis를 사용하는 것이 좋다)
- 폴링보다는 웹소켓이나 SSE로 push해주는 것이 좋다.