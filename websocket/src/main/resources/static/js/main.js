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
        stompClient.subscribe('/topic/getResponse', function(respnose){ //4 通过stompClient.subscribe（）订阅服务器的目标是'/topic/getResponse'发送过来的地址，与@SendTo中的地址对应。
            showResponse(JSON.parse(respnose.body).msg);
        });
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
    stompClient.send("/onMessage", {}, JSON.stringify({ 'msg': msg }));//5 通过stompClient.send（）向地址为"/welcome"的服务器地址发起请求，与@MessageMapping里的地址对应。
}

function showResponse(message) {
    var response = $("#response");
    response.html(message);
}