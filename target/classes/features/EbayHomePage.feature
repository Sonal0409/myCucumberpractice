Feature: Ebay HomePage Test

  @Test1
  Scenario: Advanced search Page
    Given I am on Ebay Homepage
    When I click on advance link
    Then I navigate to Advance search Page

  @Test3
  Scenario: Search Item count
    Given I am on Ebay Home Page
    When I search for 'Iphone 11'
    Then I validate atleast 50 search items present

  @Test4
  Scenario: Search Item count
    Given I am on Ebay Home Page
    When I search for 'Toys Cars'
    Then I validate atleast 100 search items present

  @Test5
  Scenario: Search Item count
    Given I am on Ebay Home Page
    When I search for 'soap' from 'Baby' category
    
    @Test7
   Scenario Outline: Home Page links
    Given I am on Ebay Home Page
    When I Click on a '<link>'
    Then I validate the page navigated to '<url>' and title contains '<title>'
    
   Examples:
   |link|url|title|
   |Fashion|https://www.ebay.com/b/Fashion/bn_7000259856|Fashion|
   |Sports|https://www.ebay.com/b/Sporting-Goods/888/bn_1865031|Sporting|
 
    
    
    
    
    
    
    
    
    
    
    
    

  