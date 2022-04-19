<html>
<head>
<link href="assets/css/style.css" rel="stylesheet" type="text/css">
<script src="https://code.jquery.com/jquery-3.6.0.js"
	integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
	crossorigin="anonymous"></script>
<script type="text/javascript" src="assets/js/index.js"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<h2>Contador de Palavras:</h2>
	<div>
		<div class="painel-frase">
			<p>Digite ou cole o texto no campo abaixo:</p>
			<textarea id="txtFrase" rows="20" class="text-frase"></textarea>
			<button id="btnContar">Contar</button>
			<button id="btnLimpar">Limpar Texto</button>

			<div id="mostraResultados" class="mostra-Resultados">
				<ul id="listaPalavras">
				</ul>

			</div>

		</div>

	</div>

</body>
</html>
