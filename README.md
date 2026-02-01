# Docking Center Logistics System

## Overview

This project models the logistics processes of a **Docking Center (DC)** using Java. The DC is responsible for receiving pallets from Receiving Points (RPs), separating packages by delivery region, and preparing pallets for dispatch to their final destinations.

## Logistics Scenario

Sellers from all over the country send packages to **Receiving Points (RPs)** located in their respective states. At the RPs, packages are grouped onto pallets and sent to a **Docking Center (DC)**.

At the DC, packages are separated by delivery regions:
- **RA** – Region A  
- **RB** – Region B  
- **RC** – Region C  
- **RD** – Region D  

Once separated, pallets containing packages for the same region are dispatched to the regions where the clients live.

## System Scope

This Java application focuses exclusively on the **Docking Center (DC) processes**, simulating how Logistic Operators interact with packages, Digital Positions, and pallets.

## Core Concepts

- **Package**: An individual shipment unit.
- **Logistic Operator (LO)**: A user who performs receiving and separation operations.
- **Digital Position (DP)**: A temporary virtual location where packages are grouped during separation.
- **Pallet**: A physical grouping of packages ready for dispatch.
- **Region**: The delivery area (RA, RB, RC, RD).

## DC Processes

The system supports the following operations:

1. **Receiving**
   - Logistic Operators can start the receiving process.
   - All packages change their status to `Receiving`.
   - Once completed, package status changes to `Received`.

2. **Separation Setup**
   - When an LO starts separating packages onto a pallet, they scan a **Digital Position (DP)**.
   - Each DP is associated with a specific delivery region.
   - All packages assigned to a DP must belong to the same region.

3. **Package Scanning**
   - When an LO scans a package into a DP, the package status changes to `Separating`.

4. **Package Assignment Rule**
   - A package cannot be assigned to more than one DP at the same time.

5. **Dispatch Restriction**
   - A pallet cannot be dispatched while its associated DP is in `Separating` status.

6. **Pallet Separation Completion**
   - When an LO finishes separating a pallet, they mark it as `Separated`.
   - The pallet is unlinked from the DP.
   - The pallet receives a unique ticket for identification.

7. **Pallet Editing**
   - Separated pallets can be accessed and edited by scanning their ticket.

## Purpose

I am currently working as a Logistics Assistant, and this project was inspired by the real-world processes I observe and work with on a daily basis. The goal is to translate these day-to-day logistics operations into a Java-based system, modeling practical workflows, constraints, and business rules found in a Docking Center environment.


