numV = 4

a = [[True,True,False,False],[False,False,False,True],[True,False,True,False],[False,True,False,True]]

def Warshall(A,numV,W):
    for i in range(numV):
        for j in range(numV):
            W[i][j] = A[i][j]
    i=0
    j=0
    for k in range(numV):
        for i in range(numV):
            for j in range(numV):
                W[i][j] = W[i][j] or (W[i][k] and W[k][j])

def Alcanca(A,numV, v1, v2):
    W = [[0 for x in range(numV)]for y in range(numV)]
    Warshall(A,numV,W)
    print('Matriz Warshall: ' )
    print(W )
    print('\n')
    if W[v1][v2]:
        return True
    return False

vIni = ''
vFim = ''
while vIni not in [0, 1, 2, 3]: 
    vIni = int(input("Fale qual o vertice inicial: [0,1,2,3] \n"))
while vFim not in [0, 1, 2, 3]: 
    vFim = int(input("Digite o vertice final: [0,1,2,3] \n"))
print('\n')
if Alcanca(a,numV,vIni,vFim):
    print("Eh possivel ir do vertice "+ str(vIni)+ " para o " + str(vFim) + '!')
else:
    print("Nao ha conexao entre o vertice "+ str(vIni) + " e o vertice "+str(vFim)+'!')
