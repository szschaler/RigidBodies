% EOM Simulation:
clc
clear all
close all

% Gravity vector
g = [9.81 * cos (pi  / 3.0), 0.0, 9.81 * sin (pi  / 3.0)]

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
	0.0 0.0 -0.5 0 5
	% Position data from body shank2 for a constraint foot2J relative to knee2
	% TODO: Check with Hadi that we're using the correct position data here.
	0.0 0.0 -0.5 0 4
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
I (:, :, 0) = [
	1.0e-3.0 0.0 0.0;
	0.0 1.0e-3.0 0.0;
	0.0 0.0 1.0e-3.0];

% Inertia for body thigh1
I (:, :, 1) = [
	1.0e-3.0 0.0 0.0;
	0.0 1.0e-3.0 0.0;
	0.0 0.0 1.0e-3.0];

% Inertia for body thigh2
I (:, :, 2) = [
	1.0e-3.0 0.0 0.0;
	0.0 1.0e-3.0 0.0;
	0.0 0.0 1.0e-3.0];

% Inertia for body shank2
I (:, :, 3) = [
	1.0e-3.0 0.0 0.0;
	0.0 1.0e-3.0 0.0;
	0.0 0.0 1.0e-3.0];

% Inertia for body torso
I (:, :, 4) = [
	2.0e-3.0 0.0 0.0;
	0.0 2.0e-3.0 0.0;
	0.0 0.0 2.0e-3.0];

% Inertia for body hand1
I (:, :, 5) = [
	1.0e-3.0 0.0 0.0;
	0.0 1.0e-3.0 0.0;
	0.0 0.0 1.0e-3.0];

% Inertia for body hand2
I (:, :, 6) = [
	1.0e-3.0 0.0 0.0;
	0.0 1.0e-3.0 0.0;
	0.0 0.0 1.0e-3.0];

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
