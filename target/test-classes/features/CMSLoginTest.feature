

Feature: Login tests
  As User , I can login to JDMS and open all section links.

  Background: Home page of JDMS
    #Given Login form in login page

  Scenario: Login to application using valid account and  Open All Jobs.
    When Login to the application
    Then Click on All Jobs
  @Test
  Scenario: Login to application using valid account and  Open Published Jobs.
    Then Click on Published Jobs
  @Test
  Scenario: Login to application using valid account and  Open Ready for Review.
    Then Click on Ready for Review
  @Test
  Scenario: Login to application using valid account and  Open Create Job.
    Then Click on Create Job
  @Test
  Scenario: Login to application using valid account and Open Approved Job.
    Then Click on All Jobs
    Then Click on Approved
  @Test
  Scenario: Login to application using valid account and Open In Progress Job.
    Then Click on All Jobs
    Then Click on In Progress
  @Test
  Scenario: Login to application using valid account and Open Draft Job.
    Then Click on All Jobs
    Then Click on Draft
  @Test
  Scenario: Login to application using valid account and Open Job.
    Then Click on All Jobs
    Then Click on Approved
    Then Click on CMS Job
  @Test
  Scenario: Login to application using valid account and  Open Print Preview.
    And Click on Home
    Then Click on All Jobs
    Then Click on Approved
    Then Click on CMS Job
    Then Click on Print Preview

  Scenario: Login to application using valid account and  Open Job Information Sections.
    And Click on Home
    Then Click on All Jobs
    Then Click on Approved
    Then Click on CMS Job
    Then Click on Job Information Sections

  Scenario: Login to application using valid account and  Open Job Requirement Sections.
    And Click on Home
    Then Click on All Jobs
    Then Click on Approved
    Then Click on CMS Job
    Then Click on Job Requirement Sections

  Scenario: Login to application using valid account and  Open Job Attachments.
    And Click on Home
    Then Click on All Jobs
    Then Click on Approved
    Then Click on CMS Job
    Then Click on Competencies Sections

  Scenario: Login to application using valid account and  Open Download Print PDF.
    And Click on Home
    Then Click on All Jobs
    Then Click on Approved
    Then Click on CMS Job
    Then Click on  DownloadPrint PDF

  Scenario: Login to application using valid account and  Open Print Word.
    And Click on Home
    Then Click on All Jobs
    Then Click on Approved
    Then Click on CMS Job
    Then Click on Print Word

  Scenario: Login to application using valid account and  Open Email Job.
    And Click on Home
    Then Click on All Jobs
    Then Click on Approved
    Then Click on CMS Job
    Then Click on Email Job

  Scenario: Login to application using valid account and Open company profile.
    And Click on profile icon
    And Click on company profile

  Scenario: Login to application using valid account and Open manage user.
    And Click on profile icon
    And Click on manage users

  Scenario: Login to application using valid account and  add user.
    And Click on profile icon
    And Click on manage users
    Then Click on Add User

  Scenario: Login to application using valid account and  View users.
    And Click on profile icon
    And Click on manage users
    Then Click on View Users

  Scenario: Login to application using valid account and  View users.
    And Click on profile icon
    And Click on manage users
    Then Click on Add Edit Groups

  Scenario: Login to application using valid account and  open Workflows
    And Click on profile icon
    And Click on Setups
    Then Click on Workflows

  Scenario: Login to application using valid account and  open Buttons.
    And Click on profile icon
    And Click on Setups
    Then Click on Buttons

  Scenario: Login to application using valid account and  open Job Sections.
    And Click on profile icon
    And Click on Setups
    Then Click on Job Sections

  Scenario: Login to application using valid account and  open Job List.
    And Click on profile icon
    And Click on Setups
    Then Click on Job List

  Scenario: Login to application using valid account and  open Exception Logs.
    And Click on profile icon
    And Click on Setups
    Then Click on Exception Logs

  Scenario: Login to application using valid account and  open Page Sections.
    And Click on profile icon
    And Click on Setups
    Then Click on Page Sections

  Scenario: Login to application using valid account and open Print PDF.
    And Click on profile icon
    And Click on Setups
    Then Click on Print PDF

  Scenario: Login to application using valid account and  open PDF Sections.
    And Click on profile icon
    And Click on Setups
    Then Click on PDF Sections

  Scenario: Login to application using valid account and  Open Mass Approve Jobs.
    And Click on profile icon
    And Click on Setups
    Then Click on Mass Approve Jobs

  Scenario: Login to application using valid account and  Open Mass Approve Jobs.
    And Click on profile icon
    And Click on Setups
    Then Click on Data Migration


  Scenario: Login to application using valid account and open Job Information.
    And Click on profile icon
    And Click on Sections
    Then Click on Email Setup

  Scenario: Login to application using valid account and open General Sections.
    And Click on profile icon
    And Click on Sections
    Then Click on General Sections

  Scenario: Login to application using valid account and open Education Sections.
    And Click on profile icon
    And Click on Sections
    Then Click on Education Sections

  Scenario: Login to application using valid account and open Competencies Sections.
    And Click on profile icon
    And Click on Sections
    Then Click on Competencies Sections

  Scenario: Login to application using valid account and open Search Competencies.
    And Click on profile icon
    And Click on Sections
    Then Click on Search Competencies

  Scenario: Login to application using valid account and open Competency Library.
    And Click on profile icon
    And Click on Sections
    Then Click on Competency Library

  Scenario: Login to application using valid account and open Competency Groups.
    And Click on profile icon
    And Click on Sections
    Then Click on Competency Groups

  Scenario: Login to application using valid account and open General Settings.
    And Click on profile icon
    And Click on Sections
    Then Click on General Settings
