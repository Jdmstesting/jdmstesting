Feature: Login tests
  As User , I can login to JDMS and open all section links.

  Background: Home page of JDMS
    #Given Login form in login page
  @CMSTest
  Scenario: Login to application using valid account and  Open All Jobs.
    Then Click on All Jobs
  @CMSTest
  Scenario: Login to application using valid account and  Open My Jobs.
    Then Click on My Jobs
  @CMSTest
  Scenario: Login to application using valid account and  Open Ready for Review.
    Then Click on Ready for Review
  @CMSTest
  Scenario: Login to application using valid account and  Open Create Job.
    Then Click on Create Job
  @CMSTest
  Scenario: Login to application using valid account and Open Approved Job.
    Then Click on All Jobs
    Then Click on Approved
  @CMSTest
  Scenario: Login to application using valid account and Open In Progress Job.
    Then Click on All Jobs
    Then Click on In Progress
  @CMSTest
  Scenario: Login to application using valid account and Open Draft Job.
    Then Click on All Jobs
    Then Click on Draft

  Scenario: Login to application using valid account and Open Job.
    Then Click on All Jobs
    Then Click on Approved
    Then Click on Job

  Scenario: Login to application using valid account and  Open Print Preview.
    Then Click on All Jobs
    Then Click on Approved
    Then Click on Job
    Then Click on Print Preview

  Scenario: Login to application using valid account and  Open Job Information Sections.
    And Click on Home
    Then Click on All Jobs
    Then Click on Approved
    Then Click on Job
    Then Click on Job Information Sections

  Scenario: Login to application using valid account and  Open Job Requirement Sections.
    And Click on Home
    Then Click on All Jobs
    Then Click on Approved
    Then Click on Job
    Then Click on Job Requirement Sections

  Scenario: Login to application using valid account and  Open Job Attachments.
    And Click on Home
    Then Click on All Jobs
    Then Click on Approved
    Then Click on Job
    Then Click on Job Attachments

  Scenario: Login to application using valid account and  Open Download Print PDF.
    And Click on Home
    Then Click on All Jobs
    Then Click on Approved
    Then Click on Job
    Then Click on  DownloadPrint PDF

  Scenario: Login to application using valid account and  Open Print Word.
    And Click on Home
    Then Click on All Jobs
    Then Click on Approved
    Then Click on Job
    Then Click on Print Word

  Scenario: Login to application using valid account and  Open Email Job.
    And Click on Home
    Then Click on All Jobs
    Then Click on Approved
    Then Click on Job
    Then Click on Email Job

  Scenario: Login to application using valid account and  Open Edit.
    And Click on Home
    Then Click on All Jobs
    Then Click on Approved
    Then Click on Job
    Then Click on Edit

  Scenario: Login to application using valid account and  Open Position Information.
    And Click on Home
    Then Click on All Jobs
    Then Click on Approved
    Then Click on Job
    Then Click on Edit
    Then Click on Position Information

  Scenario: Login to application using valid account and  Open About the Job - Job Summary.
    And Click on Home
    Then Click on All Jobs
    Then Click on Approved
    Then Click on Job
    Then Click on Edit
    Then Click on About the Job - Job Summary

  Scenario: Login to application using valid account and  Open About the Job - Essential Responsibilities.
    And Click on Home
    Then Click on All Jobs
    Then Click on Approved
    Then Click on Job
    Then Click on Edit
    Then Click on About the Job - Essential Responsibilities

  Scenario: Login to application using valid account and  Open About the Job - Skills & Abilities.
    And Click on Home
    Then Click on All Jobs
    Then Click on Approved
    Then Click on Job
    Then Click on Edit
    Then Click on About the Job - Skills & Abilities

  Scenario: Login to application using valid account and  Open About You - Experience.
    And Click on Home
    Then Click on All Jobs
    Then Click on Approved
    Then Click on Job
    Then Click on Edit
    Then Click on About You - Experience

  Scenario: Login to application using valid account and  Open About You - Education.
    And Click on Home
    Then Click on All Jobs
    Then Click on Approved
    Then Click on Job
    Then Click on Edit
    Then Click on About You - Education

  Scenario: Login to application using valid account and About You - Certifications.
    And Click on Home
    Then Click on All Jobs
    Then Click on Approved
    Then Click on Job
    Then Click on Edit
    Then Click on About You - Certifications



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

  Scenario: Login to application using valid account and open Import.
    And Click on profile icon
    And Click on Setups
    Then Click on Import

  Scenario: Login to application using valid account and open Export Jobs.
    And Click on profile icon
    And Click on Setups
    Then Click on Export Jobs

  Scenario: Login to application using valid account and  open Export Sections.
    And Click on profile icon
    And Click on Setups
    Then Click on Export Sections

  Scenario: Login to application using valid account and  Open Mass Approve Jobs.
    And Click on profile icon
    And Click on Setups
    Then Click on Mass Approve Jobs

  Scenario: Login to application using valid account and  open Import & Export.
    And Click on profile icon
    And Click on Setups
    Then Click on Import & Export

  Scenario: Login to application using valid account and open Template Assignment.
    And Click on profile icon
    And Click on Setups
    Then Click on Template Assignment

  Scenario: Login to application using valid account and open Job Information.
    And Click on profile icon
    And Click on Sections
    Then Click on Job Information

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

