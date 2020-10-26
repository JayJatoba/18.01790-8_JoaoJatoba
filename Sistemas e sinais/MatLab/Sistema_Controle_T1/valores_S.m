function vector = valores_S()
%UNTITLED Summary of this function goes here
%   Detailed explanation goes here
real = [0:-.1:-10];
imag = [0:-.1:-10]*1i;

for c=1:length(real)
    junto(c) = real(c)+imag(c) ;
end

vector = [real;imag;junto];
end

