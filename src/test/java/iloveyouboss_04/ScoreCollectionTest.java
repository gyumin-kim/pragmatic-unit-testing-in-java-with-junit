package iloveyouboss_04;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class ScoreCollectionTest {

	@Test
	public void answerArithmeticMeanOfTwoNumbers() {
		// Arrange(준비)
		ScoreCollection collection = new ScoreCollection();
		collection.add(() -> 5);
		collection.add(() -> 7);

		// Act(실행)
		int actualResult = collection.arithmeticMean();

		// Assert(단언)
		assertThat(actualResult, equalTo(6));
	}
}