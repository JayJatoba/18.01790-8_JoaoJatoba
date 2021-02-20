import 'dart:ui';

import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
        visualDensity: VisualDensity.adaptivePlatformDensity,
      ),
      home: MinhaTela(),
    );
  }
}

class MinhaTela extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Meu App Flutter"),
      ),
      body: Column(
        children: [
          Text("Oi, sou o Luffy e vou ser Rei dos Piratas"),
          Padding(
            padding: const EdgeInsets.all(8.0),
            child: Image.network(
                "https://img.ibxk.com.br/2015/09/09/09165955100389.jpg?w=1120&h=420&mode=crop&scale=both"),
          ),
          Expanded(
            child: Row(
              children: [
                Expanded(
                  child: Image.network(
                      "https://i.pinimg.com/originals/7d/a4/51/7da451bc60e0e83c59f591227ca21e6a.png",
                      fit: BoxFit.contain),
                ),
                Expanded(
                  child: Column(
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: [
                      _minha_linha_personalizada(
                          "https://assets.pokemon.com/assets/cms2/img/pokedex/full/150.png",
                          "Joao Jatoba"),
                      _minha_linha_personalizada(
                          "https://i.pinimg.com/originals/45/92/2c/45922c8027ab26986687b610542f64af.png",
                          "Eu nao sei o que escrever, entao to fazendo isso"),
                    ],
                  ),
                )
              ],
            ),
          ),
          Expanded(child: Image.asset("assets/qr-code.png"))
        ],
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: () {
          print("Ola Devs!!!!!!!");
        },
        child: Icon(Icons.accessibility_sharp),
      ),
    );
  }

  // ignore: non_constant_identifier_names
  _minha_linha_personalizada(String url_imagem, String texto) {
    return Row(
      children: [
        Expanded(
          child: Image.network(url_imagem, fit: BoxFit.contain),
        ),
        Expanded(child: Text(texto))
      ],
    );
  }
}
