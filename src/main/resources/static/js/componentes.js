$(document).ready(function() {

	$("#inteiro").maskNumber({integer: true, thousands: '.'});

	$("#bigdecimal").maskNumber({decimal: ',', thousands: '.'});

	$('.clockpicker').clockpicker(
	{
		placement: 'bottom',
		align: 'left',
		autoclose: true,
		'default': 'now'
	//,		donetext: 'Ok'
	});

	$('#data input').datepicker(
	{
		autoclose: 'true',
		language: 'pt-BR',
		todayBtn: 'linked',
		todayHighlight: 'true'
	});
	
});