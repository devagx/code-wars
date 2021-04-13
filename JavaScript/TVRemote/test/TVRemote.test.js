const {
    tvRemote
  } = require("../challenges/TVRemote");

describe("Sample Tests", function() {

  it("example", function() {
    Test.assertEquals(tvRemote("codewars"), 36);
  });
  
  it("misc", function() {
    Test.assertEquals(tvRemote("does"), 16);
    Test.assertEquals(tvRemote("your"), 23);
    Test.assertEquals(tvRemote("solution"), 33);
    Test.assertEquals(tvRemote("work"), 20);
    Test.assertEquals(tvRemote("for"), 12);
    Test.assertEquals(tvRemote("these"), 27);
    Test.assertEquals(tvRemote("words"), 25);
  });
  
});

