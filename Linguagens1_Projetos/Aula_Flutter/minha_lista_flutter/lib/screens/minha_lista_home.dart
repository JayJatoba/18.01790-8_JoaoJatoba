import 'package:flutter/material.dart';
import 'package:minha_lista_flutter/models/hero.dart';

class MinhaListaHome extends StatelessWidget {
  final _myHerosList = [
    myHero("All Might", "One for All",
        "https://static.wikia.nocookie.net/bokunoheroacademia/images/c/cd/Toshinori_Yagi_Golden_Age_Hero_Costume_%28Anime%29.png/revision/latest?cb=20190129015644"),
    myHero("Midoriya", "One for All",
        "https://comicvine1.cbsistatic.com/uploads/square_small/11117/111173561/5994041-8086170340-63780.jpg"),
    myHero("Bakugou", "Explosao",
        "https://img.favpng.com/0/5/11/my-hero-academia-eijirou-kirishima-tenya-iida-character-boku-no-hero-academia-smash-png-favpng-3cwat4m5L3Ggp2ntKy51q3BJN.jpg")
  ];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: ListView(
        children: [
          ListTile(
            title: Text(_myHerosList[0].nome),
            subtitle: Text(_myHerosList[0].quirk),
            leading: Image.network(_myHerosList[0].imagem),
          ),
          ListTile(
            title: Text(_myHerosList[1].nome),
            subtitle: Text(_myHerosList[1].quirk),
            leading: Image.network(_myHerosList[1].imagem),
          ),
          ListTile(
            title: Text(_myHerosList[2].nome),
            subtitle: Text(_myHerosList[2].quirk),
            leading: Image.network(_myHerosList[2].imagem),
          )
        ],
      ),
    );
  }
}

class MinhaListaHome2 extends StatelessWidget {
  final _myHerosList = [
    myHero("All Might", "One for All",
        "https://static.wikia.nocookie.net/bokunoheroacademia/images/c/cd/Toshinori_Yagi_Golden_Age_Hero_Costume_%28Anime%29.png/revision/latest?cb=20190129015644"),
    myHero("Midoriya", "One for All",
        "https://comicvine1.cbsistatic.com/uploads/square_small/11117/111173561/5994041-8086170340-63780.jpg"),
    myHero("Bakugou", "Explosao",
        "https://img.favpng.com/0/5/11/my-hero-academia-eijirou-kirishima-tenya-iida-character-boku-no-hero-academia-smash-png-favpng-3cwat4m5L3Ggp2ntKy51q3BJN.jpg"),
    myHero("Ochako", "Zero Gravity",
        "https://ovicio.com.br/wp-content/uploads/2019/10/20191028-uraraka-anime.jpg")
  ];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        body: ListView.builder(
      itemBuilder: (context, index) {
        return ListTile(
            title: Text(_myHerosList[index].nome),
            subtitle: Text(_myHerosList[index].quirk),
            leading: Image.network(_myHerosList[index].imagem));
      },
      itemCount: _myHerosList.length,
    ));
  }
}

class MinhaListaHome3 extends StatefulWidget {
  @override
  _MinhaListaHome3State createState() => _MinhaListaHome3State();
}

class _MinhaListaHome3State extends State<MinhaListaHome3> {
  final _myHerosList = [
    myHero("All Might", "One for All",
        "https://static.wikia.nocookie.net/bokunoheroacademia/images/c/cd/Toshinori_Yagi_Golden_Age_Hero_Costume_%28Anime%29.png/revision/latest?cb=20190129015644"),
    myHero("Midoriya", "One for All",
        "https://comicvine1.cbsistatic.com/uploads/square_small/11117/111173561/5994041-8086170340-63780.jpg"),
    myHero("Bakugou", "Explosao",
        "https://img.favpng.com/0/5/11/my-hero-academia-eijirou-kirishima-tenya-iida-character-boku-no-hero-academia-smash-png-favpng-3cwat4m5L3Ggp2ntKy51q3BJN.jpg"),
    myHero("Ochako", "Zero Gravity",
        "https://ovicio.com.br/wp-content/uploads/2019/10/20191028-uraraka-anime.jpg")
  ];

  final controladorNome = TextEditingController();

  final controladorQuirk = TextEditingController();

  final controladorUrlImagem = TextEditingController();

  @override
  Widget build(BuildContext context) {
    return SafeArea(
      child: Scaffold(
          body: Column(children: [
        SizedBox(
          width: 200,
          height: 100,
          child: Image.network(
              "https://upload.wikimedia.org/wikipedia/commons/c/cf/Boku_no_Hero_Academia_Logo.png"),
        ),
        meuTextFieldPersonalizado(controladorNome, "Informe o nome do heroi",
            "Nome: ", Icon(Icons.drive_file_rename_outline)),
        meuTextFieldPersonalizado(controladorQuirk, "Informe a quirk do heroi",
            "Quirk: ", Icon(Icons.drive_file_rename_outline)),
        meuTextFieldPersonalizado(
            controladorUrlImagem,
            "Informe a URL da imagem do heroi",
            "URL: ",
            Icon(Icons.drive_file_rename_outline)),
        FlatButton(
            onPressed: () {
              adicionar_novo_registro();
            },
            child: Text("Adicionar")),
        Expanded(
          child: ListView.builder(
            itemBuilder: (context, index) {
              return ListTile(
                  title: Text(_myHerosList[index].nome),
                  subtitle: Text(_myHerosList[index].quirk),
                  leading: Image.network(_myHerosList[index].imagem));
            },
            itemCount: _myHerosList.length,
          ),
        )
      ])),
    );
  }

  Widget meuTextFieldPersonalizado(
      TextEditingController controller, String hint, String label, Icon icone) {
    return Padding(
      padding: const EdgeInsets.all(8.0),
      child: TextField(
        controller: controller,
        decoration:
            InputDecoration(hintText: hint, labelText: label, icon: icone),
      ),
    );
  }

  void adicionar_novo_registro() {
    setState(() {
      _myHerosList.add(myHero(controladorNome.text, controladorQuirk.text,
          controladorUrlImagem.text));
      print(_myHerosList);
    });
  }
}
