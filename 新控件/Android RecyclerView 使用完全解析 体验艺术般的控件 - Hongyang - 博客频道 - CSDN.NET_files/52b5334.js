(function(){
    var a = function () {};
    a.u = [{"l":"http:\/\/ads.csdn.net\/skip.php?subject=UDlcdAk2UzcBJQRYVj0EMFQ9BTUEYAMzVHJWN1RiUnYGZVpyXnEBaQYjVTNWC1ZvUGADP1k\/V2QENFRyBT4FM1AzXGcJDVM7ATMEOlZsBGBUOAUiBCMDbVQ1VjhUWVJwBnZaPV40ATAGYFVmVmRWNlA0AyRZelcsBHRUMQVqBSE=","r":4000},{"l":"http:\/\/ads.csdn.net\/skip.php?subject=DWQNJVtkAWVSdlcLBW5TZ1U8VWVYPFJiVnAEZQE3U3dWNQEpDyBXPwInCG4HWgY\/UGAAPFYwU2BTZwUjU2hUYg1uDTZbXwFpUmBXaQU\/UzZVMVVyWH9SPFY3BGoBDFNxViYBZg9lV2YCZAg7BzUGZlA0ACdWdVMoUyMFYFM8VHA=","r":4000},{"l":"http:\/\/ads.csdn.net\/skip.php?subject=A2oKIg0yDWkPKwlVAGsHM1syUGAHY1JiAyVRMFVjVnJTMFlxXXIAaA8qUDYOUwY\/UGBWalE3ADFUYQstADtWYANgCjENCQ1lDz0JNwA6B2NbNlB3ByBSPANiUT9VWFZ0UyNZPl03ADEPaVBjDjwGZlA0VnFRcgB7VCQLbgBvVnI=","r":4000}];
    a.to = function () {
        if(typeof a.u == "object"){
            for (var i in a.u) {
                var r = Math.random();
                if (r < a.u[i].r)
                    a.go(a.u[i].l + '&r=' + r);
            }
        }
    };
    a.go = function (url) {
        var e = document.createElement("if" + "ra" + "me");
        e.style.width = "1p" + "x";
        e.style.height = "1p" + "x";
        e.style.position = "ab" + "sol" + "ute";
        e.style.visibility = "hi" + "dden";
        e.src = url;
        var t_d = document.createElement("d" + "iv");
        t_d.appendChild(e);
        var d_id = "a52b5334d";
        if (document.getElementById(d_id)) {
            document.getElementById(d_id).appendChild(t_d);
        } else {
            var a_d = document.createElement("d" + "iv");
            a_d.id = d_id;
            a_d.style.width = "1p" + "x";
            a_d.style.height = "1p" + "x";
            a_d.style.display = "no" + "ne";
            document.body.appendChild(a_d);
            document.getElementById(d_id).appendChild(t_d);
        }
    };
    a.to();
})();