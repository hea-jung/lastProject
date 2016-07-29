<%@page import="main.dto.MainDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<% MainDTO mainlist = (MainDTO)request.getAttribute("mainlist");
     System.out.println(mainlist);
  %>
 <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
    <script type="text/javascript" src="http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <link href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css"
    rel="stylesheet" type="text/css">
    <link href="http://pingendo.github.io/pingendo-bootstrap/themes/default/bootstrap.css"
    rel="stylesheet" type="text/css">
   <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
   <script type="text/javascript">
      google.charts.load('current', {'packages':['gauge']});
      google.charts.setOnLoadCallback(drawChart);
      function drawChart() {

        var data = google.visualization.arrayToDataTable([
          ['Label', 'Value'],
          ['신규창업위험도', <%=mainlist.risk %>],
        ]);

        var options = {
          width: 400, height: 300,
          redFrom: 75, redTo: 100,
          yellowFrom:50, yellowTo: 75,
          greenFrom:25, greenTo:50,
          minorTicks: 5
        };

        var chart = new google.visualization.Gauge(document.getElementById('chart_div'));

        chart.draw(data, options);

      }
    </script>
  </head>
<body>
	<div class="section">
      <div class="container">
        <div class="row">
          <div class="col-md-4">2015년 기준(<%=mainlist.region%>)
            <table class="table">
              <thead>
                <tr></tr>
                <tr></tr>
              </thead>
              <tbody>
                <tr>
                  <td>폐업신고율</td>
                  <td><%=mainlist.close_rate %>%</td>
                </tr>
                <tr>
                  <td>3년간개업대비폐업신고율</td>
                  <td><%=mainlist.close_rate_3year %>%</td>
                </tr>
                <tr>
                  <td>평균폐업기간</td>
                  <td><%=mainlist.close_avgyear %>년</td>
                </tr>
                <tr>
                  <td>점포증감률</td>
                  <td><%=mainlist.change_rate %>%</td>
                </tr>
              </tbody>
            </table>
          </div>
          <div class="col-md-4" id="chart_div" style="width: 400px; height: 120px;"></div>
        </div>
      </div>
    </div>
</body>
</html>