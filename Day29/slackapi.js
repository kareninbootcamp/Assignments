// var token = "xoxp-63743851541-69428240131-82793741921-2b0a9c3c3dbce5e8405c6a75d01f9160";
var selectedChannel;
//var slackToken = getSlackToken();
var messageText;

$(document).ready(function(){

  getChannels();

  $("#postMessage").click(function(){
    var messageText = $("#msgBox").val();
    var selectedChannel = $('input[name=channelGeneral]:checked').val();
    console.log(selectedChannel);
    console.log(messageText);
    if (selectedChannel !== '') {
      var slackToken = getSlackToken();
      $.ajax("https://api.slack.com/api/chat.postMessage", {
        method: "GET",
        data: {
          token: slackToken,
          channel: selectedChannel,
          text: messageText
        }
      }).then(function() {
        $("#msgBox").val("");
      });
    }


    });
  });

  
  function getChannels () {
        var leftSide = $("#left");
        var slackToken = getSlackToken();
        $.ajax("https://api.slack.com/api/channels.list?"+ slackToken, {
          Method: "POST",
          data: {
            token: slackToken
          }
        }).then(function(channelList) {
          console.log(channelList);
          for(var i=0; i<channelList.channels.length; i++) {
            var name = channelList.channels[i].name;
            var item = $('<input id="channel' + i + '" type="radio" name="channelGeneral" value="' +
              name + '">' + name + '</input><br><br>');
            leftSide.append(item);
          }
        });
  }
