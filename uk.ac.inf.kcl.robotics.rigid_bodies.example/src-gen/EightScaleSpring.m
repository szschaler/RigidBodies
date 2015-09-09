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
	% Position data from body scale1 for a joint hing21 relative to hing1
	0.5 0.0 -0.5 0 1;
	% Position data from body scale2 for a joint hing22 relative to hing21
	0.5 0.0 -0.5 0 2;
	% Position data from body scale3 for a joint hing23 relative to hing22
	0.5 0.0 -0.5 0 3;
	% Position data from body scale4 for a joint hing24 relative to hing23
	0.5 0.0 -0.5 0 4;
	% Position data from body scale5 for a joint hing25 relative to hing24
	0.5 0.0 -0.5 0 5;
	% Position data from body scale6 for a joint hing26 relative to hing25
	0.5 0.0 -0.5 0 6;
	% Position data from body scale7 for a joint hing27 relative to hing26
	0.5 0.0 -0.5 0 7;
	% Position data from load tip for a load tip relative to hing27
	1.0 0.0 -1.0 2 8;
];

% Mass values
m = [
	% scale
	1.0,
	% scale1
	1.0,
	% scale2
	1.0,
	% scale3
	1.0,
	% scale4
	1.0,
	% scale5
	1.0,
	% scale6
	1.0,
	% scale7
	1.0];

% Inertia values
I = sym (zeros (3, 3, 8));
% Inertia for body scale
I (:, :, 1) = [
	1.0e-3 0.0 0.0;
	0.0 1.0e-3 0.0;
	0.0 0.0 1.0e-3];

% Inertia for body scale1
I (:, :, 2) = [
	1.0e-3 0.0 0.0;
	0.0 1.0e-3 0.0;
	0.0 0.0 1.0e-3];

% Inertia for body scale2
I (:, :, 3) = [
	1.0e-3 0.0 0.0;
	0.0 1.0e-3 0.0;
	0.0 0.0 1.0e-3];

% Inertia for body scale3
I (:, :, 4) = [
	1.0e-3 0.0 0.0;
	0.0 1.0e-3 0.0;
	0.0 0.0 1.0e-3];

% Inertia for body scale4
I (:, :, 5) = [
	1.0e-3 0.0 0.0;
	0.0 1.0e-3 0.0;
	0.0 0.0 1.0e-3];

% Inertia for body scale5
I (:, :, 6) = [
	1.0e-3 0.0 0.0;
	0.0 1.0e-3 0.0;
	0.0 0.0 1.0e-3];

% Inertia for body scale6
I (:, :, 7) = [
	1.0e-3 0.0 0.0;
	0.0 1.0e-3 0.0;
	0.0 0.0 1.0e-3];

% Inertia for body scale7
I (:, :, 8) = [
	1.0e-3 0.0 0.0;
	0.0 1.0e-3 0.0;
	0.0 0.0 1.0e-3];

% Joint specifications
j = sym (zeros (3, 5, 9));
% Joint rotations for joint hing1
j (1:2, :, 1) = [
	0 0 0.0 0.0 1.0;
	1 inf 0 0 0];
% Joint rotations for joint hing21
j (1:3, :, 2) = [
	0 0 1.0 0.0 -1.0;
	2 pi/2.0 0 0 0
	1 inf 0 0 0];
% Joint rotations for joint hing22
j (1:3, :, 3) = [
	0 0 1.0 0.0 -1.0;
	2 pi/2.0 0 0 0
	1 inf 0 0 0];
% Joint rotations for joint hing23
j (1:3, :, 4) = [
	0 0 1.0 0.0 -1.0;
	2 pi/2.0 0 0 0
	1 inf 0 0 0];
% Joint rotations for joint hing24
j (1:3, :, 5) = [
	0 0 1.0 0.0 -1.0;
	2 pi/2.0 0 0 0
	1 inf 0 0 0];
% Joint rotations for joint hing25
j (1:3, :, 6) = [
	0 0 1.0 0.0 -1.0;
	2 pi/2.0 0 0 0
	1 inf 0 0 0];
% Joint rotations for joint hing26
j (1:3, :, 7) = [
	0 0 1.0 0.0 -1.0;
	2 pi/2.0 0 0 0
	1 inf 0 0 0];
% Joint rotations for joint hing27
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

% Stiffness values for joint hing21
jkd (1, :, 2) = [ 0.0 0.0 ];
jkd (2, 1, 2) = 0.1;
jkd (3, 1, 2) = 0.0;
jkd (4, 1, 2) = 1;

% Stiffness values for joint hing22
jkd (1, :, 3) = [ 0.0 0.0 ];
jkd (2, 1, 3) = 0.1;
jkd (3, 1, 3) = 0.0;
jkd (4, 1, 3) = 1;

% Stiffness values for joint hing23
jkd (1, :, 4) = [ 0.0 0.0 ];
jkd (2, 1, 4) = 0.1;
jkd (3, 1, 4) = 0.0;
jkd (4, 1, 4) = 1;

% Stiffness values for joint hing24
jkd (1, :, 5) = [ 0.0 0.0 ];
jkd (2, 1, 5) = 0.1;
jkd (3, 1, 5) = 0.0;
jkd (4, 1, 5) = 1;

% Stiffness values for joint hing25
jkd (1, :, 6) = [ 0.0 0.0 ];
jkd (2, 1, 6) = 0.1;
jkd (3, 1, 6) = 0.0;
jkd (4, 1, 6) = 1;

% Stiffness values for joint hing26
jkd (1, :, 7) = [ 0.0 0.0 ];
jkd (2, 1, 7) = 0.1;
jkd (3, 1, 7) = 0.0;
jkd (4, 1, 7) = 1;

% Stiffness values for joint hing27
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
