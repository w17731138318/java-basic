var stompClient = null;

function setConnected(connected) {
    document.getElementById('connect').disabled = connected;
    document.getElementById('disconnect').disabled = !connected;
    document.getElementById('conversationDiv').style.visibility = connected ? 'visible' : 'hidden';
    $('#response').html();
}

function connect() {
    var socket = new SockJS('http://localhost:8080/webSocketStompEndpoint'); //1 连接SockJS的endpoint是“webSocketStompEndpoint”，与后台代码中注册的endpoint要一样。
    stompClient = Stomp.over(socket);//2 创建STOMP协议的webSocket客户端。
    stompClient.connect({}, function(frame) {//3 连接webSocket的服务端。
        setConnected(true);
        console.log('开始进行连接Connected: ' + frame);
        stompClient.subscribe('/user/topic/greetings1', function (respnose) {
            console.log(respnose);
            showResponse(JSON.parse(respnose.body).msg);
        });
        // stompClient.subscribe('/topic/greetings2', function (respnose) {
        //     console.log(respnose);
        //     showResponse(JSON.parse(respnose.body).msg);
        // });
    });
}


function disconnect() {
    if (stompClient != null) {
        stompClient.disconnect();
    }
    setConnected(false);
    console.log("Disconnected");
}

function sendName() {
    var msg = $('#msg').val();
    stompClient.send("/app/handle1",{},JSON.stringify({ 'msg': msg }));
}
function sendAllName() {
    var msg = $('#msg').val();
    stompClient.send("/app/handle2",{},JSON.stringify({ 'msg': msg }));
}

function showResponse(message) {
    console.log(message);
    var response = $("#response");
    response.html(message);
}