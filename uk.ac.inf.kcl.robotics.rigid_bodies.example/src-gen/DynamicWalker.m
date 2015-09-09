% EOM Simulation:
clc
clear all
close all

% Gravity vector
g = [9.81*cos(pi/3.0), 0.0, 9.81*sin(pi/3.0)];

% Inputs

% Locations
lc = [
	% Position data from body shank1 for a joint ankle relative to base
	0.0 0.0 0.5 0 0;
	% Position data from body thigh1 for a joint knee1 relative to ankle
	0.0 0.0 0.5 0 1;
	% Position data from body thigh2 for a joint hip1 relative to knee1
	0.0 0.0 -0.5 0 2;
	% Position data from body shank2 for a joint knee2 relative to hip1
	0.0 0.0 -0.5 0 3;
	% Position data from body torso for a joint hip2 relative to knee1
	0.0 0.0 0.5 0 2;
	% Position data from body hand1 for a joint shoulder1 relative to hip2
	0.0 0.0 -0.5 0 5;
	% Position data from body hand2 for a joint shoulder2 relative to hip2
	0.0 0.0 -0.5 0 5;
	% Position data from body shank2 for a constraint foot2J relative to knee2
	% TODO: Check with Hadi that we're using the correct position data here.
	0.0 0.0 -0.5 1 4;
	% Position data from load foot2L for a load foot2L relative to knee2
	0.0 0.0 -1.0 2 4;
	% Position data from load foot1L for a load foot1L relative to ankle
	0.0 0.0 0.0 2 1;
];

% Mass values
m = [
	% shank1
	1.0,
	% thigh1
	1.0,
	% thigh2
	1.0,
	% shank2
	1.0,
	% torso
	1.5,
	% hand1
	1.0,
	% hand2
	1.0];

% Inertia values
I = sym (zeros (3, 3, 7));
% Inertia for body shank1
I (:, :, 1) = [
	1.0e-3 0.0 0.0;
	0.0 1.0e-3 0.0;
	0.0 0.0 1.0e-3];

% Inertia for body thigh1
I (:, :, 2) = [
	1.0e-3 0.0 0.0;
	0.0 1.0e-3 0.0;
	0.0 0.0 1.0e-3];

% Inertia for body thigh2
I (:, :, 3) = [
	1.0e-3 0.0 0.0;
	0.0 1.0e-3 0.0;
	0.0 0.0 1.0e-3];

% Inertia for body shank2
I (:, :, 4) = [
	1.0e-3 0.0 0.0;
	0.0 1.0e-3 0.0;
	0.0 0.0 1.0e-3];

% Inertia for body torso
I (:, :, 5) = [
	2.0e-3 0.0 0.0;
	0.0 2.0e-3 0.0;
	0.0 0.0 2.0e-3];

% Inertia for body hand1
I (:, :, 6) = [
	1.0e-3 0.0 0.0;
	0.0 1.0e-3 0.0;
	0.0 0.0 1.0e-3];

% Inertia for body hand2
I (:, :, 7) = [
	1.0e-3 0.0 0.0;
	0.0 1.0e-3 0.0;
	0.0 0.0 1.0e-3];

% Joint specifications
j = sym (zeros (4, 5, 10));
% Joint rotations for joint ankle
j (1, :, 1) = [
	2 inf 0 0 0];
% Joint rotations for joint knee1
j (1:2, :, 2) = [
	0 0 0.0 0.0 1.0;
	2 inf 0 0 0];
% Joint rotations for joint hip1
j (1:2, :, 3) = [
	0 0 0.0 1.0 1.0;
	2 inf 0 0 0];
% Joint rotations for joint knee2
j (1:2, :, 4) = [
	0 0 0.0 0.0 -1.0;
	2 inf 0 0 0];
% Joint rotations for joint hip2
j (1:4, :, 5) = [
	0 0 0.0 0.5 -1.0;
	2 inf 0 0 0;
	1 inf 0 0 0;
	3 inf 0 0 0];
% Joint rotations for joint shoulder1
j (1:2, :, 6) = [
	0 0 0.0 -0.25 1.0;
	1 inf 0 0 0];
% Joint rotations for joint shoulder2
j (1:2, :, 7) = [
	0 0 0.0 0.25 1.0;
	1 inf 0 0 0];
% Joint rotations for constraint joint foot2J
j (1:2, :, 8) = [
	0 0 0.0 0.0 -1.0;
	2 inf 0 0 0];
% Joint rotations for load foot2L
j (1, :, 9) = [
	0 0 0 0 0];
% Joint rotations for load foot1L
j (1, :, 10) = [
	0 0 0 0 0];

% Stiffness data
jkd = sym (zeros (4, 2, 10));
% Stiffness values for joint ankle
jkd (1, :, 1) = [ 5.0 5.0 ];
jkd (2, 1, 1) = 5.0;
jkd (3, 1, 1) = 5.0;
jkd (4, 1, 1) = -3;

% Stiffness values for joint knee1
jkd (1, :, 2) = [ 5.0 5.0 ];
jkd (2, 1, 2) = 5.0;
jkd (3, 1, 2) = 5.0;
jkd (4, 1, 2) = -3;

% Stiffness values for joint hip1
jkd (1, :, 3) = [ 5.0 5.0 ];
jkd (2, 1, 3) = 5.0;
jkd (3, 1, 3) = 5.0;
jkd (4, 1, 3) = -3;

% Stiffness values for joint knee2
jkd (1, :, 4) = [ 5.0 5.0 ];
jkd (2, 1, 4) = 5.0;
jkd (3, 1, 4) = 5.0;
jkd (4, 1, 4) = -3;

% Stiffness values for joint hip2
jkd (1, :, 5) = [ 5.0 5.0 ];
jkd (2, 1, 5) = 5.0;
jkd (3, 1, 5) = 5.0;
jkd (4, 1, 5) = -3;

jkd (1, :, 6) = [ 5.0 5.0 ];
jkd (2, 1, 6) = 5.0;
jkd (3, 1, 6) = 5.0;
jkd (4, 1, 6) = -3;

jkd (1, :, 7) = [ 5.0 5.0 ];
jkd (2, 1, 7) = 5.0;
jkd (3, 1, 7) = 5.0;
jkd (4, 1, 7) = -3;

% Stiffness values for joint shoulder1
jkd (1, :, 8) = [ 5.0 5.0 ];
jkd (2, 1, 8) = 5.0;
jkd (3, 1, 8) = 5.0;
jkd (4, 1, 8) = -3;

% Stiffness values for joint shoulder2
jkd (1, :, 9) = [ 5.0 5.0 ];
jkd (2, 1, 9) = 5.0;
jkd (3, 1, 9) = 5.0;
jkd (4, 1, 9) = -3;

% Stiffness values for constraint joint foot2J
jkd (1, :, 10) = [ 5.0 5.0 ];
jkd (2, 1, 10) = 5.0;
jkd (3, 1, 10) = 5.0;
jkd (4, 1, 10) = -3;

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
