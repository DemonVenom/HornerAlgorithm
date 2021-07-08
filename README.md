# HornerAlgorithm

⦁	Implement Horner’s method for calculating a polynomial of degree n given a value of x and all of the coefficients (the ai terms) using an array of type double:
anxn + an-1xn-1 + an-2xn-2 + … + a2x2 + a1x + a0
where n is a positive int and an ≠ 0.
Prompt the user: 1) for the degree n (a positive int), 2) for the n+1 coefficients (of type double, beginning with an and ending with a0), and 3) for the value of x (of type double). The algorithm is as follows (the final value of the polynomial evaluated at x is b0):
bn = an;
bn-1 = an-1 + bnx;
bn-2 = an-2 + bn-1x;
…
b1 = a1 + b2x;
b0 = a0 + b1x;
You do not have to defensively code for user errors. It is recommended that you use 2 arrays: one for the ais and one for the bis. You may use a recursive algorithm or a standard loop. Display the result to the user.
Example: f(x) = y = 2x2 – 3x + 1 is a second-degree polynomial (n = 2), where a2 = 2, a1 = -3, and a0 = 1 (all doubles!). Evaluate the polynomial at x = -1 using Horner’s method; note that f(-1) =
2 *( -1)2 +( -3) *( -1) + 1 = 2 + 3 + 1 = 6. 
