
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
