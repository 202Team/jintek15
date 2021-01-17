# jintek15
임진택 


01-17 
▶
게시글 검색기능 적용

검색페이지 페이징 적용 (서치옵션과 서치키워드값을 바인딩하고 페이징시 주소값에 추가)
검색 결과 없음 표시
검색 결과가 1페이지 일경우 페이징목록 안보이게 적용
현재 보고있는 페이지를 페이지 목록에서 강조 
: SearchCommand, board/list.jsp, searchlist.jsp 
searchPage.jsp,

▶
파일 업로드

게시판에 파일 업로드 기능 추가 첨부파일이 있을때는 파라미터들을 MultipartRequest 
객체가 받아서 게시글을 생성하고, 생성된 게시글의 num값을 받아서 파일DB에 저장,
(이후 그 값으로 해당 게시글에서 다운로드 적용) 첨부파일이 없을 때를 스크립트로 구분하여
 action를 이전 InsertCommand로 응답
: FileUploadCommand, FileDAO, FileDTO

01-13 
추가: Command , member/InsertCommand, 
member/InsertUICommand , member/ListCommand , member/ReadCommand ,
member/insert.jsp , member/insetComplete.jsp , member/update.jsp , member/read.jsp , 
board/list.jsp , board/read.jsp , board/update.jsp

[회원 정보 수정]

◎ 메인 화면과 게시글 화면에서 회원의 닉네임을 클릭하면 회원
   정보보기로 이동 ( 로그인한 상황인지 확인,로그인한 아이디와
   회원정보가 일치한지 확인)


[게시글 입력, 수정, 삭제 ]

◎ 주소창에서 글쓰기창으로 접근(경로입력)하면 로그인확인하
   고 게시글화면으로 이동

◎ 로그인 하면 메인화면과 게시글화면에서 글쓰기를 출력

