% EOM Simulation:
clc
clear all
close all

% Gravity vector
g = [0.0, 0.0, -9.81];

% Inputs

% Locations
lc = [
	% Position data from body scale for a joint hing1 relative to base
	0.5 0.0 -0.5 0 0;
	% Position data from body scale_1 for a joint hing2_1 relative to hing1
	0.5 0.0 -0.5 0 1;
	% Position data from body scale_2 for a joint hing2_2 relative to hing2_1
	0.5 0.0 -0.5 0 2;
	% Position data from body scale_3 for a joint hing2_3 relative to hing2_2
	0.5 0.0 -0.5 0 3;
	% Position data from body scale_4 for a joint hing2_4 relative to hing2_3
	0.5 0.0 -0.5 0 4;
	% Position data from body scale_5 for a joint hing2_5 relative to hing2_4
	0.5 0.0 -0.5 0 5;
	% Position data from body scale_6 for a joint hing2_6 relative to hing2_5
	0.5 0.0 -0.5 0 6;
	% Position data from body scale_7 for a joint hing2_7 relative to hing2_6
	0.5 0.0 -0.5 0 7;
	% Position data from load tip for a load tip relative to hing2_7
	1.0 0.0 -1.0 2 8;
];

% Mass values
m = [
	% scale
	1.0,
	% scale_1
	1.0,
	% scale_2
	1.0,
	% scale_3
	1.0,
	% scale_4
	1.0,
	% scale_5
	1.0,
	% scale_6
	1.0,
	% scale_7
	1.0];

% Inertia values
I = sym (zeros (3, 3, 8));
% Inertia for body scale
I (:, :, 1) = [
	1.0e-3 0.0 0.0;
	0.0 1.0e-3 0.0;
	0.0 0.0 1.0e-3];

% Inertia for body scale_1
I (:, :, 2) = [
	1.0e-3 0.0 0.0;
	0.0 1.0e-3 0.0;
	0.0 0.0 1.0e-3];

% Inertia for body scale_2
I (:, :, 3) = [
	1.0e-3 0.0 0.0;
	0.0 1.0e-3 0.0;
	0.0 0.0 1.0e-3];

% Inertia for body scale_3
I (:, :, 4) = [
	1.0e-3 0.0 0.0;
	0.0 1.0e-3 0.0;
	0.0 0.0 1.0e-3];

% Inertia for body scale_4
I (:, :, 5) = [
	1.0e-3 0.0 0.0;
	0.0 1.0e-3 0.0;
	0.0 0.0 1.0e-3];

% Inertia for body scale_5
I (:, :, 6) = [
	1.0e-3 0.0 0.0;
	0.0 1.0e-3 0.0;
	0.0 0.0 1.0e-3];

% Inertia for body scale_6
I (:, :, 7) = [
	1.0e-3 0.0 0.0;
	0.0 1.0e-3 0.0;
	0.0 0.0 1.0e-3];

% Inertia for body scale_7
I (:, :, 8) = [
	1.0e-3 0.0 0.0;
	0.0 1.0e-3 0.0;
	0.0 0.0 1.0e-3];

% Joint specifications
j = sym (zeros (5, 5, 9));
% Joint rotations for joint hing1
j (1:5, :, 1) = [
	0 0 1.0+0.0 1.0+0.0 1.0+1.0;
	1 pi/2.0 0 0 0;
	2 0.0 0 0 0;
	3 0.0 0 0 0
	1 inf 0 0 0];
% Joint rotations for joint hing2_1
j (1:3, :, 2) = [
	0 0 1.0 0.0 -1.0;
	2 pi/2.0 0 0 0
	1 inf 0 0 0];
% Joint rotations for joint hing2_2
j (1:3, :, 3) = [
	0 0 1.0 0.0 -1.0;
	2 pi/2.0 0 0 0
	1 inf 0 0 0];
% Joint rotations for joint hing2_3
j (1:3, :, 4) = [
	0 0 1.0 0.0 -1.0;
	2 pi/2.0 0 0 0
	1 inf 0 0 0];
% Joint rotations for joint hing2_4
j (1:3, :, 5) = [
	0 0 1.0 0.0 -1.0;
	2 pi/2.0 0 0 0
	1 inf 0 0 0];
% Joint rotations for joint hing2_5
j (1:3, :, 6) = [
	0 0 1.0 0.0 -1.0;
	2 pi/2.0 0 0 0
	1 inf 0 0 0];
% Joint rotations for joint hing2_6
j (1:3, :, 7) = [
	0 0 1.0 0.0 -1.0;
	2 pi/2.0 0 0 0
	1 inf 0 0 0];
% Joint rotations for joint hing2_7
j (1:3, :, 8) = [
	0 0 1.0 0.0 -1.0;
	2 pi/2.0 0 0 0
	1 inf 0 0 0];
% Joint rotations for load tip
j (1, :, 9) = [
	0 0 0 0 0];

% Stiffness data
jkd = sym (zeros (4, 2, 8));
% Stiffness values for joint hing1
jkd (1, :, 1) = [ 0.0 0.0 ];
jkd (2, 1, 1) = 0.1;
jkd (3, 1, 1) = 0.0;
jkd (4, 1, 1) = 0;

% Stiffness values for joint hing2_1
jkd (1, :, 2) = [ 0.0 0.0 ];
jkd (2, 1, 2) = 0.1;
jkd (3, 1, 2) = 0.0;
jkd (4, 1, 2) = 1;

% Stiffness values for joint hing2_2
jkd (1, :, 3) = [ 0.0 0.0 ];
jkd (2, 1, 3) = 0.1;
jkd (3, 1, 3) = 0.0;
jkd (4, 1, 3) = 1;

% Stiffness values for joint hing2_3
jkd (1, :, 4) = [ 0.0 0.0 ];
jkd (2, 1, 4) = 0.1;
jkd (3, 1, 4) = 0.0;
jkd (4, 1, 4) = 1;

% Stiffness values for joint hing2_4
jkd (1, :, 5) = [ 0.0 0.0 ];
jkd (2, 1, 5) = 0.1;
jkd (3, 1, 5) = 0.0;
jkd (4, 1, 5) = 1;

% Stiffness values for joint hing2_5
jkd (1, :, 6) = [ 0.0 0.0 ];
jkd (2, 1, 6) = 0.1;
jkd (3, 1, 6) = 0.0;
jkd (4, 1, 6) = 1;

% Stiffness values for joint hing2_6
jkd (1, :, 7) = [ 0.0 0.0 ];
jkd (2, 1, 7) = 0.1;
jkd (3, 1, 7) = 0.0;
jkd (4, 1, 7) = 1;

% Stiffness values for joint hing2_7
jkd (1, :, 8) = [ 0.0 0.0 ];
jkd (2, 1, 8) = 0.1;
jkd (3, 1, 8) = 0.0;
jkd (4, 1, 8) = 1;

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
