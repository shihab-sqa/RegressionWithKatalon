<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>SmokeAutomation</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>b749c13a-a53d-43a1-83c4-d888af7215e7</testSuiteGuid>
   <testCaseLink>
      <guid>ed7027ee-e315-4f2e-8c1e-cc2debf7bc45</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/loginTest/TC001_UserLoginWithCorrectPassword</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>e2a124f3-a068-497c-b01d-487e50d08fce</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/loginTest/TC002_UserLoginWithIncorrectPassword</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>0bf9f5f6-be82-4476-85d0-e788536f92c5</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/loginTest/TC003_UserLoginWithUnregisteredEmail</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>5b8edd37-2fa7-40d6-ac3b-91c28a4aebad</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/loginTest/TC004_UserLoginWithInvalidEmail</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>90b2078e-beb6-48d0-82b9-5637d502f2b7</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <iterationNameVariable>
         <defaultValue>findTestData('LoginData/UserLoginData')</defaultValue>
         <description></description>
         <id>29ea1a14-2b3c-48e1-a21e-a59088370c72</id>
         <masked>true</masked>
         <name>email</name>
      </iterationNameVariable>
      <testCaseId>Test Cases/loginTest/TC005_UserLoginWithValidInvalidEmailAndPassword</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>62877f46-be66-45ed-bf73-94c27c19a249</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/LoginData/UserLoginData</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>62877f46-be66-45ed-bf73-94c27c19a249</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>email</value>
         <variableId>29ea1a14-2b3c-48e1-a21e-a59088370c72</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>62877f46-be66-45ed-bf73-94c27c19a249</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>ecaf51d7-1108-467d-889a-5d7a0add0579</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
