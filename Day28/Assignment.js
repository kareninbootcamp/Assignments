$(document).ready(function(e){
    var startingNumber = 0;
  //  var textBox = $("#count");

    $("#number").val(startingNumber);
    $("#increase").click(function(){
      console.log("increasing")
      startingNumber++;
      $("#number").val(startingNumber);

      if (startingNumber > 7) {
       $("#number").addClass("greaterthan8");
      }
    });

    $("#decrease").click(function(){
      startingNumber--;
      $("#number").val(startingNumber);

      if (startingNumber < 8) {
       $("#number").removeClass("greaterthan8");
      }
    });

    $("#reset").click(function(){
      startingNumber = 0;
      $("#number").val(startingNumber);
      if (startingNumber < 8) {
       $("#number").removeClass("greaterthan8");
      }
    });

    console.log("checking")

    console.log("here")

});
