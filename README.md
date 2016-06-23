# Automatos_Trabalho2
TRABALHO 2

Implementar computacionalmente, em linguagem acordada com o professor, um
programa que reconheça a linguagem denotada pela linguagem regular:

(a+b)*a(a+b)(a+b)

Para tanto, você deve projetar o AFD da linguagem, que deverá sem apresentado
no programa ou em arquivo pdf. Em seguida, implementar em código-fonte a
função de transição do AFD e a função de transição estendida.

Definimos δ, função de transição estendida, por indução sobre o comprimento
da palavra de entrada.

• BASE: δ(q,ε)=q

Isto é, se estamos no estado q e lemos nenhuma entrada, então ainda
continuamos no estado q.


• INDUÇÃO: Suponha que w é uma palavra da forma xa, ou seja, a é o
último símbolo de w, e x é a palavra que consiste em tudo, menos o último
símbolo. Por exemplo, w=1101 é desmembrado em x=110 e a=1. Assim, o
passo de indução é:

δ(q,w) = δ(δ(q,x),a)
