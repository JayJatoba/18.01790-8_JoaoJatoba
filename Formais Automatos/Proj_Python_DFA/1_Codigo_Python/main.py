# Joao Guilherme Martins Jatoba 18.01790-8
# Andre Lebrao Aigner Ribeiro   18.00356-7



def simular_dfa(dfa, s):
    state = dfa.get('initial_state')
    accept = False
    str_original = s
    s = list(s)
    while len(s)>0:
        original = state # Estado anterior
        c = s.pop(0)
        if c not in dfa.get('sigma'):
            # Primeiro erro possível
            print('\nO símbolo ',c,' não pertence ao alfabeto do autômato!')
            s.insert(0,c)
            break

        if state not in dfa.get('states'):
            # Segundo erro possível
            print('\nO estado ',state,' não pertence ao conjunto de estados do autômato!')
            break

        state = dfa.get('delta').get((state, c))
        if state == None or state == '':
            # Terceiro erro possível
            print('\nNão foi possível realizar a transição de estado',original,'com entrada', c)
            break
        print("\n(",original,", '",c,"')->",state)
        
        
    if (state in dfa.get('final_states')) and (len(s) == 0):
        accept = True
        
    if accept:
        print('\nA cadeia ',str_original,' foi aceita pelo autômato!!')
    else:
        print('\nA cadeia ',str_original,' foi rejeitada pelo autômato!!')       

# Função de escolha dos usuário que lê o arquivo texto e 
# retorna um dicionário com os dados do autômato escolhido
def opcao_dfa():
    while True:
        # Dar ao usuário a escolha dos possíveis autômatos
        opcao = int(input('\nVoce tem 5 escolhas de autômatos, escolha um: (1,2,3,4,5)\n'))
        while opcao not in [1, 2, 3, 4,5]:
            opcao = int(input('\nEscolha um (1,2,3,4,5): \n'))
        # Switch case para cada um dos 4 autômatos
        if opcao ==1:
            with open('m1.dfa') as dfa_file:
                dfa_data = dfa_file.read()
                dfa = eval(dfa_data)
                # Reconhece binários divisíveis por 4

        elif opcao ==2:
            with open('m2.dfa') as dfa_file:
                dfa_data = dfa_file.read()
                dfa = eval(dfa_data)
                # slide 14/33

        elif opcao ==3:
            with open('m3.dfa') as dfa_file:
                dfa_data = dfa_file.read()
                dfa = eval(dfa_data)
                # slide 24/33

        elif opcao ==4:
            with open('m4.dfa') as dfa_file:
                dfa_data = dfa_file.read()
                dfa = eval(dfa_data)
                # slide 32/33
        
        else:
            with open('TesteObrig.dfa') as dfa_file:
                dfa_data = dfa_file.read()
                dfa = eval(dfa_data)
                # Teste obrigatório para números reais


        return dfa
        break

def main():
    dfa = opcao_dfa()
    
    opcao = 'S'
    while opcao == 'S':
        # Pede a entrada do automato
        s = input('Qual entrada vc quer testar? \n')
        simular_dfa(dfa,s) #Simula o autômato
        opcao = input('Quer testar mais alguma entrada? (S/N)\n').upper()
        while opcao not in ['S','N']: 
            #Se nao estiver dentro dos possíveis valores, repete a pergunta
            opcao = input('Escolher sim - S - ou nao - N.\n').upper()

while True:
    main()
    opcao = input('Quer trocar de automato? (S/N)\n').upper()
    while opcao not in ['S','N']:
        #Se nao estiver dentro dos possíveis valores, repete a pergunta
            opcao = input('Escolher sim - S - ou nao - N.\n').upper()
    if opcao == 'N':
        break
    



    

