% EOM Simulation:
clc
clear all
close all

% Gravity vector
g = [9.81 * cos (pi  / 3.0), 0.0, 9.81 * sin (pi  / 3.0)]

% Inputs
m = [1.0, 1.0, 1.0, 1.5, 1.0, 1.0]

% Run program -- Should this really be generated?

% EOM:
[ M , T , Dd , fg , fj , rj , rc , vc , wc , ref , rcn ,  Tef , Tcn , Dcn , qf , uf ] = ...
	TMTEoM ( lc , m , I , j , jkd , g );

% numerical simulation
[ t , z , tfinal ] = SimEoM ( M , T , Dd , fg , fj , qf , uf , 1 );
plot ( t , z );
pause;

% animation
AnimEOM ( t , z , rj , qf , uf );
