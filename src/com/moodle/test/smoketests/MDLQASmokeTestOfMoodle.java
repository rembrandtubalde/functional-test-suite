package com.moodle.test.smoketests;

import java.net.MalformedURLException;

import org.junit.Test;

import com.moodle.test.TestDataLoad;
import com.moodle.test.datacreation.MDLQADT1AddCourse;
import com.moodle.test.datacreation.MDLQADT2AddUsers;
import com.moodle.test.datacreation.MDLQADT3AssignFrontPageRoles;
import com.moodle.test.datacreation.MDLQADT4EnrolUsers;
import com.moodle.test.moodleinstallation.Install23;

public class MDLQASmokeTestOfMoodle extends TestDataLoad {
	private String teacher = this.properties.get("teacher");
	private String password = this.properties.get("password");
	private String courseName = this.properties.get("courseName");
	private String assignmentName = this.properties.get("assignmentName");
	private String assignmentDescription = this.properties.get("assignmentDescription");
	private String chatName = this.properties.get("chatName");
	private String chatDescription = this.properties.get("chatDescription");
	private String choiceName = this.properties.get("choiceName");
	private String choiceDescription = this.properties.get("choiceDescription");
	private String databaseName = this.properties.get("databaseName");
	private String databaseDescription = this.properties.get("databaseDescription");
	private String forumName = this.properties.get("forumName");
	private String forumDescription = this.properties.get("forumDescription");
	private String glossaryName = this.properties.get("glossaryName");
	private String glossaryDescription = this.properties.get("glossaryDescription");
	private String lessonName = this.properties.get("lessonName");
	private String quizName = this.properties.get("quizName");
	private String quizDescription = this.properties.get("quizDescription");
	private String surveyName = this.properties.get("surveyName");
	private String surveyDescription = this.properties.get("surveyDescription");
	private String surveyType = this.properties.get("surveyType");
	private String wikiName = this.properties.get("wikiName");
	private String wikiDescription = this.properties.get("wikiDescription");
	private String wikiFirstPageName = this.properties.get("wikiFirstPageName");
	private String workshopName = this.properties.get("workshopName");
	private String workshopDescription = this.properties.get("workshopDescription");
	private String bookName = this.properties.get("bookName");
	private String bookDescription = this.properties.get("bookDescription");	
	private String folderName = this.properties.get("folderName");
	private String folderDescription = this.properties.get("folderDescription");
	private String subFolderName = this.properties.get("subFolderName");
	private String label = this.properties.get("label");
	//@Test
	public void installation() {
		Install23 install23 = new Install23();
		install23.install();
	}
	//@Test
	public void addCourse() throws MalformedURLException {
		MDLQADT1AddCourse addCourse = new MDLQADT1AddCourse();
		addCourse.login();
		addCourse.addCourse();
	}
	//@Test
	public void addUsers() throws Exception {
		MDLQADT2AddUsers addUsers = new MDLQADT2AddUsers();
		addUsers.addTeacher();
		addUsers.addFirstStudent();
		addUsers.addSecondStudent();
		addUsers.addThirdStudent();
		addUsers.addFourthStudent();
		addUsers.addFifthStudent();
		addUsers.addSixthStudent();
		addUsers.addSeventhStudent();
		addUsers.addEighthStudent();
		addUsers.addNinthStudent();
		addUsers.addTenthStudent();
		addUsers.addEleventhStudent();
		//TODO Create Add Manager Step
		//addUsers.addManager();
	}
	//@Test
	public void assignFrontPageRoles() {
		MDLQADT3AssignFrontPageRoles roles = new MDLQADT3AssignFrontPageRoles();
		roles.assignTeacherRole();
		roles.assignStudentRole();
		roles.assignStudent2Role();
		roles.assignStudent3Role();
		roles.assignStudent4Role();
		roles.assignStudent5Role();
		roles.assignStudent6Role();
		roles.assignStudent7Role();
		roles.assignStudent8Role();
		roles.assignStudent9Role();
		roles.assignStudent10Role();
		roles.assignStudent11Role();
		navigationBlock.clickHome();
		//TODO Create Add manager role step
		//roles.assignManagerRole();
	}
	//@Test
	public void enrolUsers() {
		MDLQADT4EnrolUsers enrol = new MDLQADT4EnrolUsers();
		//TODO re-write the enrol teacher step so you don't have to use the ajax buttons
		enrol.enrolTeacher();
		enrol.assignTeacherRole();
		enrol.enrolStudent();
		enrol.enrolStudent2();
		enrol.enrolStudent3();
		enrol.enrolStudent4();
		enrol.enrolStudent5();
		enrol.enrolStudent6();
		enrol.enrolStudent7();
		enrol.enrolStudent8();
		enrol.enrolStudent9();
		enrol.enrolStudent10();
		enrol.enrolStudent11();
		//TODO create enrol manager step
		//enrol.enrolManager();
		user.selectLogout();
	}
	@Test
	public void addAssignment() throws Exception {
		user.loginToSystem(teacher, password);
		course.clickCourseLink(courseName);
		course.clickTurnEditingOn();
		addActivity.selectAssignment("2");
		addAssignment.enterNameField(assignmentName);
		addAssignment.enterDescriptionField(assignmentDescription);
		addAssignment.selectFileSubmissionsEnabledNo();
		addAssignment.selectOnlineTextEnabledYes();
		addAssignment.clickSaveAndRetToCourse();
	}
	@Test
	public void addChat() throws Exception {
		addActivity.selectChat("2");
		addChat.enterNameField(chatName);
		addChat.enterDescriptionField(chatDescription);
		addChat.clickSaveAndRetToCourse();
	}
	@Test
	public void addChoice() throws Exception {
		addActivity.selectChoice("2");
		addChoice.enterNameField(choiceName);
		addChoice.enterDescriptionField(choiceDescription);
		addChoice.enterOptionField("0", "option1");
		addChoice.enterOptionField("1", "option2");
		addChoice.clickSaveAndRetToCourse();
	}
	@Test
	public void addDatabase() throws Exception {
		addActivity.selectDatabase("2");
		addDatabase.enterNameField(databaseName);
		addDatabase.enterDescriptionField(databaseDescription);
		addDatabase.clickSaveAndRetToCourse();
	}
//	@Test
	public void addLTI() {
		//TODO will come back to this as it isn't a priority and we will need some setup doing in advance
	}
	@Test
	public void addForum() throws Exception {
		addActivity.selectForum("2");
		addForum.enterNameField(forumName);
		addForum.enterDescriptionField(forumDescription);
		addForum.clickSaveAndRetToCourse();
	}
	@Test
	public void addGlossary() throws Exception {
		addActivity.selectGlossary("2");
		addGlossary.enterNameField(glossaryName);
		addGlossary.enterDescriptionField(glossaryDescription);
		addGlossary.clickSaveAndRetToCourse();
	}
	@Test
	public void addLesson() {
		addActivity.selectLesson("2");
		addLesson.enterNameField(lessonName);
		addLesson.clickSaveAndRetToCourse();
	}
	@Test
	public void addSurvey() throws Exception {
		addActivity.selectSurvey("2");
		addSurvey.enterNameField(surveyName);
		addSurvey.enterDescriptionField(surveyDescription);
		addSurvey.selectSurveyType(surveyType);
		addLesson.clickSaveAndRetToCourse();
	}
	@Test
	public void addQuiz() throws Exception {
		addActivity.selectQuiz("2");
		addQuiz.enterNameField(quizName);
		addQuiz.enterDescriptionField(quizDescription);
		addQuiz.clickSaveAndRetToCourse();
	}
	@Test
	public void addWiki() throws Exception {
		addActivity.selectWiki("2");
		addWiki.enterNameField(wikiName);
		addWiki.enterDescriptionField(wikiDescription);
		addWiki.enterFirstPageNameField(wikiFirstPageName);
		addWiki.clickSaveAndRetToCourse();
	}
	@Test
	public void addWorkshop() throws Exception {
		addActivity.selectWorkshop("2");
		addWorkshop.enterNameField(workshopName);
		addWorkshop.enterDescriptionField(workshopDescription);
		addWorkshop.clickSaveAndRetToCourse();
	}
	@Test
	public void addBook() throws Exception {
		addActivity.selectBook("3");
		addBook.enterNameField(bookName);
		addBook.enterDescriptionField(bookDescription);
		addBook.clickSaveAndRetToCourse();
	}
//	@Test
	public void addFile() {
		//TODO Will need to start seeding database and some files objects.
	}
	@Test
	public void addFolder() throws Exception {
		addActivity.selectFolder("3");
		addFolder.enterNameField(folderName);
		addFolder.enterDescriptionField(folderDescription);
		addFolder.clickCreateFolderIconButton();
		addFolder.enterNewSubFolderName(subFolderName);
		addFolder.clickCreateFolderButton();
		addFolder.clickSaveAndRetToCourse();
	}
//	@Test
	public void addIMSContentPackage() {
		//TODO
	}
	@Test
	public void addLabel() throws Exception {
		addActivity.selectLabel("3");
		addLabel.enterDescriptionField(label);
		addLabel.clickSaveAndRetToCourse();
	}
//	@Test
	public void addPage() {
		addActivity.selectPage("3");	
	}
//	@Test
	public void addURL() {
		//TODO
	}
}