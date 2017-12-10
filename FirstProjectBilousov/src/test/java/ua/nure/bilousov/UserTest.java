package ua.nure.bilousov;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import junit.framework.TestCase;

public class UserTest extends TestCase {
	static Calendar calendar = Calendar.getInstance(); {
	calendar.setTime(new Date());
	}
	// ���� ���������� �� 7.12.2017
	private static final int DATE_OF_BIRTH = 5;
	private static final int DATE_OF_BIRTH_TODAY = calendar.get(Calendar.DAY_OF_MONTH);
	private static final int DATE_OF_BIRTH3 = 20;
	private static final int MONTH_OF_BIRTH = Calendar.DECEMBER;
	private static final int MONTH_OF_BIRTH2 = Calendar.NOVEMBER;
	private static final int MONTH_OF_BIRTH3 = Calendar.JANUARY;
	private static final int MONTH_OF_BIRTH_DECEMDER = Calendar.DECEMBER;
	private static final int MONTH_OF_BIRTH_JANUARY = Calendar.JANUARY;
	private static final int CURRENT_YEAR = 2017;
	private static final int YEAR_OF_BIRTH = 2000;
	// ���������, ������� ���������� �� �������� ���� � ���� ��� �������� ���
	// �������
	private static final int ETALONE_AGE = CURRENT_YEAR - YEAR_OF_BIRTH;
	private static final int ETALONE_AGE2 = CURRENT_YEAR - YEAR_OF_BIRTH - 1;
	private User user;
	private Date dateOfBirthd;

	protected void setUp() throws Exception {
		super.setUp();
		user = new User();
	}

	@Test
	public void testFullName() {
		user.setFirstName("Pavel");
		user.setLastName("Belousov");
		assertEquals("Pavel Belousov", user.getFullName());

	}

	// ����(1) ���� �������� ��� ������, �� ����� ��� ����.
	public void testGetAge1() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(YEAR_OF_BIRTH, MONTH_OF_BIRTH, DATE_OF_BIRTH);
		dateOfBirthd = calendar.getTime();
		user.setBirthday(dateOfBirthd);
		assertEquals(ETALONE_AGE, user.getAge());
	}

	// ����(2) ����� �������� ��� ������ � ���� ����.
	public void testGetAge2() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(YEAR_OF_BIRTH, MONTH_OF_BIRTH2, DATE_OF_BIRTH);
		dateOfBirthd = calendar.getTime();
		user.setBirthday(dateOfBirthd);
		assertEquals(ETALONE_AGE, user.getAge());
	}

	// ����(3) ���� �������� �������
	public void testGetAge3() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(YEAR_OF_BIRTH, MONTH_OF_BIRTH, DATE_OF_BIRTH_TODAY);
		dateOfBirthd = calendar.getTime();
		user.setBirthday(dateOfBirthd);
		assertEquals(ETALONE_AGE, user.getAge());
	}

	// ����(4) ����� �������� ����, �� ���� �������� ��� � ������.
	public void testGetAge4() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(YEAR_OF_BIRTH, MONTH_OF_BIRTH, DATE_OF_BIRTH3);
		dateOfBirthd = calendar.getTime();
		user.setBirthday(dateOfBirthd);
		assertEquals(ETALONE_AGE2, user.getAge());
	}

	// ����(5) ����� �������� ��� �� �������
	public void testGetAge5() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(YEAR_OF_BIRTH + 1, MONTH_OF_BIRTH3, DATE_OF_BIRTH);
		dateOfBirthd = calendar.getTime();
		user.setBirthday(dateOfBirthd);
		assertEquals(ETALONE_AGE2, user.getAge());
	}
	// ����(6) ����� �������� - �������, ���� �������� ������
		public void testGetAge6() {
			Calendar calendar = Calendar.getInstance();
			calendar.set(YEAR_OF_BIRTH ,MONTH_OF_BIRTH_DECEMDER, DATE_OF_BIRTH);
			dateOfBirthd = calendar.getTime();
			user.setBirthday(dateOfBirthd);
			assertEquals(ETALONE_AGE, user.getAge());
		}
		// ����(7) ����� �������� - �������, ���� �������� �������
				public void testGetAge7() {
					Calendar calendar = Calendar.getInstance();
					calendar.set(YEAR_OF_BIRTH ,MONTH_OF_BIRTH_DECEMDER,DATE_OF_BIRTH_TODAY);
					dateOfBirthd = calendar.getTime();
					user.setBirthday(dateOfBirthd);
					assertEquals(ETALONE_AGE, user.getAge());
				}
			// ����(8) ����� �������� - �������, ���� �������� �� ��������
				public void testGetAge8() {
					Calendar calendar = Calendar.getInstance();
					calendar.set(YEAR_OF_BIRTH ,MONTH_OF_BIRTH_DECEMDER,DATE_OF_BIRTH3);
					dateOfBirthd = calendar.getTime();
					user.setBirthday(dateOfBirthd);
					assertEquals(ETALONE_AGE2, user.getAge());
				}
				// ����(9) ����� �������� - �����, ���� �������� �� ��������
				public void testGetAge9() {
					Calendar calendar = Calendar.getInstance();
					calendar.set(YEAR_OF_BIRTH+1 ,MONTH_OF_BIRTH_JANUARY,DATE_OF_BIRTH3);
					dateOfBirthd = calendar.getTime();
					user.setBirthday(dateOfBirthd);
					assertEquals(ETALONE_AGE2, user.getAge());
				}
				
				// ����(10) ����� �������� - �����, ���� �������� �������
				public void testGetAge10() {
					Calendar calendar = Calendar.getInstance();
					calendar.set(YEAR_OF_BIRTH ,MONTH_OF_BIRTH_JANUARY,DATE_OF_BIRTH_TODAY);
					dateOfBirthd = calendar.getTime();
					user.setBirthday(dateOfBirthd);
					assertEquals(ETALONE_AGE, user.getAge());
				}
				// ����(11) ����� �������� - �����, ���� �������� ������
				public void testGetAge11() {
					Calendar calendar = Calendar.getInstance();
					calendar.set(YEAR_OF_BIRTH ,MONTH_OF_BIRTH_JANUARY,DATE_OF_BIRTH);
					dateOfBirthd = calendar.getTime();
					user.setBirthday(dateOfBirthd);
					assertEquals(ETALONE_AGE, user.getAge());
				}
}
