
$(document).ready(function() {
	$("#btnContar").click(function() {

		var texto = $("#txtFrase").val();
		if (texto === '')
			$("#listaPalavras").html('<li>Nenhuma palavra foi inserida.</li>');
		else
			InfoByDate(texto);
	});

	$("#btnLimpar").click(function() {

		$("#txtFrase").val("");
	});
});


function InfoByDate(texto) {


	var soapMessage =
		'<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/" \
    xmlns:ns0="http://decioazevedo.com.br/"> \
    <SOAP-ENV:Header/> \
    <SOAP-ENV:Body> \
        <ns0:ContarPalavras> \
            <arg0>' + texto + '</arg0> \
        </ns0:ContarPalavras> \
    </SOAP-ENV:Body> \
</SOAP-ENV:Envelope>';

	$.ajax({
		type: "POST",
		url: "http://localhost:8080/contador-palavras-ws/ContadorPalavrasService",
		data: soapMessage,
		datatype: "xml",
		contentType: "text/xml; charset=\"utf-8\"",
		processData: false,
		success: xmlParser,
		error: function(e) {
			console.log(e);
		}
	});
}

function xmlParser(xml) {
	x = xml.getElementsByTagName("ns2:ContarPalavrasResponse")[0];

	var totalPalavras = 0;
	var li = "";

	$(x).find("return").each(function(index, value) {

		var $palavra = $($(value)[0]).find("palavra").text();
		var $contagem = $($(value)[0]).find("contagem").text();

		totalPalavras += parseInt($contagem);

		li += '<li>' + $palavra + ' - ' + $contagem + ' ocorr&ecirc;ncia(s)</li>';

	})

	$("#listaPalavras").html(li + '<li>Total de palavras no texto: ' + totalPalavras + '</li>');



}
