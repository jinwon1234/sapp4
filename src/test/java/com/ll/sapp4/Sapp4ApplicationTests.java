package com.ll.sapp4;

import com.ll.sapp4.answer.AnswerRepository;
import com.ll.sapp4.question.QuestionRepository;
import com.ll.sapp4.question.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Sapp4ApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;
	@Autowired
	private QuestionService questionService;
	@Autowired
	private AnswerRepository answerRepository;
	//@Transactional // 데이터 테스트 후 복원
	@Test
	void contextLoads() {
		//질문데이터 저장하기
//		Question q1 = new Question();
//		q1.setSubject("sbb가 무엇인가요?");
//		q1.setContent("sbb에 대해서 알고 싶습니다.");
//		q1.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q1);
//
//		Question q2 = new Question();
//		q2.setSubject("스프링부트 모델 질문입니다.");
//		q2.setContent("id는 자동 생성되나요?");
//		q2.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q2);

		//질문 조회하기

//		List<Question> all = this.questionRepository.findAll();
//		assertEquals(2,all.size());
//		Question q = all.get(0);
//		assertEquals("sbb가 무엇인가요?", q.getSubject());


		//findById

//		Optional<Question> oq = this.questionRepository.findById(1);
//		if (oq.isPresent()) {
//			Question q = oq.get();
//			assertEquals("sbb가 무엇인가요?", q.getSubject());
//		}

		//findBySubject
//		Question q = this.questionRepository.findBySubject("sbb가 무엇인가요?");
//		assertEquals(1, q.getId());

		//findBySubjectAndContent
//		Question q = this.questionRepository.findBySubjectAndContent("sbb가 무엇인가요?", "sbb에 대해서 알고 싶습니다.");
//		assertEquals(1,q.getId());

		//findBySubjectLike

//		List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
//		Question q = qList.get(0);
//		assertEquals("sbb가 무엇인가요?", q.getSubject());

		//질문데이터 수정하기
//		Optional<Question> oq = this.questionRepository.findById(1);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		q.setSubject("수정된 제목");
//		this.questionRepository.save(q);


		//질문 데이터 삭제하기
//		assertEquals(2, this.questionRepository.count());
//		Optional<Question> oq = this.questionRepository.findById(1);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		this.questionRepository.delete(q);
//		assertEquals(1,this.questionRepository.count());


		// 답변데이터 생성하기
//		Optional<Question> oq = this.questionRepository.findById(2);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		Answer a = new Answer();
//		a.setContent("네 자동으로 생성됩니다");
//		a.setQuestion(q);
//		a.setCreateDate(LocalDateTime.now());
//		this.answerRepository.save(a);

		//답변데이터 조회하기

//		Optional<Answer> oa = this.answerRepository.findById(1);
//		assertTrue(oa.isPresent());
//		Answer a = oa.get();
//		assertEquals(2, a.getQuestion().getId());

		//답변 데이터를 통해 질문 데이터 찾기
//

//
//		for (int i = 1; i <= 300; i++) {
//			String subject = String.format("테스트 데이터입니다:[%03d]", i);
//			String content = "내용무";
//			this.questionService.create(subject, content,null);
//		}







	}

}
